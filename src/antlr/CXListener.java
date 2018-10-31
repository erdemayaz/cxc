// Generated from CX.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CXParser}.
 */
public interface CXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CXParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CXParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CXParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(CXParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(CXParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(CXParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(CXParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(CXParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(CXParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CXParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CXParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(CXParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(CXParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CXParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CXParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CXParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CXParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CXParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CXParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CXParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CXParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CXParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CXParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CXParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CXParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CXParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CXParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CXParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CXParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CXParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CXParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(CXParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(CXParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(CXParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(CXParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CXParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CXParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CXParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CXParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CXParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CXParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CXParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CXParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CXParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CXParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CXParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CXParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CXParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CXParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CXParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CXParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(CXParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(CXParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(CXParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(CXParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(CXParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(CXParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(CXParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(CXParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(CXParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(CXParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(CXParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(CXParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CXParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CXParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(CXParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(CXParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(CXParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(CXParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(CXParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(CXParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CXParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CXParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(CXParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(CXParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(CXParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(CXParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(CXParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(CXParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(CXParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(CXParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(CXParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(CXParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(CXParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(CXParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(CXParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(CXParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(CXParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(CXParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(CXParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(CXParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(CXParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(CXParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(CXParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(CXParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CXParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CXParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(CXParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(CXParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(CXParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(CXParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(CXParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(CXParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(CXParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(CXParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(CXParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(CXParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(CXParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(CXParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(CXParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(CXParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(CXParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(CXParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(CXParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(CXParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CXParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CXParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(CXParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(CXParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(CXParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(CXParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(CXParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(CXParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(CXParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(CXParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(CXParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(CXParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(CXParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(CXParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CXParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CXParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(CXParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(CXParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(CXParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(CXParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(CXParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(CXParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(CXParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(CXParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(CXParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(CXParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CXParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CXParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(CXParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(CXParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CXParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CXParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(CXParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(CXParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(CXParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(CXParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CXParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CXParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(CXParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(CXParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(CXParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(CXParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(CXParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(CXParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(CXParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(CXParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(CXParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(CXParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(CXParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(CXParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CXParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CXParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(CXParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(CXParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(CXParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(CXParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#vertexDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVertexDefinition(CXParser.VertexDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#vertexDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVertexDefinition(CXParser.VertexDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CXParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CXParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(CXParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(CXParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(CXParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(CXParser.ModifierContext ctx);
}