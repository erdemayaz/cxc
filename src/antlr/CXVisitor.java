// Generated from CX.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CXVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CXParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CXParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(CXParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(CXParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(CXParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(CXParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(CXParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CXParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(CXParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(CXParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CXParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CXParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(CXParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CXParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CXParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CXParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(CXParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(CXParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(CXParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(CXParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CXParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CXParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CXParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CXParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(CXParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CXParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(CXParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(CXParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(CXParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(CXParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(CXParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(CXParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(CXParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(CXParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(CXParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(CXParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(CXParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(CXParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(CXParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(CXParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(CXParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(CXParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(CXParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(CXParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(CXParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(CXParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(CXParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(CXParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(CXParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(CXParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(CXParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(CXParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(CXParser.GccAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(CXParser.GccAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(CXParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(CXParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(CXParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(CXParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(CXParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(CXParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(CXParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(CXParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(CXParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(CXParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(CXParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(CXParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(CXParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(CXParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(CXParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(CXParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(CXParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CXParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(CXParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CXParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(CXParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(CXParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CXParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(CXParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(CXParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(CXParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(CXParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(CXParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(CXParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CXParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(CXParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(CXParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#vertexDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertexDefinition(CXParser.VertexDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CXParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(CXParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CXParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(CXParser.ModifierContext ctx);
}