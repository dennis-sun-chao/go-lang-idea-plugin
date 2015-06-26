/*
 * Copyright 2013-2015 Sergey Ignatov, Alexander Zolotov, Mihai Toader, Florin Patan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.goide.appengine.run;

import com.goide.runconfig.GoModuleBasedConfiguration;
import com.goide.runconfig.GoRunConfigurationBase;
import com.goide.sdk.GoSdkService;
import com.intellij.execution.configurations.*;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.JDOMExternalizerUtil;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.openapi.util.text.StringUtil;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GoAppEngineRunConfiguration extends GoRunConfigurationBase<GoAppEngineRunningState> {
  private static final String HOST_NAME = "HOST";
  private static final String PORT_NAME = "PORT";
  private static final String ADMIN_PORT_NAME = "ADMIN_PORT";

  @Nullable private String myHost;
  @Nullable private String myPort;
  @Nullable private String myAdminPort;

  public GoAppEngineRunConfiguration(@NotNull Project project, String name, @NotNull ConfigurationType configurationType) {
    super(name, new GoModuleBasedConfiguration(project), configurationType.getConfigurationFactories()[0]);
  }

  @Nullable
  public String getHost() {
    return myHost;
  }

  public void setHost(@Nullable String host) {
    myHost = host;
  }

  @Nullable
  public String getPort() {
    return myPort;
  }

  public void setPort(@Nullable String port) {
    myPort = port;
  }
  
  @Nullable
  public String getAdminPort() {
    return myAdminPort;
  }

  public void setAdminPort(@Nullable String adminPort) {
    myAdminPort = adminPort;
  }

  @Override
  public void readExternal(@NotNull Element element) throws InvalidDataException {
    super.readExternal(element);
    myHost = JDOMExternalizerUtil.getFirstChildValueAttribute(element, HOST_NAME);
    myPort = JDOMExternalizerUtil.getFirstChildValueAttribute(element, PORT_NAME);
    myAdminPort = JDOMExternalizerUtil.getFirstChildValueAttribute(element, ADMIN_PORT_NAME);
  }

  @Override
  public void writeExternal(Element element) throws WriteExternalException {
    super.writeExternal(element);
    if (StringUtil.isNotEmpty(myHost)) {
      JDOMExternalizerUtil.addElementWithValueAttribute(element, HOST_NAME, myHost);
    }
    if (StringUtil.isNotEmpty(myPort)) {
      JDOMExternalizerUtil.addElementWithValueAttribute(element, PORT_NAME, String.valueOf(myPort));
    }
    if (StringUtil.isNotEmpty(myAdminPort)) {
      JDOMExternalizerUtil.addElementWithValueAttribute(element, ADMIN_PORT_NAME, String.valueOf(myAdminPort));
    }
  }

  @Override
  public void checkConfiguration() throws RuntimeConfigurationException {
    super.checkConfiguration();

    final Module module = getConfigurationModule().getModule();
    if (module != null) {
      if (!GoSdkService.isAppEngineSdkPath(GoSdkService.getInstance(module.getProject()).getSdkHomePath(module))) {
        throw new RuntimeConfigurationWarning("Go SDK is not specified for module '" + module.getName() + "'");
      }
    }

    if (StringUtil.isNotEmpty(myPort)) {
      int port = StringUtil.parseInt(myPort, -1);
      if (port < 0 || port > Short.MAX_VALUE * 2) {
        throw new RuntimeConfigurationError("Invalid port");
      }
    }
  }

  @NotNull
  @Override
  protected ModuleBasedConfiguration createInstance() {
    return new GoAppEngineRunConfiguration(getProject(), getName(), GoAppEngineRunConfigurationType.getInstance());
  }

  @NotNull
  @Override
  public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
    return new GoAppEngineRunConfigurationEditor(getProject());
  }

  @NotNull
  @Override
  protected GoAppEngineRunningState newRunningState(@NotNull ExecutionEnvironment env, @NotNull Module module) {
    return new GoAppEngineRunningState(env, module, this);
  }
}
