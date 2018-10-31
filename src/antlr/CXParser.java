// Generated from CX.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Auto=15, Break=16, Case=17, 
		Char=18, Const=19, Continue=20, Default=21, Do=22, Double=23, Else=24, 
		Enum=25, Extern=26, Float=27, For=28, Goto=29, If=30, Inline=31, Int=32, 
		Long=33, Public=34, Private=35, Register=36, Restrict=37, Return=38, Short=39, 
		Signed=40, Sizeof=41, Static=42, Struct=43, Switch=44, Typedef=45, Union=46, 
		Unsigned=47, Vertex=48, Void=49, Volatile=50, While=51, Alignas=52, Alignof=53, 
		Atomic=54, Bool=55, Complex=56, Generic=57, Imaginary=58, Noreturn=59, 
		StaticAssert=60, ThreadLocal=61, LeftParen=62, RightParen=63, LeftBracket=64, 
		RightBracket=65, LeftBrace=66, RightBrace=67, Less=68, LessEqual=69, Greater=70, 
		GreaterEqual=71, LeftShift=72, RightShift=73, Plus=74, PlusPlus=75, Minus=76, 
		MinusMinus=77, Star=78, Div=79, Mod=80, And=81, Or=82, AndAnd=83, OrOr=84, 
		Caret=85, Not=86, Tilde=87, Question=88, Colon=89, Semi=90, Comma=91, 
		Assign=92, StarAssign=93, DivAssign=94, ModAssign=95, PlusAssign=96, MinusAssign=97, 
		LeftShiftAssign=98, RightShiftAssign=99, AndAssign=100, XorAssign=101, 
		OrAssign=102, Equal=103, NotEqual=104, Arrow=105, Dot=106, Ellipsis=107, 
		Identifier=108, Constant=109, DigitSequence=110, StringLiteral=111, ComplexDefine=112, 
		AsmBlock=113, LineAfterPreprocessing=114, LineDirective=115, PragmaDirective=116, 
		Whitespace=117, Newline=118, BlockComment=119, LineComment=120;
	public static final int
		RULE_primaryExpression = 0, RULE_genericSelection = 1, RULE_genericAssocList = 2, 
		RULE_genericAssociation = 3, RULE_postfixExpression = 4, RULE_argumentExpressionList = 5, 
		RULE_unaryExpression = 6, RULE_unaryOperator = 7, RULE_castExpression = 8, 
		RULE_multiplicativeExpression = 9, RULE_additiveExpression = 10, RULE_shiftExpression = 11, 
		RULE_relationalExpression = 12, RULE_equalityExpression = 13, RULE_andExpression = 14, 
		RULE_exclusiveOrExpression = 15, RULE_inclusiveOrExpression = 16, RULE_logicalAndExpression = 17, 
		RULE_logicalOrExpression = 18, RULE_conditionalExpression = 19, RULE_assignmentExpression = 20, 
		RULE_assignmentOperator = 21, RULE_expression = 22, RULE_constantExpression = 23, 
		RULE_declaration = 24, RULE_declarationSpecifiers = 25, RULE_declarationSpecifiers2 = 26, 
		RULE_declarationSpecifier = 27, RULE_initDeclaratorList = 28, RULE_initDeclarator = 29, 
		RULE_storageClassSpecifier = 30, RULE_typeSpecifier = 31, RULE_structOrUnionSpecifier = 32, 
		RULE_structOrUnion = 33, RULE_structDeclarationList = 34, RULE_structDeclaration = 35, 
		RULE_specifierQualifierList = 36, RULE_structDeclaratorList = 37, RULE_structDeclarator = 38, 
		RULE_enumSpecifier = 39, RULE_enumeratorList = 40, RULE_enumerator = 41, 
		RULE_enumerationConstant = 42, RULE_atomicTypeSpecifier = 43, RULE_typeQualifier = 44, 
		RULE_functionSpecifier = 45, RULE_alignmentSpecifier = 46, RULE_declarator = 47, 
		RULE_directDeclarator = 48, RULE_gccDeclaratorExtension = 49, RULE_gccAttributeSpecifier = 50, 
		RULE_gccAttributeList = 51, RULE_gccAttribute = 52, RULE_nestedParenthesesBlock = 53, 
		RULE_pointer = 54, RULE_typeQualifierList = 55, RULE_parameterTypeList = 56, 
		RULE_parameterList = 57, RULE_parameterDeclaration = 58, RULE_identifierList = 59, 
		RULE_typeName = 60, RULE_abstractDeclarator = 61, RULE_directAbstractDeclarator = 62, 
		RULE_typedefName = 63, RULE_initializer = 64, RULE_initializerList = 65, 
		RULE_designation = 66, RULE_designatorList = 67, RULE_designator = 68, 
		RULE_staticAssertDeclaration = 69, RULE_statement = 70, RULE_labeledStatement = 71, 
		RULE_compoundStatement = 72, RULE_blockItemList = 73, RULE_blockItem = 74, 
		RULE_expressionStatement = 75, RULE_selectionStatement = 76, RULE_iterationStatement = 77, 
		RULE_forCondition = 78, RULE_forDeclaration = 79, RULE_forExpression = 80, 
		RULE_jumpStatement = 81, RULE_compilationUnit = 82, RULE_translationUnit = 83, 
		RULE_externalDeclaration = 84, RULE_vertexDefinition = 85, RULE_functionDefinition = 86, 
		RULE_declarationList = 87, RULE_modifier = 88;
	public static final String[] ruleNames = {
		"primaryExpression", "genericSelection", "genericAssocList", "genericAssociation", 
		"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator", 
		"castExpression", "multiplicativeExpression", "additiveExpression", "shiftExpression", 
		"relationalExpression", "equalityExpression", "andExpression", "exclusiveOrExpression", 
		"inclusiveOrExpression", "logicalAndExpression", "logicalOrExpression", 
		"conditionalExpression", "assignmentExpression", "assignmentOperator", 
		"expression", "constantExpression", "declaration", "declarationSpecifiers", 
		"declarationSpecifiers2", "declarationSpecifier", "initDeclaratorList", 
		"initDeclarator", "storageClassSpecifier", "typeSpecifier", "structOrUnionSpecifier", 
		"structOrUnion", "structDeclarationList", "structDeclaration", "specifierQualifierList", 
		"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
		"enumerator", "enumerationConstant", "atomicTypeSpecifier", "typeQualifier", 
		"functionSpecifier", "alignmentSpecifier", "declarator", "directDeclarator", 
		"gccDeclaratorExtension", "gccAttributeSpecifier", "gccAttributeList", 
		"gccAttribute", "nestedParenthesesBlock", "pointer", "typeQualifierList", 
		"parameterTypeList", "parameterList", "parameterDeclaration", "identifierList", 
		"typeName", "abstractDeclarator", "directAbstractDeclarator", "typedefName", 
		"initializer", "initializerList", "designation", "designatorList", "designator", 
		"staticAssertDeclaration", "statement", "labeledStatement", "compoundStatement", 
		"blockItemList", "blockItem", "expressionStatement", "selectionStatement", 
		"iterationStatement", "forCondition", "forDeclaration", "forExpression", 
		"jumpStatement", "compilationUnit", "translationUnit", "externalDeclaration", 
		"vertexDefinition", "functionDefinition", "declarationList", "modifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
		"'__m128'", "'__m128d'", "'__m128i'", "'__typeof__'", "'__inline__'", 
		"'__stdcall'", "'__declspec'", "'__asm'", "'__attribute__'", "'__asm__'", 
		"'__volatile__'", "'auto'", "'break'", "'case'", "'char'", "'const'", 
		"'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", 
		"'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'", "'public'", 
		"'private'", "'register'", "'restrict'", "'return'", "'short'", "'signed'", 
		"'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", "'union'", 
		"'unsigned'", "'vertex'", "'void'", "'volatile'", "'while'", "'_Alignas'", 
		"'_Alignof'", "'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", 
		"'_Noreturn'", "'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", 
		"'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", 
		"'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", 
		"'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", 
		"'!='", "'->'", "'.'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Auto", "Break", "Case", "Char", "Const", "Continue", 
		"Default", "Do", "Double", "Else", "Enum", "Extern", "Float", "For", "Goto", 
		"If", "Inline", "Int", "Long", "Public", "Private", "Register", "Restrict", 
		"Return", "Short", "Signed", "Sizeof", "Static", "Struct", "Switch", "Typedef", 
		"Union", "Unsigned", "Vertex", "Void", "Volatile", "While", "Alignas", 
		"Alignof", "Atomic", "Bool", "Complex", "Generic", "Imaginary", "Noreturn", 
		"StaticAssert", "ThreadLocal", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", 
		"GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", 
		"MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", 
		"Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", "StarAssign", 
		"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", 
		"RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual", 
		"Arrow", "Dot", "Ellipsis", "Identifier", "Constant", "DigitSequence", 
		"StringLiteral", "ComplexDefine", "AsmBlock", "LineAfterPreprocessing", 
		"LineDirective", "PragmaDirective", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(CXParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CXParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CXParser.StringLiteral, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		int _la;
		try {
			int _alt;
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(Constant);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(180);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(183); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(LeftParen);
				setState(186);
				expression(0);
				setState(187);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				genericSelection();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(190);
					match(T__0);
					}
				}

				setState(193);
				match(LeftParen);
				setState(194);
				compoundStatement();
				setState(195);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				match(T__1);
				setState(198);
				match(LeftParen);
				setState(199);
				unaryExpression();
				setState(200);
				match(Comma);
				setState(201);
				typeName();
				setState(202);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(T__2);
				setState(205);
				match(LeftParen);
				setState(206);
				typeName();
				setState(207);
				match(Comma);
				setState(208);
				unaryExpression();
				setState(209);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericSelectionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterGenericSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitGenericSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitGenericSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(Generic);
			setState(214);
			match(LeftParen);
			setState(215);
			assignmentExpression();
			setState(216);
			match(Comma);
			setState(217);
			genericAssocList(0);
			setState(218);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericAssocListContext extends ParserRuleContext {
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterGenericAssocList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitGenericAssocList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitGenericAssocList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		return genericAssocList(0);
	}

	private GenericAssocListContext genericAssocList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, _parentState);
		GenericAssocListContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_genericAssocList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GenericAssocListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_genericAssocList);
					setState(223);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(224);
					match(Comma);
					setState(225);
					genericAssociation();
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GenericAssociationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterGenericAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitGenericAssociation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitGenericAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericAssociation);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				typeName();
				setState(232);
				match(Colon);
				setState(233);
				assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(Default);
				setState(236);
				match(Colon);
				setState(237);
				assignmentExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(241);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(242);
				match(LeftParen);
				setState(243);
				typeName();
				setState(244);
				match(RightParen);
				setState(245);
				match(LeftBrace);
				setState(246);
				initializerList(0);
				setState(247);
				match(RightBrace);
				}
				break;
			case 3:
				{
				setState(249);
				match(LeftParen);
				setState(250);
				typeName();
				setState(251);
				match(RightParen);
				setState(252);
				match(LeftBrace);
				setState(253);
				initializerList(0);
				setState(254);
				match(Comma);
				setState(255);
				match(RightBrace);
				}
				break;
			case 4:
				{
				setState(257);
				match(T__0);
				setState(258);
				match(LeftParen);
				setState(259);
				typeName();
				setState(260);
				match(RightParen);
				setState(261);
				match(LeftBrace);
				setState(262);
				initializerList(0);
				setState(263);
				match(RightBrace);
				}
				break;
			case 5:
				{
				setState(265);
				match(T__0);
				setState(266);
				match(LeftParen);
				setState(267);
				typeName();
				setState(268);
				match(RightParen);
				setState(269);
				match(LeftBrace);
				setState(270);
				initializerList(0);
				setState(271);
				match(Comma);
				setState(272);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(276);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(277);
						match(LeftBracket);
						setState(278);
						expression(0);
						setState(279);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(281);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(282);
						match(LeftParen);
						setState(284);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
							{
							setState(283);
							argumentExpressionList(0);
							}
						}

						setState(286);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(287);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(288);
						match(Dot);
						setState(289);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(290);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(291);
						match(Arrow);
						setState(292);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(293);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(294);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(295);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(296);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(303);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(305);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(306);
					match(Comma);
					setState(307);
					assignmentExpression();
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unaryExpression);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(PlusPlus);
				setState(315);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(MinusMinus);
				setState(317);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				unaryOperator();
				setState(319);
				castExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				match(Sizeof);
				setState(322);
				unaryExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
				match(Sizeof);
				setState(324);
				match(LeftParen);
				setState(325);
				typeName();
				setState(326);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(328);
				match(Alignof);
				setState(329);
				match(LeftParen);
				setState(330);
				typeName();
				setState(331);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(333);
				match(AndAnd);
				setState(334);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (Minus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CXParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_castExpression);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(LeftParen);
				setState(340);
				typeName();
				setState(341);
				match(RightParen);
				setState(342);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(T__0);
				setState(345);
				match(LeftParen);
				setState(346);
				typeName();
				setState(347);
				match(RightParen);
				setState(348);
				castExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(355);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(357);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(358);
						match(Star);
						setState(359);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(360);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(361);
						match(Div);
						setState(362);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(363);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(364);
						match(Mod);
						setState(365);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(372);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(380);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(374);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(375);
						match(Plus);
						setState(376);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(377);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(378);
						match(Minus);
						setState(379);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(386);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(394);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(388);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(389);
						match(LeftShift);
						setState(390);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(391);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(392);
						match(RightShift);
						setState(393);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(400);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(402);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(403);
						match(Less);
						setState(404);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(405);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(406);
						match(Greater);
						setState(407);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(408);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(409);
						match(LessEqual);
						setState(410);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(411);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(412);
						match(GreaterEqual);
						setState(413);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(420);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(422);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(423);
						match(Equal);
						setState(424);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(425);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(426);
						match(NotEqual);
						setState(427);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(434);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(436);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(437);
					match(And);
					setState(438);
					equalityExpression(0);
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(445);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(447);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(448);
					match(Caret);
					setState(449);
					andExpression(0);
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(456);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(458);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(459);
					match(Or);
					setState(460);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(467);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(469);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(470);
					match(AndAnd);
					setState(471);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(478);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(480);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(481);
					match(OrOr);
					setState(482);
					logicalAndExpression(0);
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			logicalOrExpression(0);
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(489);
				match(Question);
				setState(490);
				expression(0);
				setState(491);
				match(Colon);
				setState(492);
				conditionalExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CXParser.DigitSequence, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentExpression);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				unaryExpression();
				setState(498);
				assignmentOperator();
				setState(499);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (Assign - 92)) | (1L << (StarAssign - 92)) | (1L << (DivAssign - 92)) | (1L << (ModAssign - 92)) | (1L << (PlusAssign - 92)) | (1L << (MinusAssign - 92)) | (1L << (LeftShiftAssign - 92)) | (1L << (RightShiftAssign - 92)) | (1L << (AndAssign - 92)) | (1L << (XorAssign - 92)) | (1L << (OrAssign - 92)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(507);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(509);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(510);
					match(Comma);
					setState(511);
					assignmentExpression();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declaration);
		int _la;
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Public || _la==Private) {
					{
					setState(519);
					modifier();
					}
				}

				setState(522);
				declarationSpecifiers();
				setState(523);
				initDeclaratorList(0);
				setState(524);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				declarationSpecifiers();
				setState(527);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				staticAssertDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitDeclarationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(532);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(535); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterDeclarationSpecifiers2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitDeclarationSpecifiers2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitDeclarationSpecifiers2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(537);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(540); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitDeclarationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declarationSpecifier);
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				typeSpecifier(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				alignmentSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(550);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(552);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(553);
					match(Comma);
					setState(554);
					initDeclarator();
					}
					} 
				}
				setState(559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initDeclarator);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				declarator();
				setState(562);
				match(Assign);
				setState(563);
				initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef) | (1L << ThreadLocal))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_typeSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
				{
				setState(570);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Bool) | (1L << Complex))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__0:
				{
				setState(571);
				match(T__0);
				setState(572);
				match(LeftParen);
				setState(573);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(574);
				match(RightParen);
				}
				break;
			case Atomic:
				{
				setState(575);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				{
				setState(576);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				{
				setState(577);
				enumSpecifier();
				}
				break;
			case Identifier:
				{
				setState(578);
				typedefName();
				}
				break;
			case T__6:
				{
				setState(579);
				match(T__6);
				setState(580);
				match(LeftParen);
				setState(581);
				constantExpression();
				setState(582);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(586);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(587);
					pointer();
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterStructOrUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitStructOrUnionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitStructOrUnionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				structOrUnion();
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(594);
					match(Identifier);
					}
				}

				setState(597);
				match(LeftBrace);
				setState(598);
				structDeclarationList(0);
				setState(599);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				structOrUnion();
				setState(602);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionContext extends ParserRuleContext {
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterStructOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitStructOrUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitStructOrUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationListContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterStructDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitStructDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitStructDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		return structDeclarationList(0);
	}

	private StructDeclarationListContext structDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, _parentState);
		StructDeclarationListContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(609);
			structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(611);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(612);
					structDeclaration();
					}
					} 
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structDeclaration);
		int _la;
		try {
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				specifierQualifierList();
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)) | (1L << (Colon - 62)) | (1L << (Identifier - 62)))) != 0)) {
					{
					setState(619);
					structDeclaratorList(0);
					}
				}

				setState(622);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				staticAssertDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitSpecifierQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_specifierQualifierList);
		try {
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				typeSpecifier(0);
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(628);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				typeQualifier();
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(632);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitStructDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitStructDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		return structDeclaratorList(0);
	}

	private StructDeclaratorListContext structDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, _parentState);
		StructDeclaratorListContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(638);
			structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(640);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(641);
					match(Comma);
					setState(642);
					structDeclarator();
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitStructDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_structDeclarator);
		int _la;
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)) | (1L << (Identifier - 62)))) != 0)) {
					{
					setState(649);
					declarator();
					}
				}

				setState(652);
				match(Colon);
				setState(653);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumSpecifier);
		int _la;
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				match(Enum);
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(657);
					match(Identifier);
					}
				}

				setState(660);
				match(LeftBrace);
				setState(661);
				enumeratorList(0);
				setState(662);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				match(Enum);
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(665);
					match(Identifier);
					}
				}

				setState(668);
				match(LeftBrace);
				setState(669);
				enumeratorList(0);
				setState(670);
				match(Comma);
				setState(671);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				match(Enum);
				setState(674);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorListContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		return enumeratorList(0);
	}

	private EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(678);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(680);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(681);
					match(Comma);
					setState(682);
					enumerator();
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_enumerator);
		try {
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				enumerationConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				enumerationConstant();
				setState(690);
				match(Assign);
				setState(691);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterEnumerationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitEnumerationConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitEnumerationConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterAtomicTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitAtomicTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitAtomicTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(Atomic);
			setState(698);
			match(LeftParen);
			setState(699);
			typeName();
			setState(700);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitFunctionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionSpecifier);
		int _la;
		try {
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				gccAttributeSpecifier();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				match(T__9);
				setState(707);
				match(LeftParen);
				setState(708);
				match(Identifier);
				setState(709);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterAlignmentSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitAlignmentSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitAlignmentSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alignmentSpecifier);
		try {
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				match(Alignas);
				setState(713);
				match(LeftParen);
				setState(714);
				typeName();
				setState(715);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				match(Alignas);
				setState(718);
				match(LeftParen);
				setState(719);
				constantExpression();
				setState(720);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(724);
				pointer();
				}
			}

			setState(727);
			directDeclarator(0);
			setState(731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(728);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CXParser.DigitSequence, 0); }
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(735);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(736);
				match(LeftParen);
				setState(737);
				declarator();
				setState(738);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(740);
				match(Identifier);
				setState(741);
				match(Colon);
				setState(742);
				match(DigitSequence);
				}
				break;
			case 4:
				{
				setState(743);
				match(LeftParen);
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Char) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || _la==Identifier) {
					{
					setState(744);
					typeSpecifier(0);
					}
				}

				setState(747);
				pointer();
				setState(748);
				directDeclarator(0);
				setState(749);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(798);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(796);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(753);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(754);
						match(LeftBracket);
						setState(756);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(755);
							typeQualifierList(0);
							}
						}

						setState(759);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
							{
							setState(758);
							assignmentExpression();
							}
						}

						setState(761);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(762);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(763);
						match(LeftBracket);
						setState(764);
						match(Static);
						setState(766);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(765);
							typeQualifierList(0);
							}
						}

						setState(768);
						assignmentExpression();
						setState(769);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(771);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(772);
						match(LeftBracket);
						setState(773);
						typeQualifierList(0);
						setState(774);
						match(Static);
						setState(775);
						assignmentExpression();
						setState(776);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(778);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(779);
						match(LeftBracket);
						setState(781);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(780);
							typeQualifierList(0);
							}
						}

						setState(783);
						match(Star);
						setState(784);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(785);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(786);
						match(LeftParen);
						setState(787);
						parameterTypeList();
						setState(788);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(790);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(791);
						match(LeftParen);
						setState(793);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(792);
							identifierList(0);
							}
						}

						setState(795);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(800);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(CXParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CXParser.StringLiteral, i);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterGccDeclaratorExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitGccDeclaratorExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitGccDeclaratorExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				match(T__10);
				setState(802);
				match(LeftParen);
				setState(804); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(803);
					match(StringLiteral);
					}
					}
					setState(806); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(808);
				match(RightParen);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				gccAttributeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterGccAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitGccAttributeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitGccAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(T__11);
			setState(813);
			match(LeftParen);
			setState(814);
			match(LeftParen);
			setState(815);
			gccAttributeList();
			setState(816);
			match(RightParen);
			setState(817);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeListContext extends ParserRuleContext {
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterGccAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitGccAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitGccAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_gccAttributeList);
		int _la;
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				gccAttribute();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(820);
					match(Comma);
					setState(821);
					gccAttribute();
					}
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeContext extends ParserRuleContext {
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterGccAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitGccAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitGccAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_gccAttribute);
		int _la;
		try {
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case Auto:
			case Break:
			case Case:
			case Char:
			case Const:
			case Continue:
			case Default:
			case Do:
			case Double:
			case Else:
			case Enum:
			case Extern:
			case Float:
			case For:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Public:
			case Private:
			case Register:
			case Restrict:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Struct:
			case Switch:
			case Typedef:
			case Union:
			case Unsigned:
			case Vertex:
			case Void:
			case Volatile:
			case While:
			case Alignas:
			case Alignof:
			case Atomic:
			case Bool:
			case Complex:
			case Generic:
			case Imaginary:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftBracket:
			case RightBracket:
			case LeftBrace:
			case RightBrace:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Not:
			case Tilde:
			case Question:
			case Colon:
			case Semi:
			case Assign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
			case Arrow:
			case Dot:
			case Ellipsis:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
			case ComplexDefine:
			case AsmBlock:
			case LineAfterPreprocessing:
			case LineDirective:
			case PragmaDirective:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (RightParen - 62)) | (1L << (Comma - 62)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(831);
					match(LeftParen);
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
						{
						setState(832);
						argumentExpressionList(0);
						}
					}

					setState(835);
					match(RightParen);
					}
				}

				}
				break;
			case RightParen:
			case Comma:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterNestedParenthesesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitNestedParenthesesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitNestedParenthesesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Public) | (1L << Private) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Vertex) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftBracket - 64)) | (1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(846);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Public:
				case Private:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Vertex:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Constant:
				case DigitSequence:
				case StringLiteral:
				case ComplexDefine:
				case AsmBlock:
				case LineAfterPreprocessing:
				case LineDirective:
				case PragmaDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(841);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(842);
					match(LeftParen);
					setState(843);
					nestedParenthesesBlock();
					setState(844);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_pointer);
		int _la;
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				match(Star);
				setState(853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(852);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				match(Star);
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(856);
					typeQualifierList(0);
					}
				}

				setState(859);
				pointer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(860);
				match(Caret);
				setState(862);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(861);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(864);
				match(Caret);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(865);
					typeQualifierList(0);
					}
				}

				setState(868);
				pointer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterTypeQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitTypeQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitTypeQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(872);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(878);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(874);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(875);
					typeQualifier();
					}
					} 
				}
				setState(880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterParameterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitParameterTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitParameterTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_parameterTypeList);
		try {
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				parameterList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				parameterList(0);
				setState(883);
				match(Comma);
				setState(884);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(889);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(896);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(891);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(892);
					match(Comma);
					setState(893);
					parameterDeclaration();
					}
					} 
				}
				setState(898);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_parameterDeclaration);
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				declarationSpecifiers();
				setState(900);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				declarationSpecifiers2();
				setState(904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(903);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(909);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(911);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(912);
					match(Comma);
					setState(913);
					match(Identifier);
					}
					} 
				}
				setState(918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			specifierQualifierList();
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (LeftBracket - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)))) != 0)) {
				{
				setState(920);
				abstractDeclarator();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_abstractDeclarator);
		int _la;
		try {
			int _alt;
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(924);
					pointer();
					}
				}

				setState(927);
				directAbstractDeclarator(0);
				setState(931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(928);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(933);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitDirectAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitDirectAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(937);
				match(LeftParen);
				setState(938);
				abstractDeclarator();
				setState(939);
				match(RightParen);
				setState(943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(940);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(945);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(946);
				match(LeftBracket);
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(947);
					typeQualifierList(0);
					}
				}

				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(950);
					assignmentExpression();
					}
				}

				setState(953);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(954);
				match(LeftBracket);
				setState(955);
				match(Static);
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(956);
					typeQualifierList(0);
					}
				}

				setState(959);
				assignmentExpression();
				setState(960);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(962);
				match(LeftBracket);
				setState(963);
				typeQualifierList(0);
				setState(964);
				match(Static);
				setState(965);
				assignmentExpression();
				setState(966);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(968);
				match(LeftBracket);
				setState(969);
				match(Star);
				setState(970);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(971);
				match(LeftParen);
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
					{
					setState(972);
					parameterTypeList();
					}
				}

				setState(975);
				match(RightParen);
				setState(979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(976);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(981);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1027);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1025);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(984);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(985);
						match(LeftBracket);
						setState(987);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(986);
							typeQualifierList(0);
							}
						}

						setState(990);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
							{
							setState(989);
							assignmentExpression();
							}
						}

						setState(992);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(993);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(994);
						match(LeftBracket);
						setState(995);
						match(Static);
						setState(997);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(996);
							typeQualifierList(0);
							}
						}

						setState(999);
						assignmentExpression();
						setState(1000);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1002);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1003);
						match(LeftBracket);
						setState(1004);
						typeQualifierList(0);
						setState(1005);
						match(Static);
						setState(1006);
						assignmentExpression();
						setState(1007);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1009);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1010);
						match(LeftBracket);
						setState(1011);
						match(Star);
						setState(1012);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1013);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1014);
						match(LeftParen);
						setState(1016);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
							{
							setState(1015);
							parameterTypeList();
							}
						}

						setState(1018);
						match(RightParen);
						setState(1022);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1019);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(1024);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(1029);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitTypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_initializer);
		try {
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				match(LeftBrace);
				setState(1034);
				initializerList(0);
				setState(1035);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1037);
				match(LeftBrace);
				setState(1038);
				initializerList(0);
				setState(1039);
				match(Comma);
				setState(1040);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(1045);
				designation();
				}
			}

			setState(1048);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(1058);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(1050);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1051);
					match(Comma);
					setState(1053);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(1052);
						designation();
						}
					}

					setState(1055);
					initializer();
					}
					} 
				}
				setState(1060);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitDesignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			designatorList(0);
			setState(1062);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorListContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterDesignatorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitDesignatorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitDesignatorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		return designatorList(0);
	}

	private DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1065);
			designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1071);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(1067);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1068);
					designator();
					}
					} 
				}
				setState(1073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_designator);
		try {
			setState(1080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				match(LeftBracket);
				setState(1075);
				constantExpression();
				setState(1076);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				match(Dot);
				setState(1079);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(CXParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CXParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitStaticAssertDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(StaticAssert);
			setState(1083);
			match(LeftParen);
			setState(1084);
			constantExpression();
			setState(1085);
			match(Comma);
			setState(1087); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1086);
				match(StringLiteral);
				}
				}
				setState(1089); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1091);
			match(RightParen);
			setState(1092);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_statement);
		int _la;
		try {
			setState(1131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1095);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1096);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1097);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1098);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1099);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1100);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1101);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1102);
				match(LeftParen);
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1103);
					logicalOrExpression(0);
					setState(1108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1104);
						match(Comma);
						setState(1105);
						logicalOrExpression(0);
						}
						}
						setState(1110);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1113);
					match(Colon);
					setState(1122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
						{
						setState(1114);
						logicalOrExpression(0);
						setState(1119);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1115);
							match(Comma);
							setState(1116);
							logicalOrExpression(0);
							}
							}
							setState(1121);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(1128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1129);
				match(RightParen);
				setState(1130);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_labeledStatement);
		try {
			setState(1144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1133);
				match(Identifier);
				setState(1134);
				match(Colon);
				setState(1135);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				match(Case);
				setState(1137);
				constantExpression();
				setState(1138);
				match(Colon);
				setState(1139);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1141);
				match(Default);
				setState(1142);
				match(Colon);
				setState(1143);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(LeftBrace);
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Public) | (1L << Private) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (AndAnd - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Semi - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (DigitSequence - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
				{
				setState(1147);
				blockItemList(0);
				}
			}

			setState(1150);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitBlockItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1153);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(1159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(1155);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1156);
					blockItem();
					}
					} 
				}
				setState(1161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_blockItem);
		try {
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1162);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
				{
				setState(1166);
				expression(0);
				}
			}

			setState(1169);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_selectionStatement);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				match(If);
				setState(1172);
				match(LeftParen);
				setState(1173);
				expression(0);
				setState(1174);
				match(RightParen);
				setState(1175);
				statement();
				setState(1178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1176);
					match(Else);
					setState(1177);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180);
				match(Switch);
				setState(1181);
				match(LeftParen);
				setState(1182);
				expression(0);
				setState(1183);
				match(RightParen);
				setState(1184);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CXParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CXParser.Do, 0); }
		public TerminalNode For() { return getToken(CXParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_iterationStatement);
		try {
			setState(1208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				match(While);
				setState(1189);
				match(LeftParen);
				setState(1190);
				expression(0);
				setState(1191);
				match(RightParen);
				setState(1192);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1194);
				match(Do);
				setState(1195);
				statement();
				setState(1196);
				match(While);
				setState(1197);
				match(LeftParen);
				setState(1198);
				expression(0);
				setState(1199);
				match(RightParen);
				setState(1200);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(1202);
				match(For);
				setState(1203);
				match(LeftParen);
				setState(1204);
				forCondition();
				setState(1205);
				match(RightParen);
				setState(1206);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_forCondition);
		int _la;
		try {
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1210);
				forDeclaration();
				setState(1211);
				match(Semi);
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1212);
					forExpression(0);
					}
				}

				setState(1215);
				match(Semi);
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1216);
					forExpression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1219);
					expression(0);
					}
				}

				setState(1222);
				match(Semi);
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1223);
					forExpression(0);
					}
				}

				setState(1226);
				match(Semi);
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1227);
					forExpression(0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_forDeclaration);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1232);
				declarationSpecifiers();
				setState(1233);
				initDeclaratorList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
				declarationSpecifiers();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		return forExpression(0);
	}

	private ForExpressionContext forExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, _parentState);
		ForExpressionContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_forExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1239);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forExpression);
					setState(1241);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1242);
					match(Comma);
					setState(1243);
					assignmentExpression();
					}
					} 
				}
				setState(1248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_jumpStatement);
		int _la;
		try {
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249);
				match(Goto);
				setState(1250);
				match(Identifier);
				setState(1251);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1252);
				match(Continue);
				setState(1253);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1254);
				match(Break);
				setState(1255);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1256);
				match(Return);
				setState(1258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1257);
					expression(0);
					}
				}

				setState(1260);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1261);
				match(Goto);
				setState(1262);
				unaryExpression();
				setState(1263);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CXParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Public) | (1L << Private) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Vertex) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Star - 78)) | (1L << (Caret - 78)) | (1L << (Semi - 78)) | (1L << (Identifier - 78)))) != 0)) {
				{
				setState(1267);
				translationUnit(0);
				}
			}

			setState(1270);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1273);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(1275);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1276);
					externalDeclaration();
					}
					} 
				}
				setState(1281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public VertexDefinitionContext vertexDefinition() {
			return getRuleContext(VertexDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_externalDeclaration);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				vertexDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1284);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1285);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VertexDefinitionContext extends ParserRuleContext {
		public TerminalNode Vertex() { return getToken(CXParser.Vertex, 0); }
		public TerminalNode Identifier() { return getToken(CXParser.Identifier, 0); }
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public VertexDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertexDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterVertexDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitVertexDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitVertexDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VertexDefinitionContext vertexDefinition() throws RecognitionException {
		VertexDefinitionContext _localctx = new VertexDefinitionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_vertexDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(Vertex);
			setState(1289);
			match(Identifier);
			setState(1290);
			match(LeftBrace);
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Public) | (1L << Private) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Star - 78)) | (1L << (Caret - 78)) | (1L << (Identifier - 78)))) != 0)) {
				{
				setState(1293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1291);
					functionDefinition();
					}
					break;
				case 2:
					{
					setState(1292);
					declaration();
					}
					break;
				}
				}
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1298);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Public || _la==Private) {
				{
				setState(1300);
				modifier();
				}
			}

			setState(1304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1303);
				declarationSpecifiers();
				}
				break;
			}
			setState(1306);
			declarator();
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Public) | (1L << Private) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1307);
				declarationList(0);
				}
			}

			setState(1310);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1313);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1315);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1316);
					declaration();
					}
					} 
				}
				setState(1321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(CXParser.Public, 0); }
		public TerminalNode Private() { return getToken(CXParser.Private, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CXVisitor ) return ((CXVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			_la = _input.LA(1);
			if ( !(_la==Public || _la==Private) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);
		case 4:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 5:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 9:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 10:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 11:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 12:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 13:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 14:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 15:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 16:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 17:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 18:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 28:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 31:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 34:
			return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);
		case 37:
			return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);
		case 40:
			return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);
		case 48:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 55:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 57:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 59:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 62:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		case 65:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 67:
			return designatorList_sempred((DesignatorListContext)_localctx, predIndex);
		case 73:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 80:
			return forExpression_sempred((ForExpressionContext)_localctx, predIndex);
		case 83:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 87:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean genericAssocList_sempred(GenericAssocListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 8);
		case 33:
			return precpred(_ctx, 7);
		case 34:
			return precpred(_ctx, 6);
		case 35:
			return precpred(_ctx, 5);
		case 36:
			return precpred(_ctx, 4);
		case 37:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 5);
		case 42:
			return precpred(_ctx, 4);
		case 43:
			return precpred(_ctx, 3);
		case 44:
			return precpred(_ctx, 2);
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean forExpression_sempred(ForExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3z\u052f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\2\6\2\u00b8\n\2\r\2\16"+
		"\2\u00b9\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00c2\n\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00d6\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00e5\n\4\f\4\16\4\u00e8"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f1\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0115\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u011f\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u012c\n\6\f\6\16\6\u012f\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u0137\n\7\f\7\16\7\u013a\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0152\n\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0163\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0171\n\13"+
		"\f\13\16\13\u0174\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u017f"+
		"\n\f\f\f\16\f\u0182\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u018d"+
		"\n\r\f\r\16\r\u0190\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01a1\n\16\f\16\16\16\u01a4\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01af\n\17\f\17\16"+
		"\17\u01b2\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01ba\n\20\f\20\16"+
		"\20\u01bd\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01c5\n\21\f\21\16"+
		"\21\u01c8\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01d0\n\22\f\22\16"+
		"\22\u01d3\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01db\n\23\f\23\16"+
		"\23\u01de\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01e6\n\24\f\24\16"+
		"\24\u01e9\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01f1\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u01f9\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u0203\n\30\f\30\16\30\u0206\13\30\3\31\3\31\3\32\5\32\u020b"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0215\n\32\3\33\6\33"+
		"\u0218\n\33\r\33\16\33\u0219\3\34\6\34\u021d\n\34\r\34\16\34\u021e\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0226\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36"+
		"\u022e\n\36\f\36\16\36\u0231\13\36\3\37\3\37\3\37\3\37\3\37\5\37\u0238"+
		"\n\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u024b\n!\3"+
		"!\3!\7!\u024f\n!\f!\16!\u0252\13!\3\"\3\"\5\"\u0256\n\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u025f\n\"\3#\3#\3$\3$\3$\3$\3$\7$\u0268\n$\f$\16$\u026b"+
		"\13$\3%\3%\5%\u026f\n%\3%\3%\3%\5%\u0274\n%\3&\3&\5&\u0278\n&\3&\3&\5"+
		"&\u027c\n&\5&\u027e\n&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0286\n\'\f\'\16\'"+
		"\u0289\13\'\3(\3(\5(\u028d\n(\3(\3(\5(\u0291\n(\3)\3)\5)\u0295\n)\3)\3"+
		")\3)\3)\3)\3)\5)\u029d\n)\3)\3)\3)\3)\3)\3)\3)\5)\u02a6\n)\3*\3*\3*\3"+
		"*\3*\3*\7*\u02ae\n*\f*\16*\u02b1\13*\3+\3+\3+\3+\3+\5+\u02b8\n+\3,\3,"+
		"\3-\3-\3-\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\5/\u02c9\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u02d5\n\60\3\61\5\61\u02d8\n\61\3"+
		"\61\3\61\7\61\u02dc\n\61\f\61\16\61\u02df\13\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02ec\n\62\3\62\3\62\3\62\3\62"+
		"\5\62\u02f2\n\62\3\62\3\62\3\62\5\62\u02f7\n\62\3\62\5\62\u02fa\n\62\3"+
		"\62\3\62\3\62\3\62\3\62\5\62\u0301\n\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0310\n\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u031c\n\62\3\62\7\62\u031f\n\62\f"+
		"\62\16\62\u0322\13\62\3\63\3\63\3\63\6\63\u0327\n\63\r\63\16\63\u0328"+
		"\3\63\3\63\5\63\u032d\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\7\65\u0339\n\65\f\65\16\65\u033c\13\65\3\65\5\65\u033f\n\65\3\66"+
		"\3\66\3\66\5\66\u0344\n\66\3\66\5\66\u0347\n\66\3\66\5\66\u034a\n\66\3"+
		"\67\3\67\3\67\3\67\3\67\7\67\u0351\n\67\f\67\16\67\u0354\13\67\38\38\5"+
		"8\u0358\n8\38\38\58\u035c\n8\38\38\38\58\u0361\n8\38\38\58\u0365\n8\3"+
		"8\58\u0368\n8\39\39\39\39\39\79\u036f\n9\f9\169\u0372\139\3:\3:\3:\3:"+
		"\3:\5:\u0379\n:\3;\3;\3;\3;\3;\3;\7;\u0381\n;\f;\16;\u0384\13;\3<\3<\3"+
		"<\3<\3<\5<\u038b\n<\5<\u038d\n<\3=\3=\3=\3=\3=\3=\7=\u0395\n=\f=\16=\u0398"+
		"\13=\3>\3>\5>\u039c\n>\3?\3?\5?\u03a0\n?\3?\3?\7?\u03a4\n?\f?\16?\u03a7"+
		"\13?\5?\u03a9\n?\3@\3@\3@\3@\3@\7@\u03b0\n@\f@\16@\u03b3\13@\3@\3@\5@"+
		"\u03b7\n@\3@\5@\u03ba\n@\3@\3@\3@\3@\5@\u03c0\n@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\5@\u03d0\n@\3@\3@\7@\u03d4\n@\f@\16@\u03d7\13@\5"+
		"@\u03d9\n@\3@\3@\3@\5@\u03de\n@\3@\5@\u03e1\n@\3@\3@\3@\3@\3@\5@\u03e8"+
		"\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u03fb\n@\3@"+
		"\3@\7@\u03ff\n@\f@\16@\u0402\13@\7@\u0404\n@\f@\16@\u0407\13@\3A\3A\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0415\nB\3C\3C\5C\u0419\nC\3C\3C\3C\3"+
		"C\3C\5C\u0420\nC\3C\7C\u0423\nC\fC\16C\u0426\13C\3D\3D\3D\3E\3E\3E\3E"+
		"\3E\7E\u0430\nE\fE\16E\u0433\13E\3F\3F\3F\3F\3F\3F\5F\u043b\nF\3G\3G\3"+
		"G\3G\3G\6G\u0442\nG\rG\16G\u0443\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\7H\u0455\nH\fH\16H\u0458\13H\5H\u045a\nH\3H\3H\3H\3H\7H\u0460"+
		"\nH\fH\16H\u0463\13H\5H\u0465\nH\7H\u0467\nH\fH\16H\u046a\13H\3H\3H\5"+
		"H\u046e\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u047b\nI\3J\3J\5J\u047f"+
		"\nJ\3J\3J\3K\3K\3K\3K\3K\7K\u0488\nK\fK\16K\u048b\13K\3L\3L\5L\u048f\n"+
		"L\3M\5M\u0492\nM\3M\3M\3N\3N\3N\3N\3N\3N\3N\5N\u049d\nN\3N\3N\3N\3N\3"+
		"N\3N\5N\u04a5\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\5O\u04bb\nO\3P\3P\3P\5P\u04c0\nP\3P\3P\5P\u04c4\nP\3P\5P\u04c7"+
		"\nP\3P\3P\5P\u04cb\nP\3P\3P\5P\u04cf\nP\5P\u04d1\nP\3Q\3Q\3Q\3Q\5Q\u04d7"+
		"\nQ\3R\3R\3R\3R\3R\3R\7R\u04df\nR\fR\16R\u04e2\13R\3S\3S\3S\3S\3S\3S\3"+
		"S\3S\3S\5S\u04ed\nS\3S\3S\3S\3S\3S\5S\u04f4\nS\3T\5T\u04f7\nT\3T\3T\3"+
		"U\3U\3U\3U\3U\7U\u0500\nU\fU\16U\u0503\13U\3V\3V\3V\3V\5V\u0509\nV\3W"+
		"\3W\3W\3W\3W\7W\u0510\nW\fW\16W\u0513\13W\3W\3W\3X\5X\u0518\nX\3X\5X\u051b"+
		"\nX\3X\3X\5X\u051f\nX\3X\3X\3Y\3Y\3Y\3Y\3Y\7Y\u0528\nY\fY\16Y\u052b\13"+
		"Y\3Z\3Z\3Z\2 \6\n\f\24\26\30\32\34\36 \"$&.:@FLRbptx~\u0084\u0088\u0094"+
		"\u00a2\u00a8\u00b0[\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\2\17\7\2"+
		"LLNNPPSSXY\3\2^h\b\2\21\21\34\34&&,,//??\13\2\6\b\24\24\31\31\35\35\""+
		"#)*\61\61\63\639:\3\2\6\b\4\2--\60\60\6\2\25\25\'\'\64\6488\5\2\n\13!"+
		"!==\4\2@A]]\3\2@A\4\2\r\r\17\17\4\2\20\20\64\64\3\2$%\2\u05a7\2\u00d5"+
		"\3\2\2\2\4\u00d7\3\2\2\2\6\u00de\3\2\2\2\b\u00f0\3\2\2\2\n\u0114\3\2\2"+
		"\2\f\u0130\3\2\2\2\16\u0151\3\2\2\2\20\u0153\3\2\2\2\22\u0162\3\2\2\2"+
		"\24\u0164\3\2\2\2\26\u0175\3\2\2\2\30\u0183\3\2\2\2\32\u0191\3\2\2\2\34"+
		"\u01a5\3\2\2\2\36\u01b3\3\2\2\2 \u01be\3\2\2\2\"\u01c9\3\2\2\2$\u01d4"+
		"\3\2\2\2&\u01df\3\2\2\2(\u01ea\3\2\2\2*\u01f8\3\2\2\2,\u01fa\3\2\2\2."+
		"\u01fc\3\2\2\2\60\u0207\3\2\2\2\62\u0214\3\2\2\2\64\u0217\3\2\2\2\66\u021c"+
		"\3\2\2\28\u0225\3\2\2\2:\u0227\3\2\2\2<\u0237\3\2\2\2>\u0239\3\2\2\2@"+
		"\u024a\3\2\2\2B\u025e\3\2\2\2D\u0260\3\2\2\2F\u0262\3\2\2\2H\u0273\3\2"+
		"\2\2J\u027d\3\2\2\2L\u027f\3\2\2\2N\u0290\3\2\2\2P\u02a5\3\2\2\2R\u02a7"+
		"\3\2\2\2T\u02b7\3\2\2\2V\u02b9\3\2\2\2X\u02bb\3\2\2\2Z\u02c0\3\2\2\2\\"+
		"\u02c8\3\2\2\2^\u02d4\3\2\2\2`\u02d7\3\2\2\2b\u02f1\3\2\2\2d\u032c\3\2"+
		"\2\2f\u032e\3\2\2\2h\u033e\3\2\2\2j\u0349\3\2\2\2l\u0352\3\2\2\2n\u0367"+
		"\3\2\2\2p\u0369\3\2\2\2r\u0378\3\2\2\2t\u037a\3\2\2\2v\u038c\3\2\2\2x"+
		"\u038e\3\2\2\2z\u0399\3\2\2\2|\u03a8\3\2\2\2~\u03d8\3\2\2\2\u0080\u0408"+
		"\3\2\2\2\u0082\u0414\3\2\2\2\u0084\u0416\3\2\2\2\u0086\u0427\3\2\2\2\u0088"+
		"\u042a\3\2\2\2\u008a\u043a\3\2\2\2\u008c\u043c\3\2\2\2\u008e\u046d\3\2"+
		"\2\2\u0090\u047a\3\2\2\2\u0092\u047c\3\2\2\2\u0094\u0482\3\2\2\2\u0096"+
		"\u048e\3\2\2\2\u0098\u0491\3\2\2\2\u009a\u04a4\3\2\2\2\u009c\u04ba\3\2"+
		"\2\2\u009e\u04d0\3\2\2\2\u00a0\u04d6\3\2\2\2\u00a2\u04d8\3\2\2\2\u00a4"+
		"\u04f3\3\2\2\2\u00a6\u04f6\3\2\2\2\u00a8\u04fa\3\2\2\2\u00aa\u0508\3\2"+
		"\2\2\u00ac\u050a\3\2\2\2\u00ae\u0517\3\2\2\2\u00b0\u0522\3\2\2\2\u00b2"+
		"\u052c\3\2\2\2\u00b4\u00d6\7n\2\2\u00b5\u00d6\7o\2\2\u00b6\u00b8\7q\2"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00d6\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\5.\30\2\u00bd"+
		"\u00be\7A\2\2\u00be\u00d6\3\2\2\2\u00bf\u00d6\5\4\3\2\u00c0\u00c2\7\3"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\7@\2\2\u00c4\u00c5\5\u0092J\2\u00c5\u00c6\7A\2\2\u00c6\u00d6\3"+
		"\2\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00c9\7@\2\2\u00c9\u00ca\5\16\b\2\u00ca"+
		"\u00cb\7]\2\2\u00cb\u00cc\5z>\2\u00cc\u00cd\7A\2\2\u00cd\u00d6\3\2\2\2"+
		"\u00ce\u00cf\7\5\2\2\u00cf\u00d0\7@\2\2\u00d0\u00d1\5z>\2\u00d1\u00d2"+
		"\7]\2\2\u00d2\u00d3\5\16\b\2\u00d3\u00d4\7A\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00b4\3\2\2\2\u00d5\u00b5\3\2\2\2\u00d5\u00b7\3\2\2\2\u00d5\u00bb\3\2"+
		"\2\2\u00d5\u00bf\3\2\2\2\u00d5\u00c1\3\2\2\2\u00d5\u00c7\3\2\2\2\u00d5"+
		"\u00ce\3\2\2\2\u00d6\3\3\2\2\2\u00d7\u00d8\7;\2\2\u00d8\u00d9\7@\2\2\u00d9"+
		"\u00da\5*\26\2\u00da\u00db\7]\2\2\u00db\u00dc\5\6\4\2\u00dc\u00dd\7A\2"+
		"\2\u00dd\5\3\2\2\2\u00de\u00df\b\4\1\2\u00df\u00e0\5\b\5\2\u00e0\u00e6"+
		"\3\2\2\2\u00e1\u00e2\f\3\2\2\u00e2\u00e3\7]\2\2\u00e3\u00e5\5\b\5\2\u00e4"+
		"\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\7\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\5z>\2\u00ea\u00eb"+
		"\7[\2\2\u00eb\u00ec\5*\26\2\u00ec\u00f1\3\2\2\2\u00ed\u00ee\7\27\2\2\u00ee"+
		"\u00ef\7[\2\2\u00ef\u00f1\5*\26\2\u00f0\u00e9\3\2\2\2\u00f0\u00ed\3\2"+
		"\2\2\u00f1\t\3\2\2\2\u00f2\u00f3\b\6\1\2\u00f3\u0115\5\2\2\2\u00f4\u00f5"+
		"\7@\2\2\u00f5\u00f6\5z>\2\u00f6\u00f7\7A\2\2\u00f7\u00f8\7D\2\2\u00f8"+
		"\u00f9\5\u0084C\2\u00f9\u00fa\7E\2\2\u00fa\u0115\3\2\2\2\u00fb\u00fc\7"+
		"@\2\2\u00fc\u00fd\5z>\2\u00fd\u00fe\7A\2\2\u00fe\u00ff\7D\2\2\u00ff\u0100"+
		"\5\u0084C\2\u0100\u0101\7]\2\2\u0101\u0102\7E\2\2\u0102\u0115\3\2\2\2"+
		"\u0103\u0104\7\3\2\2\u0104\u0105\7@\2\2\u0105\u0106\5z>\2\u0106\u0107"+
		"\7A\2\2\u0107\u0108\7D\2\2\u0108\u0109\5\u0084C\2\u0109\u010a\7E\2\2\u010a"+
		"\u0115\3\2\2\2\u010b\u010c\7\3\2\2\u010c\u010d\7@\2\2\u010d\u010e\5z>"+
		"\2\u010e\u010f\7A\2\2\u010f\u0110\7D\2\2\u0110\u0111\5\u0084C\2\u0111"+
		"\u0112\7]\2\2\u0112\u0113\7E\2\2\u0113\u0115\3\2\2\2\u0114\u00f2\3\2\2"+
		"\2\u0114\u00f4\3\2\2\2\u0114\u00fb\3\2\2\2\u0114\u0103\3\2\2\2\u0114\u010b"+
		"\3\2\2\2\u0115\u012d\3\2\2\2\u0116\u0117\f\f\2\2\u0117\u0118\7B\2\2\u0118"+
		"\u0119\5.\30\2\u0119\u011a\7C\2\2\u011a\u012c\3\2\2\2\u011b\u011c\f\13"+
		"\2\2\u011c\u011e\7@\2\2\u011d\u011f\5\f\7\2\u011e\u011d\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u012c\7A\2\2\u0121\u0122\f\n"+
		"\2\2\u0122\u0123\7l\2\2\u0123\u012c\7n\2\2\u0124\u0125\f\t\2\2\u0125\u0126"+
		"\7k\2\2\u0126\u012c\7n\2\2\u0127\u0128\f\b\2\2\u0128\u012c\7M\2\2\u0129"+
		"\u012a\f\7\2\2\u012a\u012c\7O\2\2\u012b\u0116\3\2\2\2\u012b\u011b\3\2"+
		"\2\2\u012b\u0121\3\2\2\2\u012b\u0124\3\2\2\2\u012b\u0127\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\13\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\b\7\1\2\u0131\u0132"+
		"\5*\26\2\u0132\u0138\3\2\2\2\u0133\u0134\f\3\2\2\u0134\u0135\7]\2\2\u0135"+
		"\u0137\5*\26\2\u0136\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\r\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0152"+
		"\5\n\6\2\u013c\u013d\7M\2\2\u013d\u0152\5\16\b\2\u013e\u013f\7O\2\2\u013f"+
		"\u0152\5\16\b\2\u0140\u0141\5\20\t\2\u0141\u0142\5\22\n\2\u0142\u0152"+
		"\3\2\2\2\u0143\u0144\7+\2\2\u0144\u0152\5\16\b\2\u0145\u0146\7+\2\2\u0146"+
		"\u0147\7@\2\2\u0147\u0148\5z>\2\u0148\u0149\7A\2\2\u0149\u0152\3\2\2\2"+
		"\u014a\u014b\7\67\2\2\u014b\u014c\7@\2\2\u014c\u014d\5z>\2\u014d\u014e"+
		"\7A\2\2\u014e\u0152\3\2\2\2\u014f\u0150\7U\2\2\u0150\u0152\7n\2\2\u0151"+
		"\u013b\3\2\2\2\u0151\u013c\3\2\2\2\u0151\u013e\3\2\2\2\u0151\u0140\3\2"+
		"\2\2\u0151\u0143\3\2\2\2\u0151\u0145\3\2\2\2\u0151\u014a\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\17\3\2\2\2\u0153\u0154\t\2\2\2\u0154\21\3\2\2\2\u0155"+
		"\u0156\7@\2\2\u0156\u0157\5z>\2\u0157\u0158\7A\2\2\u0158\u0159\5\22\n"+
		"\2\u0159\u0163\3\2\2\2\u015a\u015b\7\3\2\2\u015b\u015c\7@\2\2\u015c\u015d"+
		"\5z>\2\u015d\u015e\7A\2\2\u015e\u015f\5\22\n\2\u015f\u0163\3\2\2\2\u0160"+
		"\u0163\5\16\b\2\u0161\u0163\7p\2\2\u0162\u0155\3\2\2\2\u0162\u015a\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\23\3\2\2\2\u0164\u0165"+
		"\b\13\1\2\u0165\u0166\5\22\n\2\u0166\u0172\3\2\2\2\u0167\u0168\f\5\2\2"+
		"\u0168\u0169\7P\2\2\u0169\u0171\5\22\n\2\u016a\u016b\f\4\2\2\u016b\u016c"+
		"\7Q\2\2\u016c\u0171\5\22\n\2\u016d\u016e\f\3\2\2\u016e\u016f\7R\2\2\u016f"+
		"\u0171\5\22\n\2\u0170\u0167\3\2\2\2\u0170\u016a\3\2\2\2\u0170\u016d\3"+
		"\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\25\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\b\f\1\2\u0176\u0177\5\24\13"+
		"\2\u0177\u0180\3\2\2\2\u0178\u0179\f\4\2\2\u0179\u017a\7L\2\2\u017a\u017f"+
		"\5\24\13\2\u017b\u017c\f\3\2\2\u017c\u017d\7N\2\2\u017d\u017f\5\24\13"+
		"\2\u017e\u0178\3\2\2\2\u017e\u017b\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\27\3\2\2\2\u0182\u0180\3\2\2\2\u0183"+
		"\u0184\b\r\1\2\u0184\u0185\5\26\f\2\u0185\u018e\3\2\2\2\u0186\u0187\f"+
		"\4\2\2\u0187\u0188\7J\2\2\u0188\u018d\5\26\f\2\u0189\u018a\f\3\2\2\u018a"+
		"\u018b\7K\2\2\u018b\u018d\5\26\f\2\u018c\u0186\3\2\2\2\u018c\u0189\3\2"+
		"\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\31\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\b\16\1\2\u0192\u0193\5\30"+
		"\r\2\u0193\u01a2\3\2\2\2\u0194\u0195\f\6\2\2\u0195\u0196\7F\2\2\u0196"+
		"\u01a1\5\30\r\2\u0197\u0198\f\5\2\2\u0198\u0199\7H\2\2\u0199\u01a1\5\30"+
		"\r\2\u019a\u019b\f\4\2\2\u019b\u019c\7G\2\2\u019c\u01a1\5\30\r\2\u019d"+
		"\u019e\f\3\2\2\u019e\u019f\7I\2\2\u019f\u01a1\5\30\r\2\u01a0\u0194\3\2"+
		"\2\2\u01a0\u0197\3\2\2\2\u01a0\u019a\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\33\3\2\2"+
		"\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\b\17\1\2\u01a6\u01a7\5\32\16\2\u01a7"+
		"\u01b0\3\2\2\2\u01a8\u01a9\f\4\2\2\u01a9\u01aa\7i\2\2\u01aa\u01af\5\32"+
		"\16\2\u01ab\u01ac\f\3\2\2\u01ac\u01ad\7j\2\2\u01ad\u01af\5\32\16\2\u01ae"+
		"\u01a8\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\35\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4"+
		"\b\20\1\2\u01b4\u01b5\5\34\17\2\u01b5\u01bb\3\2\2\2\u01b6\u01b7\f\3\2"+
		"\2\u01b7\u01b8\7S\2\2\u01b8\u01ba\5\34\17\2\u01b9\u01b6\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\37\3\2\2"+
		"\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\b\21\1\2\u01bf\u01c0\5\36\20\2\u01c0"+
		"\u01c6\3\2\2\2\u01c1\u01c2\f\3\2\2\u01c2\u01c3\7W\2\2\u01c3\u01c5\5\36"+
		"\20\2\u01c4\u01c1\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7!\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\b\22\1\2"+
		"\u01ca\u01cb\5 \21\2\u01cb\u01d1\3\2\2\2\u01cc\u01cd\f\3\2\2\u01cd\u01ce"+
		"\7T\2\2\u01ce\u01d0\5 \21\2\u01cf\u01cc\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2#\3\2\2\2\u01d3\u01d1\3\2\2\2"+
		"\u01d4\u01d5\b\23\1\2\u01d5\u01d6\5\"\22\2\u01d6\u01dc\3\2\2\2\u01d7\u01d8"+
		"\f\3\2\2\u01d8\u01d9\7U\2\2\u01d9\u01db\5\"\22\2\u01da\u01d7\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd%\3\2\2\2"+
		"\u01de\u01dc\3\2\2\2\u01df\u01e0\b\24\1\2\u01e0\u01e1\5$\23\2\u01e1\u01e7"+
		"\3\2\2\2\u01e2\u01e3\f\3\2\2\u01e3\u01e4\7V\2\2\u01e4\u01e6\5$\23\2\u01e5"+
		"\u01e2\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8\'\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01f0\5&\24\2\u01eb\u01ec"+
		"\7Z\2\2\u01ec\u01ed\5.\30\2\u01ed\u01ee\7[\2\2\u01ee\u01ef\5(\25\2\u01ef"+
		"\u01f1\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1)\3\2\2\2"+
		"\u01f2\u01f9\5(\25\2\u01f3\u01f4\5\16\b\2\u01f4\u01f5\5,\27\2\u01f5\u01f6"+
		"\5*\26\2\u01f6\u01f9\3\2\2\2\u01f7\u01f9\7p\2\2\u01f8\u01f2\3\2\2\2\u01f8"+
		"\u01f3\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9+\3\2\2\2\u01fa\u01fb\t\3\2\2"+
		"\u01fb-\3\2\2\2\u01fc\u01fd\b\30\1\2\u01fd\u01fe\5*\26\2\u01fe\u0204\3"+
		"\2\2\2\u01ff\u0200\f\3\2\2\u0200\u0201\7]\2\2\u0201\u0203\5*\26\2\u0202"+
		"\u01ff\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205/\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\5(\25\2\u0208\61\3"+
		"\2\2\2\u0209\u020b\5\u00b2Z\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2"+
		"\u020b\u020c\3\2\2\2\u020c\u020d\5\64\33\2\u020d\u020e\5:\36\2\u020e\u020f"+
		"\7\\\2\2\u020f\u0215\3\2\2\2\u0210\u0211\5\64\33\2\u0211\u0212\7\\\2\2"+
		"\u0212\u0215\3\2\2\2\u0213\u0215\5\u008cG\2\u0214\u020a\3\2\2\2\u0214"+
		"\u0210\3\2\2\2\u0214\u0213\3\2\2\2\u0215\63\3\2\2\2\u0216\u0218\58\35"+
		"\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\65\3\2\2\2\u021b\u021d\58\35\2\u021c\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\67\3\2\2"+
		"\2\u0220\u0226\5> \2\u0221\u0226\5@!\2\u0222\u0226\5Z.\2\u0223\u0226\5"+
		"\\/\2\u0224\u0226\5^\60\2\u0225\u0220\3\2\2\2\u0225\u0221\3\2\2\2\u0225"+
		"\u0222\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0224\3\2\2\2\u02269\3\2\2\2"+
		"\u0227\u0228\b\36\1\2\u0228\u0229\5<\37\2\u0229\u022f\3\2\2\2\u022a\u022b"+
		"\f\3\2\2\u022b\u022c\7]\2\2\u022c\u022e\5<\37\2\u022d\u022a\3\2\2\2\u022e"+
		"\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230;\3\2\2\2"+
		"\u0231\u022f\3\2\2\2\u0232\u0238\5`\61\2\u0233\u0234\5`\61\2\u0234\u0235"+
		"\7^\2\2\u0235\u0236\5\u0082B\2\u0236\u0238\3\2\2\2\u0237\u0232\3\2\2\2"+
		"\u0237\u0233\3\2\2\2\u0238=\3\2\2\2\u0239\u023a\t\4\2\2\u023a?\3\2\2\2"+
		"\u023b\u023c\b!\1\2\u023c\u024b\t\5\2\2\u023d\u023e\7\3\2\2\u023e\u023f"+
		"\7@\2\2\u023f\u0240\t\6\2\2\u0240\u024b\7A\2\2\u0241\u024b\5X-\2\u0242"+
		"\u024b\5B\"\2\u0243\u024b\5P)\2\u0244\u024b\5\u0080A\2\u0245\u0246\7\t"+
		"\2\2\u0246\u0247\7@\2\2\u0247\u0248\5\60\31\2\u0248\u0249\7A\2\2\u0249"+
		"\u024b\3\2\2\2\u024a\u023b\3\2\2\2\u024a\u023d\3\2\2\2\u024a\u0241\3\2"+
		"\2\2\u024a\u0242\3\2\2\2\u024a\u0243\3\2\2\2\u024a\u0244\3\2\2\2\u024a"+
		"\u0245\3\2\2\2\u024b\u0250\3\2\2\2\u024c\u024d\f\3\2\2\u024d\u024f\5n"+
		"8\2\u024e\u024c\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251A\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0255\5D#\2\u0254"+
		"\u0256\7n\2\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2"+
		"\2\2\u0257\u0258\7D\2\2\u0258\u0259\5F$\2\u0259\u025a\7E\2\2\u025a\u025f"+
		"\3\2\2\2\u025b\u025c\5D#\2\u025c\u025d\7n\2\2\u025d\u025f\3\2\2\2\u025e"+
		"\u0253\3\2\2\2\u025e\u025b\3\2\2\2\u025fC\3\2\2\2\u0260\u0261\t\7\2\2"+
		"\u0261E\3\2\2\2\u0262\u0263\b$\1\2\u0263\u0264\5H%\2\u0264\u0269\3\2\2"+
		"\2\u0265\u0266\f\3\2\2\u0266\u0268\5H%\2\u0267\u0265\3\2\2\2\u0268\u026b"+
		"\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026aG\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u026e\5J&\2\u026d\u026f\5L\'\2\u026e\u026d\3\2\2"+
		"\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\7\\\2\2\u0271\u0274"+
		"\3\2\2\2\u0272\u0274\5\u008cG\2\u0273\u026c\3\2\2\2\u0273\u0272\3\2\2"+
		"\2\u0274I\3\2\2\2\u0275\u0277\5@!\2\u0276\u0278\5J&\2\u0277\u0276\3\2"+
		"\2\2\u0277\u0278\3\2\2\2\u0278\u027e\3\2\2\2\u0279\u027b\5Z.\2\u027a\u027c"+
		"\5J&\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d"+
		"\u0275\3\2\2\2\u027d\u0279\3\2\2\2\u027eK\3\2\2\2\u027f\u0280\b\'\1\2"+
		"\u0280\u0281\5N(\2\u0281\u0287\3\2\2\2\u0282\u0283\f\3\2\2\u0283\u0284"+
		"\7]\2\2\u0284\u0286\5N(\2\u0285\u0282\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288M\3\2\2\2\u0289\u0287\3\2\2\2"+
		"\u028a\u0291\5`\61\2\u028b\u028d\5`\61\2\u028c\u028b\3\2\2\2\u028c\u028d"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\7[\2\2\u028f\u0291\5\60\31\2"+
		"\u0290\u028a\3\2\2\2\u0290\u028c\3\2\2\2\u0291O\3\2\2\2\u0292\u0294\7"+
		"\33\2\2\u0293\u0295\7n\2\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0296\3\2\2\2\u0296\u0297\7D\2\2\u0297\u0298\5R*\2\u0298\u0299\7E\2\2"+
		"\u0299\u02a6\3\2\2\2\u029a\u029c\7\33\2\2\u029b\u029d\7n\2\2\u029c\u029b"+
		"\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7D\2\2\u029f"+
		"\u02a0\5R*\2\u02a0\u02a1\7]\2\2\u02a1\u02a2\7E\2\2\u02a2\u02a6\3\2\2\2"+
		"\u02a3\u02a4\7\33\2\2\u02a4\u02a6\7n\2\2\u02a5\u0292\3\2\2\2\u02a5\u029a"+
		"\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6Q\3\2\2\2\u02a7\u02a8\b*\1\2\u02a8\u02a9"+
		"\5T+\2\u02a9\u02af\3\2\2\2\u02aa\u02ab\f\3\2\2\u02ab\u02ac\7]\2\2\u02ac"+
		"\u02ae\5T+\2\u02ad\u02aa\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2"+
		"\2\u02af\u02b0\3\2\2\2\u02b0S\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b8"+
		"\5V,\2\u02b3\u02b4\5V,\2\u02b4\u02b5\7^\2\2\u02b5\u02b6\5\60\31\2\u02b6"+
		"\u02b8\3\2\2\2\u02b7\u02b2\3\2\2\2\u02b7\u02b3\3\2\2\2\u02b8U\3\2\2\2"+
		"\u02b9\u02ba\7n\2\2\u02baW\3\2\2\2\u02bb\u02bc\78\2\2\u02bc\u02bd\7@\2"+
		"\2\u02bd\u02be\5z>\2\u02be\u02bf\7A\2\2\u02bfY\3\2\2\2\u02c0\u02c1\t\b"+
		"\2\2\u02c1[\3\2\2\2\u02c2\u02c9\t\t\2\2\u02c3\u02c9\5f\64\2\u02c4\u02c5"+
		"\7\f\2\2\u02c5\u02c6\7@\2\2\u02c6\u02c7\7n\2\2\u02c7\u02c9\7A\2\2\u02c8"+
		"\u02c2\3\2\2\2\u02c8\u02c3\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c9]\3\2\2\2"+
		"\u02ca\u02cb\7\66\2\2\u02cb\u02cc\7@\2\2\u02cc\u02cd\5z>\2\u02cd\u02ce"+
		"\7A\2\2\u02ce\u02d5\3\2\2\2\u02cf\u02d0\7\66\2\2\u02d0\u02d1\7@\2\2\u02d1"+
		"\u02d2\5\60\31\2\u02d2\u02d3\7A\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02ca\3"+
		"\2\2\2\u02d4\u02cf\3\2\2\2\u02d5_\3\2\2\2\u02d6\u02d8\5n8\2\u02d7\u02d6"+
		"\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02dd\5b\62\2\u02da"+
		"\u02dc\5d\63\2\u02db\u02da\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2"+
		"\2\2\u02dd\u02de\3\2\2\2\u02dea\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1"+
		"\b\62\1\2\u02e1\u02f2\7n\2\2\u02e2\u02e3\7@\2\2\u02e3\u02e4\5`\61\2\u02e4"+
		"\u02e5\7A\2\2\u02e5\u02f2\3\2\2\2\u02e6\u02e7\7n\2\2\u02e7\u02e8\7[\2"+
		"\2\u02e8\u02f2\7p\2\2\u02e9\u02eb\7@\2\2\u02ea\u02ec\5@!\2\u02eb\u02ea"+
		"\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\5n8\2\u02ee"+
		"\u02ef\5b\62\2\u02ef\u02f0\7A\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02e0\3\2"+
		"\2\2\u02f1\u02e2\3\2\2\2\u02f1\u02e6\3\2\2\2\u02f1\u02e9\3\2\2\2\u02f2"+
		"\u0320\3\2\2\2\u02f3\u02f4\f\n\2\2\u02f4\u02f6\7B\2\2\u02f5\u02f7\5p9"+
		"\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02fa"+
		"\5*\26\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u031f\7C\2\2\u02fc\u02fd\f\t\2\2\u02fd\u02fe\7B\2\2\u02fe\u0300\7,\2"+
		"\2\u02ff\u0301\5p9\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302"+
		"\3\2\2\2\u0302\u0303\5*\26\2\u0303\u0304\7C\2\2\u0304\u031f\3\2\2\2\u0305"+
		"\u0306\f\b\2\2\u0306\u0307\7B\2\2\u0307\u0308\5p9\2\u0308\u0309\7,\2\2"+
		"\u0309\u030a\5*\26\2\u030a\u030b\7C\2\2\u030b\u031f\3\2\2\2\u030c\u030d"+
		"\f\7\2\2\u030d\u030f\7B\2\2\u030e\u0310\5p9\2\u030f\u030e\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\7P\2\2\u0312\u031f\7C\2"+
		"\2\u0313\u0314\f\6\2\2\u0314\u0315\7@\2\2\u0315\u0316\5r:\2\u0316\u0317"+
		"\7A\2\2\u0317\u031f\3\2\2\2\u0318\u0319\f\5\2\2\u0319\u031b\7@\2\2\u031a"+
		"\u031c\5x=\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2\2"+
		"\2\u031d\u031f\7A\2\2\u031e\u02f3\3\2\2\2\u031e\u02fc\3\2\2\2\u031e\u0305"+
		"\3\2\2\2\u031e\u030c\3\2\2\2\u031e\u0313\3\2\2\2\u031e\u0318\3\2\2\2\u031f"+
		"\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321c\3\2\2\2"+
		"\u0322\u0320\3\2\2\2\u0323\u0324\7\r\2\2\u0324\u0326\7@\2\2\u0325\u0327"+
		"\7q\2\2\u0326\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0326\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032d\7A\2\2\u032b\u032d\5f\64"+
		"\2\u032c\u0323\3\2\2\2\u032c\u032b\3\2\2\2\u032de\3\2\2\2\u032e\u032f"+
		"\7\16\2\2\u032f\u0330\7@\2\2\u0330\u0331\7@\2\2\u0331\u0332\5h\65\2\u0332"+
		"\u0333\7A\2\2\u0333\u0334\7A\2\2\u0334g\3\2\2\2\u0335\u033a\5j\66\2\u0336"+
		"\u0337\7]\2\2\u0337\u0339\5j\66\2\u0338\u0336\3\2\2\2\u0339\u033c\3\2"+
		"\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033f\3\2\2\2\u033c"+
		"\u033a\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u0335\3\2\2\2\u033e\u033d\3\2"+
		"\2\2\u033fi\3\2\2\2\u0340\u0346\n\n\2\2\u0341\u0343\7@\2\2\u0342\u0344"+
		"\5\f\7\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345"+
		"\u0347\7A\2\2\u0346\u0341\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u034a\3\2"+
		"\2\2\u0348\u034a\3\2\2\2\u0349\u0340\3\2\2\2\u0349\u0348\3\2\2\2\u034a"+
		"k\3\2\2\2\u034b\u0351\n\13\2\2\u034c\u034d\7@\2\2\u034d\u034e\5l\67\2"+
		"\u034e\u034f\7A\2\2\u034f\u0351\3\2\2\2\u0350\u034b\3\2\2\2\u0350\u034c"+
		"\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"m\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0357\7P\2\2\u0356\u0358\5p9\2\u0357"+
		"\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0368\3\2\2\2\u0359\u035b\7P"+
		"\2\2\u035a\u035c\5p9\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d"+
		"\3\2\2\2\u035d\u0368\5n8\2\u035e\u0360\7W\2\2\u035f\u0361\5p9\2\u0360"+
		"\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0368\3\2\2\2\u0362\u0364\7W"+
		"\2\2\u0363\u0365\5p9\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366"+
		"\3\2\2\2\u0366\u0368\5n8\2\u0367\u0355\3\2\2\2\u0367\u0359\3\2\2\2\u0367"+
		"\u035e\3\2\2\2\u0367\u0362\3\2\2\2\u0368o\3\2\2\2\u0369\u036a\b9\1\2\u036a"+
		"\u036b\5Z.\2\u036b\u0370\3\2\2\2\u036c\u036d\f\3\2\2\u036d\u036f\5Z.\2"+
		"\u036e\u036c\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371"+
		"\3\2\2\2\u0371q\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0379\5t;\2\u0374\u0375"+
		"\5t;\2\u0375\u0376\7]\2\2\u0376\u0377\7m\2\2\u0377\u0379\3\2\2\2\u0378"+
		"\u0373\3\2\2\2\u0378\u0374\3\2\2\2\u0379s\3\2\2\2\u037a\u037b\b;\1\2\u037b"+
		"\u037c\5v<\2\u037c\u0382\3\2\2\2\u037d\u037e\f\3\2\2\u037e\u037f\7]\2"+
		"\2\u037f\u0381\5v<\2\u0380\u037d\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380"+
		"\3\2\2\2\u0382\u0383\3\2\2\2\u0383u\3\2\2\2\u0384\u0382\3\2\2\2\u0385"+
		"\u0386\5\64\33\2\u0386\u0387\5`\61\2\u0387\u038d\3\2\2\2\u0388\u038a\5"+
		"\66\34\2\u0389\u038b\5|?\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038d\3\2\2\2\u038c\u0385\3\2\2\2\u038c\u0388\3\2\2\2\u038dw\3\2\2\2"+
		"\u038e\u038f\b=\1\2\u038f\u0390\7n\2\2\u0390\u0396\3\2\2\2\u0391\u0392"+
		"\f\3\2\2\u0392\u0393\7]\2\2\u0393\u0395\7n\2\2\u0394\u0391\3\2\2\2\u0395"+
		"\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397y\3\2\2\2"+
		"\u0398\u0396\3\2\2\2\u0399\u039b\5J&\2\u039a\u039c\5|?\2\u039b\u039a\3"+
		"\2\2\2\u039b\u039c\3\2\2\2\u039c{\3\2\2\2\u039d\u03a9\5n8\2\u039e\u03a0"+
		"\5n8\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u03a5\5~@\2\u03a2\u03a4\5d\63\2\u03a3\u03a2\3\2\2\2\u03a4\u03a7\3\2\2"+
		"\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5"+
		"\3\2\2\2\u03a8\u039d\3\2\2\2\u03a8\u039f\3\2\2\2\u03a9}\3\2\2\2\u03aa"+
		"\u03ab\b@\1\2\u03ab\u03ac\7@\2\2\u03ac\u03ad\5|?\2\u03ad\u03b1\7A\2\2"+
		"\u03ae\u03b0\5d\63\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03d9\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4"+
		"\u03b6\7B\2\2\u03b5\u03b7\5p9\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2"+
		"\2\u03b7\u03b9\3\2\2\2\u03b8\u03ba\5*\26\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03d9\7C\2\2\u03bc\u03bd\7B\2\2\u03bd"+
		"\u03bf\7,\2\2\u03be\u03c0\5p9\2\u03bf\u03be\3\2\2\2\u03bf\u03c0\3\2\2"+
		"\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\5*\26\2\u03c2\u03c3\7C\2\2\u03c3\u03d9"+
		"\3\2\2\2\u03c4\u03c5\7B\2\2\u03c5\u03c6\5p9\2\u03c6\u03c7\7,\2\2\u03c7"+
		"\u03c8\5*\26\2\u03c8\u03c9\7C\2\2\u03c9\u03d9\3\2\2\2\u03ca\u03cb\7B\2"+
		"\2\u03cb\u03cc\7P\2\2\u03cc\u03d9\7C\2\2\u03cd\u03cf\7@\2\2\u03ce\u03d0"+
		"\5r:\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d5\7A\2\2\u03d2\u03d4\5d\63\2\u03d3\u03d2\3\2\2\2\u03d4\u03d7\3\2"+
		"\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7"+
		"\u03d5\3\2\2\2\u03d8\u03aa\3\2\2\2\u03d8\u03b4\3\2\2\2\u03d8\u03bc\3\2"+
		"\2\2\u03d8\u03c4\3\2\2\2\u03d8\u03ca\3\2\2\2\u03d8\u03cd\3\2\2\2\u03d9"+
		"\u0405\3\2\2\2\u03da\u03db\f\7\2\2\u03db\u03dd\7B\2\2\u03dc\u03de\5p9"+
		"\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\3\2\2\2\u03df\u03e1"+
		"\5*\26\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u0404\7C\2\2\u03e3\u03e4\f\6\2\2\u03e4\u03e5\7B\2\2\u03e5\u03e7\7,\2"+
		"\2\u03e6\u03e8\5p9\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9"+
		"\3\2\2\2\u03e9\u03ea\5*\26\2\u03ea\u03eb\7C\2\2\u03eb\u0404\3\2\2\2\u03ec"+
		"\u03ed\f\5\2\2\u03ed\u03ee\7B\2\2\u03ee\u03ef\5p9\2\u03ef\u03f0\7,\2\2"+
		"\u03f0\u03f1\5*\26\2\u03f1\u03f2\7C\2\2\u03f2\u0404\3\2\2\2\u03f3\u03f4"+
		"\f\4\2\2\u03f4\u03f5\7B\2\2\u03f5\u03f6\7P\2\2\u03f6\u0404\7C\2\2\u03f7"+
		"\u03f8\f\3\2\2\u03f8\u03fa\7@\2\2\u03f9\u03fb\5r:\2\u03fa\u03f9\3\2\2"+
		"\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u0400\7A\2\2\u03fd\u03ff"+
		"\5d\63\2\u03fe\u03fd\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400"+
		"\u0401\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u03da\3\2"+
		"\2\2\u0403\u03e3\3\2\2\2\u0403\u03ec\3\2\2\2\u0403\u03f3\3\2\2\2\u0403"+
		"\u03f7\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2"+
		"\2\2\u0406\177\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u0409\7n\2\2\u0409\u0081"+
		"\3\2\2\2\u040a\u0415\5*\26\2\u040b\u040c\7D\2\2\u040c\u040d\5\u0084C\2"+
		"\u040d\u040e\7E\2\2\u040e\u0415\3\2\2\2\u040f\u0410\7D\2\2\u0410\u0411"+
		"\5\u0084C\2\u0411\u0412\7]\2\2\u0412\u0413\7E\2\2\u0413\u0415\3\2\2\2"+
		"\u0414\u040a\3\2\2\2\u0414\u040b\3\2\2\2\u0414\u040f\3\2\2\2\u0415\u0083"+
		"\3\2\2\2\u0416\u0418\bC\1\2\u0417\u0419\5\u0086D\2\u0418\u0417\3\2\2\2"+
		"\u0418\u0419\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b\5\u0082B\2\u041b"+
		"\u0424\3\2\2\2\u041c\u041d\f\3\2\2\u041d\u041f\7]\2\2\u041e\u0420\5\u0086"+
		"D\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3\2\2\2\u0421"+
		"\u0423\5\u0082B\2\u0422\u041c\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422"+
		"\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0085\3\2\2\2\u0426\u0424\3\2\2\2\u0427"+
		"\u0428\5\u0088E\2\u0428\u0429\7^\2\2\u0429\u0087\3\2\2\2\u042a\u042b\b"+
		"E\1\2\u042b\u042c\5\u008aF\2\u042c\u0431\3\2\2\2\u042d\u042e\f\3\2\2\u042e"+
		"\u0430\5\u008aF\2\u042f\u042d\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f"+
		"\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0089\3\2\2\2\u0433\u0431\3\2\2\2\u0434"+
		"\u0435\7B\2\2\u0435\u0436\5\60\31\2\u0436\u0437\7C\2\2\u0437\u043b\3\2"+
		"\2\2\u0438\u0439\7l\2\2\u0439\u043b\7n\2\2\u043a\u0434\3\2\2\2\u043a\u0438"+
		"\3\2\2\2\u043b\u008b\3\2\2\2\u043c\u043d\7>\2\2\u043d\u043e\7@\2\2\u043e"+
		"\u043f\5\60\31\2\u043f\u0441\7]\2\2\u0440\u0442\7q\2\2\u0441\u0440\3\2"+
		"\2\2\u0442\u0443\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444"+
		"\u0445\3\2\2\2\u0445\u0446\7A\2\2\u0446\u0447\7\\\2\2\u0447\u008d\3\2"+
		"\2\2\u0448\u046e\5\u0090I\2\u0449\u046e\5\u0092J\2\u044a\u046e\5\u0098"+
		"M\2\u044b\u046e\5\u009aN\2\u044c\u046e\5\u009cO\2\u044d\u046e\5\u00a4"+
		"S\2\u044e\u044f\t\f\2\2\u044f\u0450\t\r\2\2\u0450\u0459\7@\2\2\u0451\u0456"+
		"\5&\24\2\u0452\u0453\7]\2\2\u0453\u0455\5&\24\2\u0454\u0452\3\2\2\2\u0455"+
		"\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u045a\3\2"+
		"\2\2\u0458\u0456\3\2\2\2\u0459\u0451\3\2\2\2\u0459\u045a\3\2\2\2\u045a"+
		"\u0468\3\2\2\2\u045b\u0464\7[\2\2\u045c\u0461\5&\24\2\u045d\u045e\7]\2"+
		"\2\u045e\u0460\5&\24\2\u045f\u045d\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f"+
		"\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0464"+
		"\u045c\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0467\3\2\2\2\u0466\u045b\3\2"+
		"\2\2\u0467\u046a\3\2\2\2\u0468\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469"+
		"\u046b\3\2\2\2\u046a\u0468\3\2\2\2\u046b\u046c\7A\2\2\u046c\u046e\7\\"+
		"\2\2\u046d\u0448\3\2\2\2\u046d\u0449\3\2\2\2\u046d\u044a\3\2\2\2\u046d"+
		"\u044b\3\2\2\2\u046d\u044c\3\2\2\2\u046d\u044d\3\2\2\2\u046d\u044e\3\2"+
		"\2\2\u046e\u008f\3\2\2\2\u046f\u0470\7n\2\2\u0470\u0471\7[\2\2\u0471\u047b"+
		"\5\u008eH\2\u0472\u0473\7\23\2\2\u0473\u0474\5\60\31\2\u0474\u0475\7["+
		"\2\2\u0475\u0476\5\u008eH\2\u0476\u047b\3\2\2\2\u0477\u0478\7\27\2\2\u0478"+
		"\u0479\7[\2\2\u0479\u047b\5\u008eH\2\u047a\u046f\3\2\2\2\u047a\u0472\3"+
		"\2\2\2\u047a\u0477\3\2\2\2\u047b\u0091\3\2\2\2\u047c\u047e\7D\2\2\u047d"+
		"\u047f\5\u0094K\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480"+
		"\3\2\2\2\u0480\u0481\7E\2\2\u0481\u0093\3\2\2\2\u0482\u0483\bK\1\2\u0483"+
		"\u0484\5\u0096L\2\u0484\u0489\3\2\2\2\u0485\u0486\f\3\2\2\u0486\u0488"+
		"\5\u0096L\2\u0487\u0485\3\2\2\2\u0488\u048b\3\2\2\2\u0489\u0487\3\2\2"+
		"\2\u0489\u048a\3\2\2\2\u048a\u0095\3\2\2\2\u048b\u0489\3\2\2\2\u048c\u048f"+
		"\5\u008eH\2\u048d\u048f\5\62\32\2\u048e\u048c\3\2\2\2\u048e\u048d\3\2"+
		"\2\2\u048f\u0097\3\2\2\2\u0490\u0492\5.\30\2\u0491\u0490\3\2\2\2\u0491"+
		"\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\7\\\2\2\u0494\u0099\3\2"+
		"\2\2\u0495\u0496\7 \2\2\u0496\u0497\7@\2\2\u0497\u0498\5.\30\2\u0498\u0499"+
		"\7A\2\2\u0499\u049c\5\u008eH\2\u049a\u049b\7\32\2\2\u049b\u049d\5\u008e"+
		"H\2\u049c\u049a\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u04a5\3\2\2\2\u049e"+
		"\u049f\7.\2\2\u049f\u04a0\7@\2\2\u04a0\u04a1\5.\30\2\u04a1\u04a2\7A\2"+
		"\2\u04a2\u04a3\5\u008eH\2\u04a3\u04a5\3\2\2\2\u04a4\u0495\3\2\2\2\u04a4"+
		"\u049e\3\2\2\2\u04a5\u009b\3\2\2\2\u04a6\u04a7\7\65\2\2\u04a7\u04a8\7"+
		"@\2\2\u04a8\u04a9\5.\30\2\u04a9\u04aa\7A\2\2\u04aa\u04ab\5\u008eH\2\u04ab"+
		"\u04bb\3\2\2\2\u04ac\u04ad\7\30\2\2\u04ad\u04ae\5\u008eH\2\u04ae\u04af"+
		"\7\65\2\2\u04af\u04b0\7@\2\2\u04b0\u04b1\5.\30\2\u04b1\u04b2\7A\2\2\u04b2"+
		"\u04b3\7\\\2\2\u04b3\u04bb\3\2\2\2\u04b4\u04b5\7\36\2\2\u04b5\u04b6\7"+
		"@\2\2\u04b6\u04b7\5\u009eP\2\u04b7\u04b8\7A\2\2\u04b8\u04b9\5\u008eH\2"+
		"\u04b9\u04bb\3\2\2\2\u04ba\u04a6\3\2\2\2\u04ba\u04ac\3\2\2\2\u04ba\u04b4"+
		"\3\2\2\2\u04bb\u009d\3\2\2\2\u04bc\u04bd\5\u00a0Q\2\u04bd\u04bf\7\\\2"+
		"\2\u04be\u04c0\5\u00a2R\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u04c3\7\\\2\2\u04c2\u04c4\5\u00a2R\2\u04c3\u04c2"+
		"\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04d1\3\2\2\2\u04c5\u04c7\5.\30\2\u04c6"+
		"\u04c5\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\7\\"+
		"\2\2\u04c9\u04cb\5\u00a2R\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb"+
		"\u04cc\3\2\2\2\u04cc\u04ce\7\\\2\2\u04cd\u04cf\5\u00a2R\2\u04ce\u04cd"+
		"\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04bc\3\2\2\2\u04d0"+
		"\u04c6\3\2\2\2\u04d1\u009f\3\2\2\2\u04d2\u04d3\5\64\33\2\u04d3\u04d4\5"+
		":\36\2\u04d4\u04d7\3\2\2\2\u04d5\u04d7\5\64\33\2\u04d6\u04d2\3\2\2\2\u04d6"+
		"\u04d5\3\2\2\2\u04d7\u00a1\3\2\2\2\u04d8\u04d9\bR\1\2\u04d9\u04da\5*\26"+
		"\2\u04da\u04e0\3\2\2\2\u04db\u04dc\f\3\2\2\u04dc\u04dd\7]\2\2\u04dd\u04df"+
		"\5*\26\2\u04de\u04db\3\2\2\2\u04df\u04e2\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0"+
		"\u04e1\3\2\2\2\u04e1\u00a3\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04e4\7\37"+
		"\2\2\u04e4\u04e5\7n\2\2\u04e5\u04f4\7\\\2\2\u04e6\u04e7\7\26\2\2\u04e7"+
		"\u04f4\7\\\2\2\u04e8\u04e9\7\22\2\2\u04e9\u04f4\7\\\2\2\u04ea\u04ec\7"+
		"(\2\2\u04eb\u04ed\5.\30\2\u04ec\u04eb\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u04ee\3\2\2\2\u04ee\u04f4\7\\\2\2\u04ef\u04f0\7\37\2\2\u04f0\u04f1\5"+
		"\16\b\2\u04f1\u04f2\7\\\2\2\u04f2\u04f4\3\2\2\2\u04f3\u04e3\3\2\2\2\u04f3"+
		"\u04e6\3\2\2\2\u04f3\u04e8\3\2\2\2\u04f3\u04ea\3\2\2\2\u04f3\u04ef\3\2"+
		"\2\2\u04f4\u00a5\3\2\2\2\u04f5\u04f7\5\u00a8U\2\u04f6\u04f5\3\2\2\2\u04f6"+
		"\u04f7\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\7\2\2\3\u04f9\u00a7\3\2"+
		"\2\2\u04fa\u04fb\bU\1\2\u04fb\u04fc\5\u00aaV\2\u04fc\u0501\3\2\2\2\u04fd"+
		"\u04fe\f\3\2\2\u04fe\u0500\5\u00aaV\2\u04ff\u04fd\3\2\2\2\u0500\u0503"+
		"\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u00a9\3\2\2\2\u0503"+
		"\u0501\3\2\2\2\u0504\u0509\5\u00acW\2\u0505\u0509\5\u00aeX\2\u0506\u0509"+
		"\5\62\32\2\u0507\u0509\7\\\2\2\u0508\u0504\3\2\2\2\u0508\u0505\3\2\2\2"+
		"\u0508\u0506\3\2\2\2\u0508\u0507\3\2\2\2\u0509\u00ab\3\2\2\2\u050a\u050b"+
		"\7\62\2\2\u050b\u050c\7n\2\2\u050c\u0511\7D\2\2\u050d\u0510\5\u00aeX\2"+
		"\u050e\u0510\5\62\32\2\u050f\u050d\3\2\2\2\u050f\u050e\3\2\2\2\u0510\u0513"+
		"\3\2\2\2\u0511\u050f\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\3\2\2\2\u0513"+
		"\u0511\3\2\2\2\u0514\u0515\7E\2\2\u0515\u00ad\3\2\2\2\u0516\u0518\5\u00b2"+
		"Z\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519"+
		"\u051b\5\64\33\2\u051a\u0519\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c\3"+
		"\2\2\2\u051c\u051e\5`\61\2\u051d\u051f\5\u00b0Y\2\u051e\u051d\3\2\2\2"+
		"\u051e\u051f\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521\5\u0092J\2\u0521"+
		"\u00af\3\2\2\2\u0522\u0523\bY\1\2\u0523\u0524\5\62\32\2\u0524\u0529\3"+
		"\2\2\2\u0525\u0526\f\3\2\2\u0526\u0528\5\62\32\2\u0527\u0525\3\2\2\2\u0528"+
		"\u052b\3\2\2\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u00b1\3\2"+
		"\2\2\u052b\u0529\3\2\2\2\u052c\u052d\t\16\2\2\u052d\u00b3\3\2\2\2\u0094"+
		"\u00b9\u00c1\u00d5\u00e6\u00f0\u0114\u011e\u012b\u012d\u0138\u0151\u0162"+
		"\u0170\u0172\u017e\u0180\u018c\u018e\u01a0\u01a2\u01ae\u01b0\u01bb\u01c6"+
		"\u01d1\u01dc\u01e7\u01f0\u01f8\u0204\u020a\u0214\u0219\u021e\u0225\u022f"+
		"\u0237\u024a\u0250\u0255\u025e\u0269\u026e\u0273\u0277\u027b\u027d\u0287"+
		"\u028c\u0290\u0294\u029c\u02a5\u02af\u02b7\u02c8\u02d4\u02d7\u02dd\u02eb"+
		"\u02f1\u02f6\u02f9\u0300\u030f\u031b\u031e\u0320\u0328\u032c\u033a\u033e"+
		"\u0343\u0346\u0349\u0350\u0352\u0357\u035b\u0360\u0364\u0367\u0370\u0378"+
		"\u0382\u038a\u038c\u0396\u039b\u039f\u03a5\u03a8\u03b1\u03b6\u03b9\u03bf"+
		"\u03cf\u03d5\u03d8\u03dd\u03e0\u03e7\u03fa\u0400\u0403\u0405\u0414\u0418"+
		"\u041f\u0424\u0431\u043a\u0443\u0456\u0459\u0461\u0464\u0468\u046d\u047a"+
		"\u047e\u0489\u048e\u0491\u049c\u04a4\u04ba\u04bf\u04c3\u04c6\u04ca\u04ce"+
		"\u04d0\u04d6\u04e0\u04ec\u04f3\u04f6\u0501\u0508\u050f\u0511\u0517\u051a"+
		"\u051e\u0529";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}