package rule;

import antlr.CXBaseListener;
import antlr.CXParser;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;
import rule.Declaration.DeclarationListener;
import rule.Function.FunctionListener;

/**
 *
 * @author Erdem Ayaz
 */
public class Vertex extends Rule implements RuleAction, Serializable {
    
    private String identifier;
    
    private ArrayList<Declaration> declarations = null;
    private ArrayList<Function> functions = null;
    
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    public void addDeclarations(ArrayList<Declaration> declaration) {
        if(declarations == null)
            declarations = new ArrayList<>();
        declarations.addAll(declaration);
    }
    
    public ArrayList<Declaration> getDeclarations() {
        return declarations;
    }
    
    public void addFunction(Function function) {
        if(functions == null)
            functions = new ArrayList<>();
        functions.add(function);
    }
    
    public ArrayList<Function> getFunctions() {
        return functions;
    }
    
    @Override
    public void analyze() {
        
    }

    @Override
    public void coding() {
        
    }

    @Override
    public void assemble() {
        
    }
    
    public static class VertexListener extends CXBaseListener {
        private final Vertex v;
        private final String source;

        public VertexListener(String source) {
            this.v = new Vertex();
            this.source = source;
        }

        @Override
        public void enterVertexDefinition(CXParser.VertexDefinitionContext ctx) {
            if(ctx != null) {
                v.setText(Util.getRuleText(source, ctx));
                v.setIdentifier(ctx.Identifier().toString());
                ctx.declaration().stream().forEach((d) -> {
                    DeclarationListener dl = new DeclarationListener(source);
                    d.enterRule(dl);
                    v.addDeclarations(dl.getDeclarations());
                });
                
                ctx.functionDefinition().stream().forEach((f) -> {
                    FunctionListener fl = new FunctionListener(source);
                    f.enterRule(fl);
                    v.addFunction(fl.getFunction());
                });
            }
        }

        public Vertex getVertex() {
            return v;
        }
    }
}
