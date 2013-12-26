// This is a generated file. Not intended for manual editing.
package com.goide.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.goide.GoTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.lang.LighterASTNode;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GoParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.goide.parser.GoParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ADD_EXPR) {
      result_ = Expression(builder_, 0, 2);
    }
    else if (root_ == AND_EXPR) {
      result_ = Expression(builder_, 0, 0);
    }
    else if (root_ == ANONYMOUS_FIELD) {
      result_ = AnonymousField(builder_, 0);
    }
    else if (root_ == ARGUMENT_LIST) {
      result_ = ArgumentList(builder_, 0);
    }
    else if (root_ == ARRAY_OR_SLICE_TYPE) {
      result_ = ArrayOrSliceType(builder_, 0);
    }
    else if (root_ == ASSIGNMENT_STATEMENT) {
      result_ = AssignmentStatement(builder_, 0);
    }
    else if (root_ == BASE_TYPE) {
      result_ = BaseType(builder_, 0);
    }
    else if (root_ == BLOCK) {
      result_ = Block(builder_, 0);
    }
    else if (root_ == BREAK_STATEMENT) {
      result_ = BreakStatement(builder_, 0);
    }
    else if (root_ == BUILTIN_ARGS) {
      result_ = BuiltinArgs(builder_, 0);
    }
    else if (root_ == BUILTIN_CALL_EXPR) {
      result_ = BuiltinCallExpr(builder_, 0);
    }
    else if (root_ == CALL_EXPR) {
      result_ = Expression(builder_, 0, 7);
    }
    else if (root_ == CHANNEL_TYPE) {
      result_ = ChannelType(builder_, 0);
    }
    else if (root_ == COMM_CASE) {
      result_ = CommCase(builder_, 0);
    }
    else if (root_ == COMM_CLAUSE) {
      result_ = CommClause(builder_, 0);
    }
    else if (root_ == COMPOSITE_LIT) {
      result_ = CompositeLit(builder_, 0);
    }
    else if (root_ == CONDITIONAL_EXPR) {
      result_ = Expression(builder_, 0, 1);
    }
    else if (root_ == CONST_DECL) {
      result_ = ConstDecl(builder_, 0);
    }
    else if (root_ == CONST_SPEC) {
      result_ = ConstSpec(builder_, 0);
    }
    else if (root_ == CONTINUE_STATEMENT) {
      result_ = ContinueStatement(builder_, 0);
    }
    else if (root_ == CONVERSION_EXPR) {
      result_ = ConversionExpr(builder_, 0);
    }
    else if (root_ == DECLARATION_STATEMENT) {
      result_ = DeclarationStatement(builder_, 0);
    }
    else if (root_ == DEFER_STATEMENT) {
      result_ = DeferStatement(builder_, 0);
    }
    else if (root_ == ELEMENT) {
      result_ = Element(builder_, 0);
    }
    else if (root_ == ELEMENT_INDEX) {
      result_ = ElementIndex(builder_, 0);
    }
    else if (root_ == EXPR_CASE_CLAUSE) {
      result_ = ExprCaseClause(builder_, 0);
    }
    else if (root_ == EXPR_SWITCH_CASE) {
      result_ = ExprSwitchCase(builder_, 0);
    }
    else if (root_ == EXPR_SWITCH_STATEMENT) {
      result_ = ExprSwitchStatement(builder_, 0);
    }
    else if (root_ == EXPRESSION) {
      result_ = Expression(builder_, 0, -1);
    }
    else if (root_ == FALLTHROUGH_STATEMENT) {
      result_ = FallthroughStatement(builder_, 0);
    }
    else if (root_ == FIELD_DECL) {
      result_ = FieldDecl(builder_, 0);
    }
    else if (root_ == FIELD_NAME) {
      result_ = FieldName(builder_, 0);
    }
    else if (root_ == FOR_CLAUSE) {
      result_ = ForClause(builder_, 0);
    }
    else if (root_ == FOR_STATEMENT) {
      result_ = ForStatement(builder_, 0);
    }
    else if (root_ == FUNCTION) {
      result_ = Function(builder_, 0);
    }
    else if (root_ == FUNCTION_BODY) {
      result_ = FunctionBody(builder_, 0);
    }
    else if (root_ == FUNCTION_DECL) {
      result_ = FunctionDecl(builder_, 0);
    }
    else if (root_ == FUNCTION_LIT) {
      result_ = FunctionLit(builder_, 0);
    }
    else if (root_ == FUNCTION_NAME) {
      result_ = FunctionName(builder_, 0);
    }
    else if (root_ == FUNCTION_TYPE) {
      result_ = FunctionType(builder_, 0);
    }
    else if (root_ == GO_STATEMENT) {
      result_ = GoStatement(builder_, 0);
    }
    else if (root_ == GOTO_STATEMENT) {
      result_ = GotoStatement(builder_, 0);
    }
    else if (root_ == IF_STATEMENT) {
      result_ = IfStatement(builder_, 0);
    }
    else if (root_ == IMPORT_DECL) {
      result_ = ImportDecl(builder_, 0);
    }
    else if (root_ == IMPORT_SPEC) {
      result_ = ImportSpec(builder_, 0);
    }
    else if (root_ == INDEX_EXPR) {
      result_ = Expression(builder_, 0, 7);
    }
    else if (root_ == INTERFACE_TYPE) {
      result_ = InterfaceType(builder_, 0);
    }
    else if (root_ == INTERFACE_TYPE_NAME) {
      result_ = InterfaceTypeName(builder_, 0);
    }
    else if (root_ == KEY) {
      result_ = Key(builder_, 0);
    }
    else if (root_ == LABELED_STATEMENT) {
      result_ = LabeledStatement(builder_, 0);
    }
    else if (root_ == LITERAL) {
      result_ = Literal(builder_, 0);
    }
    else if (root_ == LITERAL_TYPE) {
      result_ = LiteralType(builder_, 0);
    }
    else if (root_ == LITERAL_VALUE) {
      result_ = LiteralValue(builder_, 0);
    }
    else if (root_ == MAP_TYPE) {
      result_ = MapType(builder_, 0);
    }
    else if (root_ == METHOD_DECL) {
      result_ = MethodDecl(builder_, 0);
    }
    else if (root_ == METHOD_EXPR) {
      result_ = MethodExpr(builder_, 0);
    }
    else if (root_ == METHOD_SPEC) {
      result_ = MethodSpec(builder_, 0);
    }
    else if (root_ == MUL_EXPR) {
      result_ = Expression(builder_, 0, 3);
    }
    else if (root_ == OPERAND_NAME) {
      result_ = OperandName(builder_, 0);
    }
    else if (root_ == OR_EXPR) {
      result_ = Expression(builder_, 0, -1);
    }
    else if (root_ == PACKAGE_CLAUSE) {
      result_ = PackageClause(builder_, 0);
    }
    else if (root_ == PARAMETER_DECL) {
      result_ = ParameterDecl(builder_, 0);
    }
    else if (root_ == PARAMETERS) {
      result_ = Parameters(builder_, 0);
    }
    else if (root_ == PARENTHEZIED_EXPR) {
      result_ = ParentheziedExpr(builder_, 0);
    }
    else if (root_ == POINTER_TYPE) {
      result_ = PointerType(builder_, 0);
    }
    else if (root_ == QUALIFIED_IDENT) {
      result_ = QualifiedIdent(builder_, 0);
    }
    else if (root_ == RANGE_CLAUSE) {
      result_ = RangeClause(builder_, 0);
    }
    else if (root_ == RECEIVER) {
      result_ = Receiver(builder_, 0);
    }
    else if (root_ == RECEIVER_TYPE) {
      result_ = ReceiverType(builder_, 0);
    }
    else if (root_ == RECV_STATEMENT) {
      result_ = RecvStatement(builder_, 0);
    }
    else if (root_ == RESULT) {
      result_ = Result(builder_, 0);
    }
    else if (root_ == RETURN_STATEMENT) {
      result_ = ReturnStatement(builder_, 0);
    }
    else if (root_ == SELECT_STATEMENT) {
      result_ = SelectStatement(builder_, 0);
    }
    else if (root_ == SELECTOR_EXPR) {
      result_ = Expression(builder_, 0, 7);
    }
    else if (root_ == SEND_STATEMENT) {
      result_ = SendStatement(builder_, 0);
    }
    else if (root_ == SHORT_VAR_DECL) {
      result_ = ShortVarDecl(builder_, 0);
    }
    else if (root_ == SIGNATURE) {
      result_ = Signature(builder_, 0);
    }
    else if (root_ == SIMPLE_STATEMENT) {
      result_ = SimpleStatement(builder_, 0);
    }
    else if (root_ == SLICE_EXPR) {
      result_ = Expression(builder_, 0, 7);
    }
    else if (root_ == STATEMENT) {
      result_ = Statement(builder_, 0);
    }
    else if (root_ == STRUCT_TYPE) {
      result_ = StructType(builder_, 0);
    }
    else if (root_ == SWITCH_STATEMENT) {
      result_ = SwitchStatement(builder_, 0);
    }
    else if (root_ == TAG) {
      result_ = Tag(builder_, 0);
    }
    else if (root_ == TOP_LEVEL_DECL) {
      result_ = TopLevelDecl(builder_, 0);
    }
    else if (root_ == TYPE) {
      result_ = Type(builder_, 0);
    }
    else if (root_ == TYPE_ASSERTION_EXPR) {
      result_ = Expression(builder_, 0, 7);
    }
    else if (root_ == TYPE_CASE_CLAUSE) {
      result_ = TypeCaseClause(builder_, 0);
    }
    else if (root_ == TYPE_DECL) {
      result_ = TypeDecl(builder_, 0);
    }
    else if (root_ == TYPE_LIST) {
      result_ = TypeList(builder_, 0);
    }
    else if (root_ == TYPE_LIT) {
      result_ = TypeLit(builder_, 0);
    }
    else if (root_ == TYPE_NAME) {
      result_ = TypeName(builder_, 0);
    }
    else if (root_ == TYPE_SPEC) {
      result_ = TypeSpec(builder_, 0);
    }
    else if (root_ == TYPE_SWITCH_CASE) {
      result_ = TypeSwitchCase(builder_, 0);
    }
    else if (root_ == TYPE_SWITCH_GUARD) {
      result_ = TypeSwitchGuard(builder_, 0);
    }
    else if (root_ == TYPE_SWITCH_STATEMENT) {
      result_ = TypeSwitchStatement(builder_, 0);
    }
    else if (root_ == UNARY_EXPR) {
      result_ = UnaryExpr(builder_, 0);
    }
    else if (root_ == VALUE) {
      result_ = Value(builder_, 0);
    }
    else if (root_ == VAR_DECL) {
      result_ = VarDecl(builder_, 0);
    }
    else if (root_ == VAR_SPEC) {
      result_ = VarSpec(builder_, 0);
    }
    else if (root_ == ASSIGN_OP) {
      result_ = assign_op(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return SourceFile(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ADD_EXPR, AND_EXPR, BUILTIN_CALL_EXPR, CALL_EXPR,
      COMPOSITE_LIT, CONDITIONAL_EXPR, CONVERSION_EXPR, EXPRESSION,
      FUNCTION_LIT, INDEX_EXPR, LITERAL, METHOD_EXPR,
      MUL_EXPR, OPERAND_NAME, OR_EXPR, PARENTHEZIED_EXPR,
      QUALIFIED_IDENT, SELECTOR_EXPR, SLICE_EXPR, TYPE_ASSERTION_EXPR,
      TYPE_LIT, UNARY_EXPR),
    create_token_set_(ASSIGNMENT_STATEMENT, BREAK_STATEMENT, CONTINUE_STATEMENT, DECLARATION_STATEMENT,
      DEFER_STATEMENT, EXPR_SWITCH_STATEMENT, FALLTHROUGH_STATEMENT, FOR_STATEMENT,
      GOTO_STATEMENT, GO_STATEMENT, IF_STATEMENT, LABELED_STATEMENT,
      RECV_STATEMENT, RETURN_STATEMENT, SELECT_STATEMENT, SEND_STATEMENT,
      SIMPLE_STATEMENT, STATEMENT, SWITCH_STATEMENT, TYPE_SWITCH_STATEMENT),
    create_token_set_(ARRAY_OR_SLICE_TYPE, BASE_TYPE, CHANNEL_TYPE, FUNCTION_TYPE,
      INTERFACE_TYPE, LITERAL_TYPE, MAP_TYPE, POINTER_TYPE,
      RECEIVER_TYPE, STRUCT_TYPE, TYPE),
  };

  /* ********************************************************** */
  // [ '*' ] TypeName
  public static boolean AnonymousField(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AnonymousField")) return false;
    if (!nextTokenIs(builder_, "<anonymous field>", MUL, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<anonymous field>");
    result_ = AnonymousField_0(builder_, level_ + 1);
    result_ = result_ && TypeName(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ANONYMOUS_FIELD, result_, false, null);
    return result_;
  }

  // [ '*' ]
  private static boolean AnonymousField_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AnonymousField_0")) return false;
    consumeToken(builder_, MUL);
    return true;
  }

  /* ********************************************************** */
  // '(' [ ExpressionList '...'? ','? ] ')'
  public static boolean ArgumentList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ArgumentList_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, ARGUMENT_LIST, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ ExpressionList '...'? ','? ]
  private static boolean ArgumentList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList_1")) return false;
    ArgumentList_1_0(builder_, level_ + 1);
    return true;
  }

  // ExpressionList '...'? ','?
  private static boolean ArgumentList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList_1_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = ExpressionList(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ArgumentList_1_0_1(builder_, level_ + 1));
    result_ = pinned_ && ArgumentList_1_0_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // '...'?
  private static boolean ArgumentList_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList_1_0_1")) return false;
    consumeToken(builder_, TRIPLE_DOT);
    return true;
  }

  // ','?
  private static boolean ArgumentList_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList_1_0_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // '[' Expression? ']' Type
  public static boolean ArrayOrSliceType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayOrSliceType")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LBRACK);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ArrayOrSliceType_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RBRACK)) && result_;
    result_ = pinned_ && Type(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, ARRAY_OR_SLICE_TYPE, result_, pinned_, null);
    return result_ || pinned_;
  }

  // Expression?
  private static boolean ArrayOrSliceType_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayOrSliceType_1")) return false;
    Expression(builder_, level_ + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // ExpressionList assign_op ExpressionList
  public static boolean AssignmentStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssignmentStatement")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<assignment statement>");
    result_ = ExpressionList(builder_, level_ + 1);
    result_ = result_ && assign_op(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && ExpressionList(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ASSIGNMENT_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // Type
  public static boolean BaseType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BaseType")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<base type>");
    result_ = Type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BASE_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // int
  //   | float
  //   | float_i
  //   | decimal_i
  //   | hex
  //   | oct
  //   | imaginary
  //   | rune
  //   | string
  static boolean BasicLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BasicLit")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INT);
    if (!result_) result_ = consumeToken(builder_, FLOAT);
    if (!result_) result_ = consumeToken(builder_, FLOAT_I);
    if (!result_) result_ = consumeToken(builder_, DECIMAL_I);
    if (!result_) result_ = consumeToken(builder_, HEX);
    if (!result_) result_ = consumeToken(builder_, OCT);
    if (!result_) result_ = consumeToken(builder_, IMAGINARY);
    if (!result_) result_ = consumeToken(builder_, RUNE);
    if (!result_) result_ = consumeToken(builder_, STRING);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' (Statement semi)* '}'
  public static boolean Block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Block")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LBRACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Block_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, BLOCK, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (Statement semi)*
  private static boolean Block_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Block_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!Block_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Block_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // Statement semi
  private static boolean Block_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Block_1_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = Statement(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // break identifier?
  public static boolean BreakStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BreakStatement")) return false;
    if (!nextTokenIs(builder_, BREAK)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, BREAK);
    pinned_ = result_; // pin = 1
    result_ = result_ && BreakStatement_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BREAK_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // identifier?
  private static boolean BreakStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BreakStatement_1")) return false;
    consumeToken(builder_, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // Type [ ',' ExpressionList '...'? ] | ExpressionList '...'?
  public static boolean BuiltinArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltinArgs")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<builtin args>");
    result_ = BuiltinArgs_0(builder_, level_ + 1);
    if (!result_) result_ = BuiltinArgs_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BUILTIN_ARGS, result_, false, null);
    return result_;
  }

  // Type [ ',' ExpressionList '...'? ]
  private static boolean BuiltinArgs_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltinArgs_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Type(builder_, level_ + 1);
    result_ = result_ && BuiltinArgs_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ',' ExpressionList '...'? ]
  private static boolean BuiltinArgs_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltinArgs_0_1")) return false;
    BuiltinArgs_0_1_0(builder_, level_ + 1);
    return true;
  }

  // ',' ExpressionList '...'?
  private static boolean BuiltinArgs_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltinArgs_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && ExpressionList(builder_, level_ + 1);
    result_ = result_ && BuiltinArgs_0_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '...'?
  private static boolean BuiltinArgs_0_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltinArgs_0_1_0_2")) return false;
    consumeToken(builder_, TRIPLE_DOT);
    return true;
  }

  // ExpressionList '...'?
  private static boolean BuiltinArgs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltinArgs_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ExpressionList(builder_, level_ + 1);
    result_ = result_ && BuiltinArgs_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '...'?
  private static boolean BuiltinArgs_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltinArgs_1_1")) return false;
    consumeToken(builder_, TRIPLE_DOT);
    return true;
  }

  /* ********************************************************** */
  // ( chan [ '<-' ] | '<-' chan ) Type
  public static boolean ChannelType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ChannelType")) return false;
    if (!nextTokenIs(builder_, "<channel type>", SEND_CHANNEL, CHAN)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<channel type>");
    result_ = ChannelType_0(builder_, level_ + 1);
    result_ = result_ && Type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CHANNEL_TYPE, result_, false, null);
    return result_;
  }

  // chan [ '<-' ] | '<-' chan
  private static boolean ChannelType_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ChannelType_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ChannelType_0_0(builder_, level_ + 1);
    if (!result_) result_ = ChannelType_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // chan [ '<-' ]
  private static boolean ChannelType_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ChannelType_0_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, CHAN);
    pinned_ = result_; // pin = chan
    result_ = result_ && ChannelType_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ '<-' ]
  private static boolean ChannelType_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ChannelType_0_0_1")) return false;
    consumeToken(builder_, SEND_CHANNEL);
    return true;
  }

  // '<-' chan
  private static boolean ChannelType_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ChannelType_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEND_CHANNEL);
    result_ = result_ && consumeToken(builder_, CHAN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // case ( SendStatement | RecvStatement ) | default
  public static boolean CommCase(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CommCase")) return false;
    if (!nextTokenIs(builder_, "<comm case>", CASE, DEFAULT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<comm case>");
    result_ = CommCase_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DEFAULT);
    exit_section_(builder_, level_, marker_, COMM_CASE, result_, false, null);
    return result_;
  }

  // case ( SendStatement | RecvStatement )
  private static boolean CommCase_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CommCase_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CASE);
    result_ = result_ && CommCase_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SendStatement | RecvStatement
  private static boolean CommCase_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CommCase_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = SendStatement(builder_, level_ + 1);
    if (!result_) result_ = RecvStatement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CommCase ':' ( Statement semi )*
  public static boolean CommClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CommClause")) return false;
    if (!nextTokenIs(builder_, "<comm clause>", CASE, DEFAULT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<comm clause>");
    result_ = CommCase(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && CommClause_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COMM_CLAUSE, result_, false, null);
    return result_;
  }

  // ( Statement semi )*
  private static boolean CommClause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CommClause_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!CommClause_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "CommClause_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // Statement semi
  private static boolean CommClause_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CommClause_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Statement(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LiteralType LiteralValue
  public static boolean CompositeLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CompositeLit")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<composite lit>");
    result_ = LiteralType(builder_, level_ + 1);
    result_ = result_ && LiteralValue(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COMPOSITE_LIT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // const ( ConstSpec | '(' ( ConstSpec semi )* ')' )
  public static boolean ConstDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDecl")) return false;
    if (!nextTokenIs(builder_, CONST)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, CONST);
    pinned_ = result_; // pin = 1
    result_ = result_ && ConstDecl_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONST_DECL, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ConstSpec | '(' ( ConstSpec semi )* ')'
  private static boolean ConstDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDecl_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ConstSpec(builder_, level_ + 1);
    if (!result_) result_ = ConstDecl_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' ( ConstSpec semi )* ')'
  private static boolean ConstDecl_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDecl_1_1")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ConstDecl_1_1_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ( ConstSpec semi )*
  private static boolean ConstDecl_1_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDecl_1_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ConstDecl_1_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ConstDecl_1_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ConstSpec semi
  private static boolean ConstDecl_1_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDecl_1_1_1_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = ConstSpec(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // IdentifierList [ [ Type ] '=' ExpressionList ]
  public static boolean ConstSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstSpec")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = IdentifierList(builder_, level_ + 1);
    result_ = result_ && ConstSpec_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONST_SPEC, result_);
    return result_;
  }

  // [ [ Type ] '=' ExpressionList ]
  private static boolean ConstSpec_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstSpec_1")) return false;
    ConstSpec_1_0(builder_, level_ + 1);
    return true;
  }

  // [ Type ] '=' ExpressionList
  private static boolean ConstSpec_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstSpec_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ConstSpec_1_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    result_ = result_ && ExpressionList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ Type ]
  private static boolean ConstSpec_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstSpec_1_0_0")) return false;
    Type(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // continue identifier?
  public static boolean ContinueStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContinueStatement")) return false;
    if (!nextTokenIs(builder_, CONTINUE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, CONTINUE);
    pinned_ = result_; // pin = 1
    result_ = result_ && ContinueStatement_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONTINUE_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // identifier?
  private static boolean ContinueStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContinueStatement_1")) return false;
    consumeToken(builder_, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // ConstDecl | TypeDecl | VarDecl
  public static boolean DeclarationStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DeclarationStatement")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<declaration statement>");
    result_ = ConstDecl(builder_, level_ + 1);
    if (!result_) result_ = TypeDecl(builder_, level_ + 1);
    if (!result_) result_ = VarDecl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DECLARATION_STATEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // defer Expression
  public static boolean DeferStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DeferStatement")) return false;
    if (!nextTokenIs(builder_, DEFER)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, DEFER);
    pinned_ = result_; // pin = 1
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, DEFER_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // [ Key ':' ] Value
  public static boolean Element(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Element")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<element>");
    result_ = Element_0(builder_, level_ + 1);
    result_ = result_ && Value(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ELEMENT, result_, false, null);
    return result_;
  }

  // [ Key ':' ]
  private static boolean Element_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Element_0")) return false;
    Element_0_0(builder_, level_ + 1);
    return true;
  }

  // Key ':'
  private static boolean Element_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Element_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Key(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expression
  public static boolean ElementIndex(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ElementIndex")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<element index>");
    result_ = Expression(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, ELEMENT_INDEX, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Element ( ',' Element )*
  static boolean ElementList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ElementList")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = Element(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && ElementList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ( ',' Element )*
  private static boolean ElementList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ElementList_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ElementList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ElementList_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' Element
  private static boolean ElementList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ElementList_1_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && Element(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ExprSwitchCase ':' ( Statement semi )*
  public static boolean ExprCaseClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprCaseClause")) return false;
    if (!nextTokenIs(builder_, "<expr case clause>", CASE, DEFAULT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr case clause>");
    result_ = ExprSwitchCase(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && ExprCaseClause_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPR_CASE_CLAUSE, result_, false, null);
    return result_;
  }

  // ( Statement semi )*
  private static boolean ExprCaseClause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprCaseClause_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ExprCaseClause_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ExprCaseClause_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // Statement semi
  private static boolean ExprCaseClause_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprCaseClause_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Statement(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // case ExpressionList | default
  public static boolean ExprSwitchCase(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprSwitchCase")) return false;
    if (!nextTokenIs(builder_, "<expr switch case>", CASE, DEFAULT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr switch case>");
    result_ = ExprSwitchCase_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DEFAULT);
    exit_section_(builder_, level_, marker_, EXPR_SWITCH_CASE, result_, false, null);
    return result_;
  }

  // case ExpressionList
  private static boolean ExprSwitchCase_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprSwitchCase_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CASE);
    result_ = result_ && ExpressionList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // switch [ SimpleStatement semi ] [ Expression ] '{' ( ExprCaseClause )* '}'
  public static boolean ExprSwitchStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprSwitchStatement")) return false;
    if (!nextTokenIs(builder_, SWITCH)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, SWITCH);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ExprSwitchStatement_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, ExprSwitchStatement_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, LBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, ExprSwitchStatement_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, EXPR_SWITCH_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ SimpleStatement semi ]
  private static boolean ExprSwitchStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprSwitchStatement_1")) return false;
    ExprSwitchStatement_1_0(builder_, level_ + 1);
    return true;
  }

  // SimpleStatement semi
  private static boolean ExprSwitchStatement_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprSwitchStatement_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = SimpleStatement(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ Expression ]
  private static boolean ExprSwitchStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprSwitchStatement_2")) return false;
    Expression(builder_, level_ + 1, -1);
    return true;
  }

  // ( ExprCaseClause )*
  private static boolean ExprSwitchStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprSwitchStatement_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ExprSwitchStatement_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ExprSwitchStatement_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ( ExprCaseClause )
  private static boolean ExprSwitchStatement_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprSwitchStatement_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ExprCaseClause(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expression ( ',' Expression )*
  static boolean ExpressionList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExpressionList")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = Expression(builder_, level_ + 1, -1);
    pinned_ = result_; // pin = 1
    result_ = result_ && ExpressionList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ( ',' Expression )*
  private static boolean ExpressionList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExpressionList_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ExpressionList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ExpressionList_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' Expression
  private static boolean ExpressionList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExpressionList_1_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // fallthrough
  public static boolean FallthroughStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FallthroughStatement")) return false;
    if (!nextTokenIs(builder_, FALLTHROUGH)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FALLTHROUGH);
    exit_section_(builder_, marker_, FALLTHROUGH_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (IdentifierList Type | AnonymousField) [ Tag ]
  public static boolean FieldDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldDecl")) return false;
    if (!nextTokenIs(builder_, "<field decl>", MUL, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<field decl>");
    result_ = FieldDecl_0(builder_, level_ + 1);
    result_ = result_ && FieldDecl_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FIELD_DECL, result_, false, null);
    return result_;
  }

  // IdentifierList Type | AnonymousField
  private static boolean FieldDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldDecl_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = FieldDecl_0_0(builder_, level_ + 1);
    if (!result_) result_ = AnonymousField(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IdentifierList Type
  private static boolean FieldDecl_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldDecl_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = IdentifierList(builder_, level_ + 1);
    result_ = result_ && Type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ Tag ]
  private static boolean FieldDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldDecl_1")) return false;
    Tag(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean FieldName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, FIELD_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // SimpleStatement? semi Expression? semi SimpleStatement?
  public static boolean ForClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForClause")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<for clause>");
    result_ = ForClause_0(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    result_ = result_ && ForClause_2(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    result_ = result_ && ForClause_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FOR_CLAUSE, result_, false, null);
    return result_;
  }

  // SimpleStatement?
  private static boolean ForClause_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForClause_0")) return false;
    SimpleStatement(builder_, level_ + 1);
    return true;
  }

  // Expression?
  private static boolean ForClause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForClause_2")) return false;
    Expression(builder_, level_ + 1, -1);
    return true;
  }

  // SimpleStatement?
  private static boolean ForClause_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForClause_4")) return false;
    SimpleStatement(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // for [ Expression | RangeClause | ForClause ] Block
  public static boolean ForStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStatement")) return false;
    if (!nextTokenIs(builder_, FOR)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, FOR);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ForStatement_1(builder_, level_ + 1));
    result_ = pinned_ && Block(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, FOR_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ Expression | RangeClause | ForClause ]
  private static boolean ForStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStatement_1")) return false;
    ForStatement_1_0(builder_, level_ + 1);
    return true;
  }

  // Expression | RangeClause | ForClause
  private static boolean ForStatement_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStatement_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Expression(builder_, level_ + 1, -1);
    if (!result_) result_ = RangeClause(builder_, level_ + 1);
    if (!result_) result_ = ForClause(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Signature FunctionBody
  public static boolean Function(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Function")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Signature(builder_, level_ + 1);
    result_ = result_ && FunctionBody(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // Block
  public static boolean FunctionBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionBody")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION_BODY, result_);
    return result_;
  }

  /* ********************************************************** */
  // func FunctionName ( Function | Signature )
  public static boolean FunctionDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionDecl")) return false;
    if (!nextTokenIs(builder_, FUNC)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, FUNC);
    result_ = result_ && FunctionName(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && FunctionDecl_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FUNCTION_DECL, result_, pinned_, null);
    return result_ || pinned_;
  }

  // Function | Signature
  private static boolean FunctionDecl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionDecl_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Function(builder_, level_ + 1);
    if (!result_) result_ = Signature(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // func Function
  public static boolean FunctionLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionLit")) return false;
    if (!nextTokenIs(builder_, FUNC)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FUNC);
    result_ = result_ && Function(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION_LIT, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier
  public static boolean FunctionName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, FUNCTION_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // func Signature
  public static boolean FunctionType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionType")) return false;
    if (!nextTokenIs(builder_, FUNC)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FUNC);
    result_ = result_ && Signature(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // go Expression
  public static boolean GoStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GoStatement")) return false;
    if (!nextTokenIs(builder_, GO)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, GO);
    pinned_ = result_; // pin = 1
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, GO_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // goto identifier
  public static boolean GotoStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GotoStatement")) return false;
    if (!nextTokenIs(builder_, GOTO)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokens(builder_, 1, GOTO, IDENTIFIER);
    pinned_ = result_; // pin = 1
    exit_section_(builder_, level_, marker_, GOTO_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // identifier ( ',' identifier )*
  static boolean IdentifierList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IdentifierList")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, IDENTIFIER);
    pinned_ = result_; // pin = 1
    result_ = result_ && IdentifierList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ( ',' identifier )*
  private static boolean IdentifierList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IdentifierList_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!IdentifierList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "IdentifierList_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' identifier
  private static boolean IdentifierList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IdentifierList_1_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // if [ SimpleStatement semi ] Expression Block [ else ( IfStatement | Block ) ]
  public static boolean IfStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, IF);
    pinned_ = result_; // pin = if|else
    result_ = result_ && report_error_(builder_, IfStatement_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, Expression(builder_, level_ + 1, -1)) && result_;
    result_ = pinned_ && report_error_(builder_, Block(builder_, level_ + 1)) && result_;
    result_ = pinned_ && IfStatement_4(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, IF_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ SimpleStatement semi ]
  private static boolean IfStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement_1")) return false;
    IfStatement_1_0(builder_, level_ + 1);
    return true;
  }

  // SimpleStatement semi
  private static boolean IfStatement_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = SimpleStatement(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ else ( IfStatement | Block ) ]
  private static boolean IfStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement_4")) return false;
    IfStatement_4_0(builder_, level_ + 1);
    return true;
  }

  // else ( IfStatement | Block )
  private static boolean IfStatement_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement_4_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, ELSE);
    pinned_ = result_; // pin = if|else
    result_ = result_ && IfStatement_4_0_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // IfStatement | Block
  private static boolean IfStatement_4_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement_4_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = IfStatement(builder_, level_ + 1);
    if (!result_) result_ = Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // import ( ImportSpec | '(' ( ImportSpec semi )* ')' )
  public static boolean ImportDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImportDecl")) return false;
    if (!nextTokenIs(builder_, IMPORT)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, IMPORT);
    pinned_ = result_; // pin = 1
    result_ = result_ && ImportDecl_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, IMPORT_DECL, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ImportSpec | '(' ( ImportSpec semi )* ')'
  private static boolean ImportDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImportDecl_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ImportSpec(builder_, level_ + 1);
    if (!result_) result_ = ImportDecl_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' ( ImportSpec semi )* ')'
  private static boolean ImportDecl_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImportDecl_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && ImportDecl_1_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ImportSpec semi )*
  private static boolean ImportDecl_1_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImportDecl_1_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ImportDecl_1_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ImportDecl_1_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ImportSpec semi
  private static boolean ImportDecl_1_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImportDecl_1_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ImportSpec(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ '.' | PackageName ] string
  public static boolean ImportSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImportSpec")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<import spec>");
    result_ = ImportSpec_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, STRING);
    exit_section_(builder_, level_, marker_, IMPORT_SPEC, result_, false, null);
    return result_;
  }

  // [ '.' | PackageName ]
  private static boolean ImportSpec_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImportSpec_0")) return false;
    ImportSpec_0_0(builder_, level_ + 1);
    return true;
  }

  // '.' | PackageName
  private static boolean ImportSpec_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImportSpec_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = PackageName(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // interface '{' ( MethodSpec semi )* '}'
  public static boolean InterfaceType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceType")) return false;
    if (!nextTokenIs(builder_, INTERFACE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, INTERFACE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, LBRACE));
    result_ = pinned_ && report_error_(builder_, InterfaceType_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, INTERFACE_TYPE, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ( MethodSpec semi )*
  private static boolean InterfaceType_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceType_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!InterfaceType_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "InterfaceType_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // MethodSpec semi
  private static boolean InterfaceType_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceType_2_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = MethodSpec(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // TypeName
  public static boolean InterfaceTypeName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceTypeName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeName(builder_, level_ + 1);
    exit_section_(builder_, marker_, INTERFACE_TYPE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // FieldName | ElementIndex
  public static boolean Key(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Key")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<key>");
    result_ = FieldName(builder_, level_ + 1);
    if (!result_) result_ = ElementIndex(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, KEY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // identifier ':' Statement
  public static boolean LabeledStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LabeledStatement")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, COLON);
    pinned_ = result_; // pin = 2
    result_ = result_ && Statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LABELED_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // StructType
  //   | ArrayOrSliceType
  //   | '[' '...' ']' Type
  //   | MapType
  //   | TypeName
  public static boolean LiteralType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LiteralType")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<literal type>");
    result_ = StructType(builder_, level_ + 1);
    if (!result_) result_ = ArrayOrSliceType(builder_, level_ + 1);
    if (!result_) result_ = LiteralType_2(builder_, level_ + 1);
    if (!result_) result_ = MapType(builder_, level_ + 1);
    if (!result_) result_ = TypeName(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LITERAL_TYPE, result_, false, null);
    return result_;
  }

  // '[' '...' ']' Type
  private static boolean LiteralType_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LiteralType_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACK);
    result_ = result_ && consumeToken(builder_, TRIPLE_DOT);
    result_ = result_ && consumeToken(builder_, RBRACK);
    result_ = result_ && Type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' [ ElementList [ ',' ] ] '}'
  public static boolean LiteralValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LiteralValue")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && LiteralValue_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, LITERAL_VALUE, result_);
    return result_;
  }

  // [ ElementList [ ',' ] ]
  private static boolean LiteralValue_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LiteralValue_1")) return false;
    LiteralValue_1_0(builder_, level_ + 1);
    return true;
  }

  // ElementList [ ',' ]
  private static boolean LiteralValue_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LiteralValue_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ElementList(builder_, level_ + 1);
    result_ = result_ && LiteralValue_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ',' ]
  private static boolean LiteralValue_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LiteralValue_1_0_1")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // map '[' Type ']' Type
  public static boolean MapType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MapType")) return false;
    if (!nextTokenIs(builder_, MAP)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, MAP);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, LBRACK));
    result_ = pinned_ && report_error_(builder_, Type(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RBRACK)) && result_;
    result_ = pinned_ && Type(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, MAP_TYPE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // func Receiver identifier ( Function | Signature )
  public static boolean MethodDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MethodDecl")) return false;
    if (!nextTokenIs(builder_, FUNC)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, FUNC);
    result_ = result_ && Receiver(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, consumeToken(builder_, IDENTIFIER));
    result_ = pinned_ && MethodDecl_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, METHOD_DECL, result_, pinned_, null);
    return result_ || pinned_;
  }

  // Function | Signature
  private static boolean MethodDecl_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MethodDecl_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Function(builder_, level_ + 1);
    if (!result_) result_ = Signature(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier Signature | InterfaceTypeName
  public static boolean MethodSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MethodSpec")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = MethodSpec_0(builder_, level_ + 1);
    if (!result_) result_ = InterfaceTypeName(builder_, level_ + 1);
    exit_section_(builder_, marker_, METHOD_SPEC, result_);
    return result_;
  }

  // identifier Signature
  private static boolean MethodSpec_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MethodSpec_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && Signature(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // package PackageName
  public static boolean PackageClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PackageClause")) return false;
    if (!nextTokenIs(builder_, PACKAGE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, PACKAGE);
    pinned_ = result_; // pin = 1
    result_ = result_ && PackageName(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PACKAGE_CLAUSE, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // identifier
  static boolean PackageName(PsiBuilder builder_, int level_) {
    return consumeToken(builder_, IDENTIFIER);
  }

  /* ********************************************************** */
  // [ IdentifierList ] [ '...' ] Type
  public static boolean ParameterDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ParameterDecl")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameter decl>");
    result_ = ParameterDecl_0(builder_, level_ + 1);
    result_ = result_ && ParameterDecl_1(builder_, level_ + 1);
    result_ = result_ && Type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PARAMETER_DECL, result_, false, null);
    return result_;
  }

  // [ IdentifierList ]
  private static boolean ParameterDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ParameterDecl_0")) return false;
    IdentifierList(builder_, level_ + 1);
    return true;
  }

  // [ '...' ]
  private static boolean ParameterDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ParameterDecl_1")) return false;
    consumeToken(builder_, TRIPLE_DOT);
    return true;
  }

  /* ********************************************************** */
  // ParameterDecl ( ',' ParameterDecl )*
  static boolean ParameterList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ParameterList")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = ParameterDecl(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && ParameterList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ( ',' ParameterDecl )*
  private static boolean ParameterList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ParameterList_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ParameterList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ParameterList_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' ParameterDecl
  private static boolean ParameterList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ParameterList_1_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && ParameterDecl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '(' [ ParameterList [ ',' ] ] ')'
  public static boolean Parameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Parameters")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && Parameters_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, PARAMETERS, result_);
    return result_;
  }

  // [ ParameterList [ ',' ] ]
  private static boolean Parameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Parameters_1")) return false;
    Parameters_1_0(builder_, level_ + 1);
    return true;
  }

  // ParameterList [ ',' ]
  private static boolean Parameters_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Parameters_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ParameterList(builder_, level_ + 1);
    result_ = result_ && Parameters_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ',' ]
  private static boolean Parameters_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Parameters_1_0_1")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // '*' BaseType
  public static boolean PointerType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PointerType")) return false;
    if (!nextTokenIs(builder_, MUL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MUL);
    result_ = result_ && BaseType(builder_, level_ + 1);
    exit_section_(builder_, marker_, POINTER_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // PackageName '.' identifier
  public static boolean QualifiedIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "QualifiedIdent")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = PackageName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, QUALIFIED_IDENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( ExpressionList '=' | IdentifierList ':=' ) range Expression
  public static boolean RangeClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RangeClause")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<range clause>");
    result_ = RangeClause_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RANGE);
    pinned_ = result_; // pin = 2
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, RANGE_CLAUSE, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ExpressionList '=' | IdentifierList ':='
  private static boolean RangeClause_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RangeClause_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = RangeClause_0_0(builder_, level_ + 1);
    if (!result_) result_ = RangeClause_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ExpressionList '='
  private static boolean RangeClause_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RangeClause_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ExpressionList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IdentifierList ':='
  private static boolean RangeClause_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RangeClause_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = IdentifierList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, VAR_ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' [ identifier ] [ '*' ] identifier ')'
  public static boolean Receiver(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Receiver")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && Receiver_1(builder_, level_ + 1);
    result_ = result_ && Receiver_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, RECEIVER, result_);
    return result_;
  }

  // [ identifier ]
  private static boolean Receiver_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Receiver_1")) return false;
    consumeToken(builder_, IDENTIFIER);
    return true;
  }

  // [ '*' ]
  private static boolean Receiver_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Receiver_2")) return false;
    consumeToken(builder_, MUL);
    return true;
  }

  /* ********************************************************** */
  // TypeName | '(' '*' TypeName ')' | '(' ReceiverType ')'
  public static boolean ReceiverType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReceiverType")) return false;
    if (!nextTokenIs(builder_, "<receiver type>", LPAREN, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<receiver type>");
    result_ = TypeName(builder_, level_ + 1);
    if (!result_) result_ = ReceiverType_1(builder_, level_ + 1);
    if (!result_) result_ = ReceiverType_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, RECEIVER_TYPE, result_, false, null);
    return result_;
  }

  // '(' '*' TypeName ')'
  private static boolean ReceiverType_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReceiverType_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && consumeToken(builder_, MUL);
    result_ = result_ && TypeName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' ReceiverType ')'
  private static boolean ReceiverType_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReceiverType_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && ReceiverType(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ ExpressionList '=' | IdentifierList ':=' ] Expression
  public static boolean RecvStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecvStatement")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<recv statement>");
    result_ = RecvStatement_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, RECV_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ ExpressionList '=' | IdentifierList ':=' ]
  private static boolean RecvStatement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecvStatement_0")) return false;
    RecvStatement_0_0(builder_, level_ + 1);
    return true;
  }

  // ExpressionList '=' | IdentifierList ':='
  private static boolean RecvStatement_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecvStatement_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = RecvStatement_0_0_0(builder_, level_ + 1);
    if (!result_) result_ = RecvStatement_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ExpressionList '='
  private static boolean RecvStatement_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecvStatement_0_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ExpressionList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IdentifierList ':='
  private static boolean RecvStatement_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecvStatement_0_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = IdentifierList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, VAR_ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Parameters | Type
  public static boolean Result(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Result")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<result>");
    result_ = Parameters(builder_, level_ + 1);
    if (!result_) result_ = Type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, RESULT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // return [ ExpressionList ]
  public static boolean ReturnStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReturnStatement")) return false;
    if (!nextTokenIs(builder_, RETURN)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, RETURN);
    pinned_ = result_; // pin = 1
    result_ = result_ && ReturnStatement_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, RETURN_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ ExpressionList ]
  private static boolean ReturnStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReturnStatement_1")) return false;
    ExpressionList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // select '{' ( CommClause )* '}'
  public static boolean SelectStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelectStatement")) return false;
    if (!nextTokenIs(builder_, SELECT)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, SELECT);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, LBRACE));
    result_ = pinned_ && report_error_(builder_, SelectStatement_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, SELECT_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ( CommClause )*
  private static boolean SelectStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelectStatement_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!SelectStatement_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "SelectStatement_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ( CommClause )
  private static boolean SelectStatement_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SelectStatement_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = CommClause(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expression '<-' Expression
  public static boolean SendStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SendStatement")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<send statement>");
    result_ = Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, SEND_CHANNEL);
    pinned_ = result_; // pin = 2
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, SEND_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // IdentifierList ':=' ExpressionList
  public static boolean ShortVarDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ShortVarDecl")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = IdentifierList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, VAR_ASSIGN);
    result_ = result_ && ExpressionList(builder_, level_ + 1);
    exit_section_(builder_, marker_, SHORT_VAR_DECL, result_);
    return result_;
  }

  /* ********************************************************** */
  // Parameters [ Result ]
  public static boolean Signature(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Signature")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Parameters(builder_, level_ + 1);
    result_ = result_ && Signature_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, SIGNATURE, result_);
    return result_;
  }

  // [ Result ]
  private static boolean Signature_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Signature_1")) return false;
    Result(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // AssignmentStatement
  //   | SendStatement
  //   | ShortVarDecl
  //   | Expression ['++' | '--']
  public static boolean SimpleStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimpleStatement")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<simple statement>");
    result_ = AssignmentStatement(builder_, level_ + 1);
    if (!result_) result_ = SendStatement(builder_, level_ + 1);
    if (!result_) result_ = ShortVarDecl(builder_, level_ + 1);
    if (!result_) result_ = SimpleStatement_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SIMPLE_STATEMENT, result_, false, null);
    return result_;
  }

  // Expression ['++' | '--']
  private static boolean SimpleStatement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimpleStatement_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Expression(builder_, level_ + 1, -1);
    result_ = result_ && SimpleStatement_3_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['++' | '--']
  private static boolean SimpleStatement_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimpleStatement_3_1")) return false;
    SimpleStatement_3_1_0(builder_, level_ + 1);
    return true;
  }

  // '++' | '--'
  private static boolean SimpleStatement_3_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimpleStatement_3_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS_PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS_MINUS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PackageClause semi ( ImportDecl semi )* ( TopLevelDecl semi )*
  static boolean SourceFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SourceFile")) return false;
    if (!nextTokenIs(builder_, PACKAGE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = PackageClause(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, semi(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, SourceFile_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && SourceFile_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ( ImportDecl semi )*
  private static boolean SourceFile_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SourceFile_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!SourceFile_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "SourceFile_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ImportDecl semi
  private static boolean SourceFile_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SourceFile_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ImportDecl(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( TopLevelDecl semi )*
  private static boolean SourceFile_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SourceFile_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!SourceFile_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "SourceFile_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // TopLevelDecl semi
  private static boolean SourceFile_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SourceFile_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = TopLevelDecl(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DeclarationStatement
  // 	| LabeledStatement
  // 	| SimpleStatement
  // 	| GoStatement
  // 	| ReturnStatement
  // 	| BreakStatement
  // 	| ContinueStatement
  // 	| GotoStatement
  // 	| FallthroughStatement
  // 	| Block
  // 	| IfStatement
  // 	| SwitchStatement
  // 	| SelectStatement
  // 	| ForStatement
  // 	| DeferStatement
  public static boolean Statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Statement")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<statement>");
    result_ = DeclarationStatement(builder_, level_ + 1);
    if (!result_) result_ = LabeledStatement(builder_, level_ + 1);
    if (!result_) result_ = SimpleStatement(builder_, level_ + 1);
    if (!result_) result_ = GoStatement(builder_, level_ + 1);
    if (!result_) result_ = ReturnStatement(builder_, level_ + 1);
    if (!result_) result_ = BreakStatement(builder_, level_ + 1);
    if (!result_) result_ = ContinueStatement(builder_, level_ + 1);
    if (!result_) result_ = GotoStatement(builder_, level_ + 1);
    if (!result_) result_ = FallthroughStatement(builder_, level_ + 1);
    if (!result_) result_ = Block(builder_, level_ + 1);
    if (!result_) result_ = IfStatement(builder_, level_ + 1);
    if (!result_) result_ = SwitchStatement(builder_, level_ + 1);
    if (!result_) result_ = SelectStatement(builder_, level_ + 1);
    if (!result_) result_ = ForStatement(builder_, level_ + 1);
    if (!result_) result_ = DeferStatement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATEMENT, result_, false, Statement_auto_recover_);
    return result_;
  }

  /* ********************************************************** */
  // struct '{' ( FieldDecl semi )* '}'
  public static boolean StructType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructType")) return false;
    if (!nextTokenIs(builder_, STRUCT)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, STRUCT);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, LBRACE));
    result_ = pinned_ && report_error_(builder_, StructType_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, STRUCT_TYPE, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ( FieldDecl semi )*
  private static boolean StructType_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructType_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!StructType_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "StructType_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // FieldDecl semi
  private static boolean StructType_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StructType_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = FieldDecl(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ExprSwitchStatement | TypeSwitchStatement
  public static boolean SwitchStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SwitchStatement")) return false;
    if (!nextTokenIs(builder_, SWITCH)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, null);
    result_ = ExprSwitchStatement(builder_, level_ + 1);
    if (!result_) result_ = TypeSwitchStatement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SWITCH_STATEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // string
  public static boolean Tag(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Tag")) return false;
    if (!nextTokenIs(builder_, STRING)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING);
    exit_section_(builder_, marker_, TAG, result_);
    return result_;
  }

  /* ********************************************************** */
  // DeclarationStatement | FunctionDecl | MethodDecl
  public static boolean TopLevelDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TopLevelDecl")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<top level decl>");
    result_ = DeclarationStatement(builder_, level_ + 1);
    if (!result_) result_ = FunctionDecl(builder_, level_ + 1);
    if (!result_) result_ = MethodDecl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TOP_LEVEL_DECL, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TypeName | TypeLit | '(' Type ')'
  public static boolean Type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Type")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<type>");
    result_ = TypeName(builder_, level_ + 1);
    if (!result_) result_ = TypeLit(builder_, level_ + 1);
    if (!result_) result_ = Type_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE, result_, false, null);
    return result_;
  }

  // '(' Type ')'
  private static boolean Type_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Type_2")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Type(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // TypeSwitchCase ':' ( Statement semi )*
  public static boolean TypeCaseClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeCaseClause")) return false;
    if (!nextTokenIs(builder_, "<type case clause>", CASE, DEFAULT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type case clause>");
    result_ = TypeSwitchCase(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && TypeCaseClause_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_CASE_CLAUSE, result_, false, null);
    return result_;
  }

  // ( Statement semi )*
  private static boolean TypeCaseClause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeCaseClause_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!TypeCaseClause_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeCaseClause_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // Statement semi
  private static boolean TypeCaseClause_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeCaseClause_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Statement(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'type' ( TypeSpec | '(' ( TypeSpec semi )* ')' )
  public static boolean TypeDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl")) return false;
    if (!nextTokenIs(builder_, TYPE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, TYPE);
    pinned_ = result_; // pin = 1
    result_ = result_ && TypeDecl_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_DECL, result_, pinned_, null);
    return result_ || pinned_;
  }

  // TypeSpec | '(' ( TypeSpec semi )* ')'
  private static boolean TypeDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeSpec(builder_, level_ + 1);
    if (!result_) result_ = TypeDecl_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' ( TypeSpec semi )* ')'
  private static boolean TypeDecl_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_1_1")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, TypeDecl_1_1_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ( TypeSpec semi )*
  private static boolean TypeDecl_1_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_1_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!TypeDecl_1_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeDecl_1_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // TypeSpec semi
  private static boolean TypeDecl_1_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_1_1_1_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = TypeSpec(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // Type ( ',' Type )*
  public static boolean TypeList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeList")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type list>");
    result_ = Type(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && TypeList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_LIST, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ( ',' Type )*
  private static boolean TypeList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeList_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!TypeList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeList_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' Type
  private static boolean TypeList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeList_1_0")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && Type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ArrayOrSliceType
  //   | StructType
  //   | PointerType
  //   | FunctionType
  //   | InterfaceType
  //   | MapType
  //   | ChannelType
  public static boolean TypeLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeLit")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type lit>");
    result_ = ArrayOrSliceType(builder_, level_ + 1);
    if (!result_) result_ = StructType(builder_, level_ + 1);
    if (!result_) result_ = PointerType(builder_, level_ + 1);
    if (!result_) result_ = FunctionType(builder_, level_ + 1);
    if (!result_) result_ = InterfaceType(builder_, level_ + 1);
    if (!result_) result_ = MapType(builder_, level_ + 1);
    if (!result_) result_ = ChannelType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_LIT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // identifier | QualifiedIdent
  public static boolean TypeName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = QualifiedIdent(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier Type
  public static boolean TypeSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpec")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, IDENTIFIER);
    pinned_ = result_; // pin = 1
    result_ = result_ && Type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_SPEC, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // case TypeList | default
  public static boolean TypeSwitchCase(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSwitchCase")) return false;
    if (!nextTokenIs(builder_, "<type switch case>", CASE, DEFAULT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type switch case>");
    result_ = TypeSwitchCase_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DEFAULT);
    exit_section_(builder_, level_, marker_, TYPE_SWITCH_CASE, result_, false, null);
    return result_;
  }

  // case TypeList
  private static boolean TypeSwitchCase_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSwitchCase_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CASE);
    result_ = result_ && TypeList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ identifier ':=' ] Expression '.' '(' type ')'
  public static boolean TypeSwitchGuard(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSwitchGuard")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type switch guard>");
    result_ = TypeSwitchGuard_0(builder_, level_ + 1);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, DOT);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && consumeToken(builder_, TYPE);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, TYPE_SWITCH_GUARD, result_, false, null);
    return result_;
  }

  // [ identifier ':=' ]
  private static boolean TypeSwitchGuard_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSwitchGuard_0")) return false;
    TypeSwitchGuard_0_0(builder_, level_ + 1);
    return true;
  }

  // identifier ':='
  private static boolean TypeSwitchGuard_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSwitchGuard_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, VAR_ASSIGN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // switch [ SimpleStatement semi ] TypeSwitchGuard '{' ( TypeCaseClause )* '}'
  public static boolean TypeSwitchStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSwitchStatement")) return false;
    if (!nextTokenIs(builder_, SWITCH)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, SWITCH);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, TypeSwitchStatement_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, TypeSwitchGuard(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, LBRACE)) && result_;
    result_ = pinned_ && report_error_(builder_, TypeSwitchStatement_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACE) && result_;
    exit_section_(builder_, level_, marker_, TYPE_SWITCH_STATEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ SimpleStatement semi ]
  private static boolean TypeSwitchStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSwitchStatement_1")) return false;
    TypeSwitchStatement_1_0(builder_, level_ + 1);
    return true;
  }

  // SimpleStatement semi
  private static boolean TypeSwitchStatement_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSwitchStatement_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = SimpleStatement(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( TypeCaseClause )*
  private static boolean TypeSwitchStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSwitchStatement_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!TypeSwitchStatement_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeSwitchStatement_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ( TypeCaseClause )
  private static boolean TypeSwitchStatement_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSwitchStatement_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeCaseClause(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expression | LiteralValue
  public static boolean Value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Value")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<value>");
    result_ = Expression(builder_, level_ + 1, -1);
    if (!result_) result_ = LiteralValue(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VALUE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // var ( VarSpec | '(' ( VarSpec semi )* ')' )
  public static boolean VarDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDecl")) return false;
    if (!nextTokenIs(builder_, VAR)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, VAR);
    pinned_ = result_; // pin = 1
    result_ = result_ && VarDecl_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VAR_DECL, result_, pinned_, null);
    return result_ || pinned_;
  }

  // VarSpec | '(' ( VarSpec semi )* ')'
  private static boolean VarDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDecl_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = VarSpec(builder_, level_ + 1);
    if (!result_) result_ = VarDecl_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' ( VarSpec semi )* ')'
  private static boolean VarDecl_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDecl_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && VarDecl_1_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( VarSpec semi )*
  private static boolean VarDecl_1_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDecl_1_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!VarDecl_1_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "VarDecl_1_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // VarSpec semi
  private static boolean VarDecl_1_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDecl_1_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = VarSpec(builder_, level_ + 1);
    result_ = result_ && semi(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IdentifierList ( Type [ '=' ExpressionList ] | '=' ExpressionList )
  public static boolean VarSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarSpec")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = IdentifierList(builder_, level_ + 1);
    result_ = result_ && VarSpec_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, VAR_SPEC, result_);
    return result_;
  }

  // Type [ '=' ExpressionList ] | '=' ExpressionList
  private static boolean VarSpec_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarSpec_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = VarSpec_1_0(builder_, level_ + 1);
    if (!result_) result_ = VarSpec_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // Type [ '=' ExpressionList ]
  private static boolean VarSpec_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarSpec_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Type(builder_, level_ + 1);
    result_ = result_ && VarSpec_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ '=' ExpressionList ]
  private static boolean VarSpec_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarSpec_1_0_1")) return false;
    VarSpec_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // '=' ExpressionList
  private static boolean VarSpec_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarSpec_1_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && ExpressionList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '=' ExpressionList
  private static boolean VarSpec_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarSpec_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && ExpressionList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '+' | '-' | '|' | '^'
  static boolean add_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "add_op")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, BIT_OR);
    if (!result_) result_ = consumeToken(builder_, BIT_XOR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '=' | '+=' | '-=' | '|=' | '^=' | '*=' | '/=' | '%=' | '<<=' | '>>=' | '&=' | '&^='
  public static boolean assign_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assign_op")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<assign op>");
    result_ = consumeToken(builder_, ASSIGN);
    if (!result_) result_ = consumeToken(builder_, PLUS_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, MINUS_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, BIT_OR_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, BIT_XOR_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, MUL_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, QUOTIENT_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, REMAINDER_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, SHIFT_LEFT_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, SHIFT_RIGHT_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, BIT_AND_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, BIT_CLEAR_ASSIGN);
    exit_section_(builder_, level_, marker_, ASSIGN_OP, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '*' | '/' | '%' | '<<' | '>>' | '&' | '&^'
  static boolean mul_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mul_op")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MUL);
    if (!result_) result_ = consumeToken(builder_, QUOTIENT);
    if (!result_) result_ = consumeToken(builder_, REMAINDER);
    if (!result_) result_ = consumeToken(builder_, SHIFT_LEFT);
    if (!result_) result_ = consumeToken(builder_, SHIFT_RIGHT);
    if (!result_) result_ = consumeToken(builder_, BIT_AND);
    if (!result_) result_ = consumeToken(builder_, BIT_CLEAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '==' | '!=' | '<' | '<=' | '>' | '>='
  static boolean rel_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rel_op")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    if (!result_) result_ = consumeToken(builder_, NOT_EQ);
    if (!result_) result_ = consumeToken(builder_, LESS);
    if (!result_) result_ = consumeToken(builder_, LESS_OR_EQUAL);
    if (!result_) result_ = consumeToken(builder_, GREATER);
    if (!result_) result_ = consumeToken(builder_, GREATER_OR_EQUAL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '<NL>' | ';'?
  static boolean semi(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "semi")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON_SYNTHETIC);
    if (!result_) result_ = semi_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ';'?
  private static boolean semi_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "semi_1")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // '+' | '-' | '!' | '^' | '*' | '&' | '<-'
  static boolean unary_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_op")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, NOT);
    if (!result_) result_ = consumeToken(builder_, BIT_XOR);
    if (!result_) result_ = consumeToken(builder_, MUL);
    if (!result_) result_ = consumeToken(builder_, BIT_AND);
    if (!result_) result_ = consumeToken(builder_, SEND_CHANNEL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expression root: Expression
  // Operator priority table:
  // 0: BINARY(OrExpr)
  // 1: BINARY(AndExpr)
  // 2: BINARY(ConditionalExpr)
  // 3: BINARY(AddExpr)
  // 4: BINARY(MulExpr)
  // 5: PREFIX(UnaryExpr)
  // 6: ATOM(BuiltinCallExpr)
  // 7: ATOM(MethodExpr)
  // 8: PREFIX(ConversionExpr) BINARY(SelectorExpr) BINARY(IndexExpr) POSTFIX(SliceExpr) POSTFIX(TypeAssertionExpr) POSTFIX(CallExpr)
  // 9: ATOM(Literal) ATOM(OperandName)
  // 10: PREFIX(ParentheziedExpr)
  public static boolean Expression(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Expression")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expression>");
    result_ = UnaryExpr(builder_, level_ + 1);
    if (!result_) result_ = BuiltinCallExpr(builder_, level_ + 1);
    if (!result_) result_ = MethodExpr(builder_, level_ + 1);
    if (!result_) result_ = Literal(builder_, level_ + 1);
    if (!result_) result_ = OperandName(builder_, level_ + 1);
    if (!result_) result_ = ConversionExpr(builder_, level_ + 1);
    if (!result_) result_ = ParentheziedExpr(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && Expression_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean Expression_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Expression_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker left_marker_ = (Marker) builder_.getLatestDoneMarker();
      if (!invalid_left_marker_guard_(builder_, left_marker_, "Expression_0")) return false;
      Marker marker_ = builder_.mark();
      if (priority_ < 0 && consumeToken(builder_, COND_OR)) {
        result_ = report_error_(builder_, Expression(builder_, level_, 0));
        marker_.drop();
        left_marker_.precede().done(OR_EXPR);
      }
      else if (priority_ < 1 && consumeToken(builder_, COND_AND)) {
        result_ = report_error_(builder_, Expression(builder_, level_, 1));
        marker_.drop();
        left_marker_.precede().done(AND_EXPR);
      }
      else if (priority_ < 2 && rel_op(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expression(builder_, level_, 2));
        marker_.drop();
        left_marker_.precede().done(CONDITIONAL_EXPR);
      }
      else if (priority_ < 3 && add_op(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expression(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(ADD_EXPR);
      }
      else if (priority_ < 4 && mul_op(builder_, level_ + 1)) {
        result_ = report_error_(builder_, Expression(builder_, level_, 4));
        marker_.drop();
        left_marker_.precede().done(MUL_EXPR);
      }
      else if (priority_ < 8 && consumeToken(builder_, DOT)) {
        result_ = report_error_(builder_, Expression(builder_, level_, 8));
        marker_.drop();
        left_marker_.precede().done(SELECTOR_EXPR);
      }
      else if (priority_ < 8 && consumeToken(builder_, LBRACK)) {
        result_ = report_error_(builder_, Expression(builder_, level_, 8));
        result_ = report_error_(builder_, consumeToken(builder_, RBRACK)) && result_;
        marker_.drop();
        left_marker_.precede().done(INDEX_EXPR);
      }
      else if (priority_ < 8 && SliceExpr_0(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(SLICE_EXPR);
      }
      else if (priority_ < 8 && TypeAssertionExpr_0(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(TYPE_ASSERTION_EXPR);
      }
      else if (priority_ < 8 && ArgumentList(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(CALL_EXPR);
      }
      else {
        exit_section_(builder_, marker_, null, false);
        break;
      }
    }
    return result_;
  }

  public static boolean UnaryExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnaryExpr")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = unary_op(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && Expression(builder_, level_, 5);
    exit_section_(builder_, level_, marker_, UNARY_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // identifier '(' [ BuiltinArgs [ ',' ] ] ')'
  public static boolean BuiltinCallExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltinCallExpr")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, BuiltinCallExpr_2(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, BUILTIN_CALL_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ BuiltinArgs [ ',' ] ]
  private static boolean BuiltinCallExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltinCallExpr_2")) return false;
    BuiltinCallExpr_2_0(builder_, level_ + 1);
    return true;
  }

  // BuiltinArgs [ ',' ]
  private static boolean BuiltinCallExpr_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltinCallExpr_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = BuiltinArgs(builder_, level_ + 1);
    result_ = result_ && BuiltinCallExpr_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ',' ]
  private static boolean BuiltinCallExpr_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltinCallExpr_2_0_1")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  // ReceiverType '.' identifier
  public static boolean MethodExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MethodExpr")) return false;
    if (!nextTokenIs(builder_, "<method expr>", LPAREN, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method expr>");
    result_ = ReceiverType(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, METHOD_EXPR, result_, false, null);
    return result_;
  }

  // BasicLit | FunctionLit | CompositeLit
  public static boolean Literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Literal")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<literal>");
    result_ = BasicLit(builder_, level_ + 1);
    if (!result_) result_ = FunctionLit(builder_, level_ + 1);
    if (!result_) result_ = CompositeLit(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LITERAL, result_, false, null);
    return result_;
  }

  // identifier | QualifiedIdent
  public static boolean OperandName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OperandName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, null);
    result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = QualifiedIdent(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, OPERAND_NAME, result_, false, null);
    return result_;
  }

  public static boolean ConversionExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConversionExpr")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = ConversionExpr_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && Expression(builder_, level_, 8);
    result_ = pinned_ && report_error_(builder_, ConversionExpr_1(builder_, level_ + 1)) && result_;
    exit_section_(builder_, level_, marker_, CONVERSION_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // Type '('
  private static boolean ConversionExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConversionExpr_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ',' ] ')'
  private static boolean ConversionExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConversionExpr_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ConversionExpr_1_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ',' ]
  private static boolean ConversionExpr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConversionExpr_1_0")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  // '[' ( [ Expression ] ':' [ Expression ] ) | ( [ Expression ] ':' Expression ':' Expression ) ']'
  private static boolean SliceExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SliceExpr_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = SliceExpr_0_0(builder_, level_ + 1);
    if (!result_) result_ = SliceExpr_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '[' ( [ Expression ] ':' [ Expression ] )
  private static boolean SliceExpr_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SliceExpr_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACK);
    result_ = result_ && SliceExpr_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ Expression ] ':' [ Expression ]
  private static boolean SliceExpr_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SliceExpr_0_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = SliceExpr_0_0_1_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && SliceExpr_0_0_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ Expression ]
  private static boolean SliceExpr_0_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SliceExpr_0_0_1_0")) return false;
    Expression(builder_, level_ + 1, -1);
    return true;
  }

  // [ Expression ]
  private static boolean SliceExpr_0_0_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SliceExpr_0_0_1_2")) return false;
    Expression(builder_, level_ + 1, -1);
    return true;
  }

  // ( [ Expression ] ':' Expression ':' Expression ) ']'
  private static boolean SliceExpr_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SliceExpr_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = SliceExpr_0_1_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ Expression ] ':' Expression ':' Expression
  private static boolean SliceExpr_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SliceExpr_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = SliceExpr_0_1_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ Expression ]
  private static boolean SliceExpr_0_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SliceExpr_0_1_0_0")) return false;
    Expression(builder_, level_ + 1, -1);
    return true;
  }

  // '.' '(' Type ')'
  private static boolean TypeAssertionExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAssertionExpr_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && Type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean ParentheziedExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ParentheziedExpr")) return false;
    if (!nextTokenIs(builder_, "<expression>", LPAREN)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_;
    result_ = pinned_ && Expression(builder_, level_, -1);
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RPAREN)) && result_;
    exit_section_(builder_, level_, marker_, PARENTHEZIED_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  final static Parser Statement_auto_recover_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return !nextTokenIsFast(builder_, NOT, NOT_EQ,
        REMAINDER, REMAINDER_ASSIGN, COND_AND, BIT_AND, BIT_AND_ASSIGN, BIT_CLEAR,
        BIT_CLEAR_ASSIGN, LPAREN, RPAREN, MUL, MUL_ASSIGN, PLUS,
        PLUS_PLUS, PLUS_ASSIGN, COMMA, MINUS, MINUS_MINUS, MINUS_ASSIGN,
        DOT, TRIPLE_DOT, QUOTIENT, QUOTIENT_ASSIGN, COLON, SEMICOLON,
        LESS, SEND_CHANNEL, SHIFT_LEFT, SHIFT_LEFT_ASSIGN, LESS_OR_EQUAL, SEMICOLON_SYNTHETIC,
        ASSIGN, EQ, GREATER, GREATER_OR_EQUAL, SHIFT_RIGHT, SHIFT_RIGHT_ASSIGN,
        LBRACK, RBRACK, BIT_XOR, BIT_XOR_ASSIGN, TYPE, LBRACE,
        BIT_OR, BIT_OR_ASSIGN, COND_OR, RBRACE, BREAK, CASE,
        CHAN, CONST, CONTINUE, DECIMAL_I, DEFAULT, DEFER,
        ELSE, FALLTHROUGH, FLOAT, FLOAT_I, FOR, FUNC,
        GO, GOTO, HEX, IDENTIFIER, IF, IMAGINARY,
        INT, INTERFACE, MAP, OCT, RETURN, RUNE,
        SELECT, STRING, STRUCT, SWITCH, VAR);
    }
  };
}
