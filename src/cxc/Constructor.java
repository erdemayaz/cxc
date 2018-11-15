package cxc;

import antlr.CXBaseListener;
import antlr.CXParser;
import antlr.CXParser.DeclarationContext;
import antlr.CXParser.ExternalDeclarationContext;
import antlr.CXParser.FunctionDefinitionContext;
import antlr.CXParser.VertexDefinitionContext;
import java.util.ArrayList;
import org.antlr.v4.runtime.tree.ParseTree;
import rule.Declaration.DeclarationListener;
import rule.Function.FunctionListener;
import rule.Vertex.VertexListener;

/**
 *
 * @author Erdem Ayaz
 */
public class Constructor extends CXBaseListener {
    private final AST tree;
    private final String source;

    public Constructor(String source) {
        this.source = source;
        this.tree = new AST();
    }
    
    @Override
    public void enterTranslationUnit(CXParser.TranslationUnitContext ctx) {
        ArrayList<ParseTree> externals = Util.tree2list(ctx, 2);
        externals.stream().forEach((external) -> {
            ExternalDeclarationContext ectx = (ExternalDeclarationContext) external;
            if(ectx.getChild(0).getClass() == DeclarationContext.class) {
                DeclarationListener dl = new DeclarationListener(source);
                DeclarationContext dctx = (DeclarationContext) ectx.getChild(0);
                dctx.enterRule(dl);
                tree.addDeclarations(dl.getDeclarations());
            } else if(ectx.getChild(0).getClass() == FunctionDefinitionContext.class) {
                FunctionListener fl = new FunctionListener(source);
                FunctionDefinitionContext fctx = (FunctionDefinitionContext)ectx.getChild(0);
                fctx.enterRule(fl);
                tree.addFunction(fl.getFunction());
            } else if(ectx.getChild(0).getClass() == VertexDefinitionContext.class) {
                VertexListener vl = new VertexListener(source);
                VertexDefinitionContext vctx = (VertexDefinitionContext) ectx.getChild(0);
                vctx.enterRule(vl);
                tree.addVertex(vl.getVertex());
            }
        });
    }

    @Override
    public void enterCompilationUnit(CXParser.CompilationUnitContext ctx) {
        if(ctx.translationUnit() != null) {
            ctx.translationUnit().enterRule(this);
        } else { // empty source
            Error.message(Exception.Error.EMPTY_SOURCE, "Source file empty");
        }
    }
    
    public AST getTree() {
        return tree;
    }
}
