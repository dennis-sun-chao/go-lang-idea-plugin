/*
 * Copyright 2013-2016 Sergey Ignatov, Alexander Zolotov, Florin Patan
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

package com.goide.psi.impl;

import com.goide.psi.*;
import com.intellij.openapi.util.Comparing;
import com.intellij.psi.SyntaxTraverser;
import com.intellij.util.ThreeState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GoTypeUtil {
  /**
   * https://golang.org/ref/spec#For_statements
   * The expression on the right in the "range" clause is called the range expression,
   * which may be an array, pointer to an array, slice, string, map, or channel permitting receive operations.
   */
  public static boolean isIterable(@Nullable GoType type) {
    type = type != null ? type.getUnderlyingType() : null;
    return type instanceof GoArrayOrSliceType ||
           type instanceof GoPointerType && isArray(((GoPointerType)type).getType()) ||
           type instanceof GoMapType ||
           type instanceof GoChannelType ||
           isString(type);
  }

  private static boolean isArray(@Nullable GoType type) {
    type = type != null ? type.getUnderlyingType() : null;
    return type instanceof GoArrayOrSliceType && ((GoArrayOrSliceType)type).getExpression() != null;
  }

  public static boolean isString(@Nullable GoType type) {
    return type != null && type.textMatches("string") && GoPsiImplUtil.builtin(type);
  }

  @NotNull
  public static ThreeState isAssignable(@NotNull GoType left, @Nullable GoType right) {
    if (right == null) return ThreeState.NO;
    if (left == right || left.equals(right)) return ThreeState.YES;

    if (identical(left, right)) return ThreeState.YES;

    // todo: and at least one of V or T is not a named type
    if (identical(left.getUnderlyingType(), right.getUnderlyingType())) {
      return ThreeState.YES; // x's type V and T have identical underlying types and at least one of V or T is not a named type.
    }
    
    /*
    Assignability
    
    A value x is assignable to a variable of type T ("x is assignable to T") in any of these cases:
    
    x's type is identical to T.
    x's type V and T have identical underlying types and at least one of V or T is not a named type.
    T is an interface type and x implements T.
    x is a bidirectional channel value, T is a channel type, x's type V and T have identical element types, and at least one of V or T is not a named type.
    x is an untyped constant representable by a value of type T.
    */

    return ThreeState.UNSURE;
  }

  public static boolean identical(@Nullable GoType left, @Nullable GoType right) {
    if (left == null || right == null) return false;
    if (left instanceof GoSpecType) {
      return right instanceof GoSpecType && left.isEquivalentTo(right);
    }
    if (left instanceof GoArrayOrSliceType) {
      // todo: length
      return right instanceof GoArrayOrSliceType && identical(((GoArrayOrSliceType)left).getType(), ((GoArrayOrSliceType)right).getType());
    }
    if (left instanceof GoStructType) {
      // todo
      // Two struct types are identical if they have the same sequence of fields, and if corresponding fields have the same names, and identical types, and identical tags. Two anonymous fields are considered to have the same name. Lower-case field names from different packages are always different.
      return right instanceof GoStructType && identicalStructs((GoStructType)left, (GoStructType)right);
    }
    if (left instanceof GoPointerType) {
      return right instanceof GoPointerType && identical(((GoPointerType)left).getType(), ((GoPointerType)right).getType());
    }
    if (left instanceof GoFunctionType) {
      // todo
      // Two function types are identical if they have the same number of parameters and result values, corresponding parameter and result types are identical, and either both functions are variadic or neither is. Parameter and result names are not required to match.
      return right instanceof GoFunctionType;
    }
    if (left instanceof GoInterfaceType) {
      // todo
      // Two interface types are identical if they have the same set of methods with the same names and identical function types.
      // Lower-case method names from different packages are always different. The order of the methods is irrelevant.
      // todo: T is an interface type and x implements T
      return right instanceof GoInterfaceType;
    }
    if (left instanceof GoMapType) {
      return right instanceof GoMapType
             && identical(((GoMapType)left).getKeyType(), ((GoMapType)right).getKeyType())
             && identical(((GoMapType)left).getValueType(), ((GoMapType)right).getValueType());
    }
    if (left instanceof GoChannelType) {
      // todo: and the same direction
      return right instanceof GoChannelType && identical(((GoChannelType)left).getType(), ((GoChannelType)right).getType());
    }
    if (Comparing.equal(left.getUnderlyingType(), right.getUnderlyingType())) return true;

    // GoReceiverType, GoCType, GoTypeList 

    return false;
  }

  private static boolean identicalStructs(@NotNull GoStructType left, @NotNull GoStructType right) {
    List<GoFieldDefinition> l = SyntaxTraverser.psiTraverser(left).filter(GoFieldDefinition.class).toList();
    List<GoFieldDefinition> r = SyntaxTraverser.psiTraverser(right).filter(GoFieldDefinition.class).toList();
    if (l.size() != r.size()) return false;
    return true;
  }
}
