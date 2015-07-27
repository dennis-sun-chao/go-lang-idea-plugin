
package com.goide.dlv.protocol;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Api {
  // DebuggerState represents the current context of the debugger.
  public class DebuggerState {
    // Breakpoint is the current breakpoint at which the debugged process is
    // suspended, and may be empty if the process is not suspended.
    public Breakpoint breakPoint; //`json:"breakPoint,omitempty"`
    // CurrentThread is the currently selected debugger thread.
    public Thread currentThread; //`json:"currentThread,omitempty"`
    // Information requested by the current breakpoint
    public BreakpointInfo breakpointInfo; //`json:"breakPointInfo,omitrempty"`
    // Exited indicates whether the debugged process has exited.
    public boolean exited; //`json:"exited"`
    public int exitStatus; //`json:"exitStatus"`
    // Filled by RPCClient.Continue, indicates an error
    public String err; //`json:"-"` // todo: should be error
  }

  // Breakpoint addresses a location at which process execution may be
  // suspended.
  public class Breakpoint {
    // ID is a unique identifier for the breakpoint.
    public int id; //`json:"id"`
    // Addr is the address of the breakpoint.
    public int addr; //`json:"addr"`
    // File is the source file for the breakpoint.
    public String file; //`json:"file"`
    // Line is a line in File for the breakpoint.
    public int line; //`json:"line"`
    // FunctionName is the name of the function at the current breakpoint, and
    // may not always be available.
    public String functionName; //`json:"functionName,omitempty"`
    // tracepoint flag
    @SerializedName("continue")
    public boolean tracepoint; //`json:"continue"`
    // number of stack frames to retrieve
    public int stacktrace; //`json:"stacktrace"`
    // retrieve goroutine information
    public boolean goroutine; //`json:"goroutine"`
    // variables to evaluate
    public List<String> variables; //`json:"variables,omitempty"`
  }

  // Thread is a thread within the debugged process.
  public class Thread {
    // ID is a unique identifier for the thread.
    public int id; //`json:"id"`
    // PC is the current program counter for the thread.
    public int pc; //`json:"pc"`
    // File is the file for the program counter.
    public String file; //`json:"file"`
    // Line is the line number for the program counter.
    public int line; //`json:"line"`
    // Function is function information at the program counter. May be nil.
    public Function function; //`json:"function,omitempty"`
  }

  public class Location {
    public int pc; //`json:"pc"`
    public String file; //`json:"file"`
    public int line; //`json:"line"`
    public Function function; //`json:"function,omitempty"`
  }

  // Function represents thread-scoped function information.
  public class Function {
    // Name is the function name.
    public String name; //`json:"name"`
    public int value; //`json:"value"`
    @SerializedName("class")
    public byte clazz; //`json:"class"`
    public int goclass; //`json:"goclass"`
    // Args are the function arguments in a thread context.
    public List<Variable> args; //`json:"args"`
    // Locals are the thread local variables.
    public List<Variable> locals; //`json:"locals"`
  }

  // Variable describes a variable.
  public class Variable {
    public String name; //`json:"name"`
    public String value; //`json:"value"`
    @SerializedName("class")
    public String clazz; //`json:"class"`
  }

  // Goroutine represents the information relevant to Delve from the runtime's
  // internal G structure.
  public class Goroutine {
    // ID is a unique identifier for the goroutine.
    public int id; //`json:"id"`
    // PC is the current program counter for the goroutine.
    public int pc; //`json:"pc"`
    // File is the file for the program counter.
    public String file; //`json:"file"`
    // Line is the line number for the program counter.
    public int line; //`json:"line"`
    // Function is function information at the program counter. May be nil.
    public Function function; //`json:"function,omitempty"`
  }

  // DebuggerCommand is a command which changes the debugger's execution state.
  public class DebuggerCommand {
    // Name is the command to run.
    public String name; //`json:"name"`
    // ThreadID is used to specify which thread to use with the SwitchThread
    // command.
    public int threadID; //`json:"threadID,omitempty"`
  }

  // Informations about the current breakpoint
  public class BreakpointInfo {
    public List<Location> stacktrace; //`json:"stacktrace,omitempty"`
    public Goroutine goroutine; //`json:"goroutine,omitempty"`
    public List<Variable> variables; //`json:"variables,omitempty"`
  }

  public static String CONTINUE = "continue";
  public static String STEP = "step";
  public static String NEXT = "next";
  public static String SWITCH_THREAD = "switchThread";
  public static String HALT = "halt";
}