package rule;

import antlr.CXBaseListener;
import antlr.CXParser;
import cxc.Error;
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
    
    private void parameterSpecifiersAnalysis(int bottom, int top) {
        for(int k = 0; k < functions.get(bottom)
                .getParameterSpecifiers().size(); ++k) {
            ArrayList<String> common 
                        = Util.stringListRetain(functions.get(bottom)
                                .getParameterSpecifiers().get(k), 
                                functions.get(top).getParameterSpecifiers().get(k));
            if(common.size() > 0) {
                common.stream().forEach((c) -> {
                    if(c.equals("void") || c.equals("char") || c.equals("short") || 
                       c.equals("int") || c.equals("long") || c.equals("float") || 
                       c.equals("double") || c.equals("signed") || c.equals("unsigned") || 
                       c.equals("_Bool") || c.equals("_Complex") || c.equals("__m128") || 
                       c.equals("void") || c.equals("__m128d") || c.equals("__m128i") || 
                       c.startsWith("__extension__") || c.startsWith("__typeof__")) {
                        Error.message(Error.OVERLOADING_ERROR, 
                                "cannot overload with same parameters(function '" 
                                        + functions.get(top).getIdentifier() + "')");
                    }
                });
            }
        }
    }
    
    @Override
    public void analyze() {
        // declarations analysis
        if(declarations != null) {
            ArrayList<String> declarationNames = new ArrayList<>();
            declarations.stream().forEach((d) -> {
                if(!declarationNames.contains(d.getIdentifier())) {
                    declarationNames.add(d.getIdentifier());
                } else {
                    cxc.Error.message(cxc.Error.MULTIPLE_IDENTIFIER, 
                            "Multiple declaration identifier '" + 
                                    d.getIdentifier() + "' in vertex " + 
                                    identifier);
                }
                d.analyze(); 
            });
        }
        
        // functions analysis
        if(functions != null) {
            if(functions.size() > 1) {
                functions.get(0).analyze();
                String top, bottom;
                int sTop, sBottom;
                for(int i = 1; i < functions.size(); ++i) {
                    for(int j = 0; j < i; ++j) {
                        top = functions.get(j).getIdentifier();
                        bottom = functions.get(i).getIdentifier();
                        sTop = functions.get(j).getParameterSpecifiers().size();
                        sBottom = functions.get(i).getParameterSpecifiers().size();
                        // compare identifiers and parameters count
                        if(top.equals(bottom) && (sTop == sBottom)) {
                            parameterSpecifiersAnalysis(i,j);
                        }
                    }
                    functions.get(i).analyze();
                }
            } else if(functions.size() == 1) {
                functions.get(0).analyze();
            }
        }
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
