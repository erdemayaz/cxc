package rule;

import antlr.CXBaseListener;
import antlr.CXParser;
import antlr.CXParser.BlockItemContext;
import antlr.CXParser.DeclarationSpecifierContext;
import antlr.CXParser.DirectDeclaratorContext;
import antlr.CXParser.FunctionDefinitionContext;
import antlr.CXParser.ParameterDeclarationContext;
import antlr.CXParser.TypeSpecifierContext;
import antlr.CXParser.VertexDefinitionContext;
import cxc.Error;
import cxc.Modifier;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import rule.Declaration.DeclarationListener;
import rule.Specifier.SpecifierListener;
import rule.Statement.StatementListener;

/**
 *
 * @author Erdem Ayaz
 */
public class Function extends Rule implements RuleAction, Serializable {
    private String identifier = null;
    private int identifierStart;
    private int identifierStop;
    private int functionStart;
    private int functionStop;
    private String pointer = null;
    private Modifier modifier = null;
    private Vertex parent = null;
    private ArrayList<Declaration> declarations = null;
    private ArrayList<Statement> statements = null;
    private final ArrayList<Specifier> specifiers;
    private final ArrayList<ArrayList<String>> parameterSpecifiers;

    public Function() {
        this.specifiers = new ArrayList<>();
        this.parameterSpecifiers = new ArrayList<>();
    }
    
    @Override
    public void analyze() {
        modifierAnalysis();
        declarationAnalysis();
        statementAnalysis();
    }

    @Override
    public void coding() {
        
    }

    @Override
    public void assemble() {
        
    }
    
    private void modifierAnalysis() {
        if(modifier != Modifier.DEFAULT && parent == null) {
            cxc.Error.message(cxc.Exception.Error.INCOMPATIBLE_MODIFIER, 
                    "Usage of modifier is incompatible for function '" 
                            + identifier + "'");
        }
    }
    
    private void declarationAnalysis() {
        if(declarations != null) {
            ArrayList<String> declarationNames = new ArrayList<>();
            declarations.stream().forEach((d) -> {
                if(!declarationNames.contains(d.getIdentifier())) {
                    declarationNames.add(d.getIdentifier());
                } else {
                    cxc.Error.message(cxc.Exception.Error.MULTIPLE_IDENTIFIER, 
                            "Multiple declaration identifier '" + 
                                    d.getIdentifier() + "' in " + identifier);
                }
                d.analyze(); 
            });
        }
    }
    
    private void statementAnalysis() {
        if(statements != null) {
            statements.stream().forEach((s) -> { s.analyze(); });
        }
    }
    
    public Declaration getDeclarationByIdentifier(String identifier) {
        if(declarations != null) {
            for(Declaration d : declarations) {
                if(d.getIdentifier().equals(identifier))
                    return d;
            }
        }
        return null;
    }
    
    public Specifier getTypeSpecifier() {
        if(specifiers != null) {
            for(Specifier s : specifiers) {
                if(s.getContext().equals(TypeSpecifierContext.class)) {
                    return s;
                }
            }
        }
        return null;
    }
    
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getIdentifierStart() {
        return identifierStart;
    }

    public void setIdentifierStart(int identifierStart) {
        this.identifierStart = identifierStart;
    }

    public int getIdentifierStop() {
        return identifierStop;
    }

    public void setIdentifierStop(int identifierStop) {
        this.identifierStop = identifierStop;
    }

    public int getFunctionStart() {
        return functionStart;
    }

    public void setFunctionStart(int functionStart) {
        this.functionStart = functionStart;
    }

    public int getFunctionStop() {
        return functionStop;
    }

    public void setFunctionStop(int functionStop) {
        this.functionStop = functionStop;
    }

    public String getPointer() {
        return pointer;
    }

    public void setPointer(String pointer) {
        this.pointer = pointer;
    }

    public Modifier getModifier() {
        return modifier;
    }

    public void setModifier(Modifier modifier) {
        this.modifier = modifier;
    }

    public Vertex getParent() {
        return parent;
    }

    public ArrayList<Specifier> getSpecifiers() {
        return specifiers;
    }
    
    public void addSpecifiers(ArrayList<Specifier> specifiers) {
        this.specifiers.addAll(specifiers);
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }
    
    public void addParameterSpecifiers(ArrayList<String> specifiers) {
        parameterSpecifiers.add(specifiers);
    }

    public ArrayList<ArrayList<String>> getParameterSpecifiers() {
        return parameterSpecifiers;
    }
    
    public void addDeclaration(Declaration declaration) {
        if(declarations == null)
            declarations = new ArrayList<>();
        declarations.add(declaration);
    }
    
    public void addDeclarations(ArrayList<Declaration> declarations) {
        if(this.declarations == null)
            this.declarations = new ArrayList<>();
        this.declarations.addAll(declarations);
    }
    
    public void addStatement(Statement statement) {
        if(statements == null)
            statements = new ArrayList<>();
        statements.add(statement);
    }

    public ArrayList<Declaration> getDeclarations() {
        return declarations;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }
    
    public static class FunctionListener extends CXBaseListener {
        private final Function f;
        private final String source;

        public FunctionListener(String source) {
            this.f = new Function();
            this.source = source;
        }

        @Override
        public void enterFunctionDefinition(FunctionDefinitionContext ctx) {
            if(ctx != null) {
                // function complete text
                f.setText(Util.getRuleText(source, ctx));
                f.setFunctionStart(ctx.start.getStartIndex());
                f.setFunctionStop(ctx.stop.getStopIndex());

                // modifier
                if(ctx.modifier() != null) {
                    if(ctx.modifier().Public() != null)
                        f.setModifier(Modifier.PUBLIC);
                    else
                        f.setModifier(Modifier.PRIVATE);
                } else {
                    f.setModifier(Modifier.DEFAULT);
                }
                
                // pointers
                if(ctx.declarator().pointer() != null) {
                    f.setPointer(Util.getRuleText(source, ctx.declarator().pointer()));
                }

                // parameter specs
                DirectDeclaratorContext ddctx = ctx.declarator().directDeclarator();
                if(ddctx.directDeclarator() != null) {
                    if(ddctx.directDeclarator().Identifier() != null) {
                        f.setIdentifier(ddctx.directDeclarator().Identifier().getText());

                        if(ddctx.identifierList() == null) {
                            if(ddctx.parameterTypeList() != null) {
                                ArrayList<ParseTree> pDecl = Util
                                            .tree2list(ddctx.parameterTypeList().parameterList(), 3);
                                pDecl.stream().map((pt) -> (ParameterDeclarationContext) pt).forEach((pdctx) -> {
                                    if(pdctx.declarationSpecifiers() != null) {
                                        List<DeclarationSpecifierContext> dsctx 
                                                = pdctx.declarationSpecifiers().declarationSpecifier();
                                        ArrayList<String> specs = new ArrayList<>();
                                        dsctx.stream().forEach((dsctx2) -> {
                                            specs.add(Util.getRuleText(source, dsctx2));
                                        });
                                        f.addParameterSpecifiers(specs);
                                    } else { // declaration specifiers 2 rule
                                        List<DeclarationSpecifierContext> dsctx 
                                                = pdctx.declarationSpecifiers2().declarationSpecifier();
                                        ArrayList<String> specs = new ArrayList<>();
                                        dsctx.stream().forEach((dsctx2) -> {
                                            specs.add(Util.getRuleText(source, dsctx2));
                                        });
                                        f.addParameterSpecifiers(specs);
                                    }
                                });

                                if(ddctx.parameterTypeList().getChildCount() == 3) {
                                    // ( , ...)
                                    ArrayList<String> specs = new ArrayList<>();
                                    specs.add("ellipsis");
                                    f.addParameterSpecifiers(specs);
                                }
                            } else {
                                // error
                            }
                        } else {
                            // error for function definition form
                        }
                    } else {
                        // error for function form
                    }
                } else {
                    // error for function form
                }
                
                // function specs
                if(ctx.declarationSpecifiers() != null) {
                    SpecifierListener sl = new SpecifierListener(source);
                    ctx.declarationSpecifiers().enterRule(sl);
                    
                    f.addSpecifiers(sl.getSpecifiers());
                } else {
                    if(f.getIdentifier() != null) {
                        if(ctx.parent.getClass().equals(VertexDefinitionContext.class)) {
                            VertexDefinitionContext vdctx = 
                                    (VertexDefinitionContext) ctx.parent;
                            if(!f.getIdentifier().equals(vdctx.Identifier().getText())) {
                                Error.message(cxc.Exception.Error.NO_SPECIFIER, 
                                        "Function has not specifier", 
                                        Util.getRuleLine(source, ctx));
                            }
                        } else {
                            Error.message(cxc.Exception.Error.NO_SPECIFIER, 
                                    "Function has not specifier", 
                                        Util.getRuleLine(source, ctx));
                        }
                    }
                }

                if(ctx.compoundStatement().blockItemList() != null) {
                    ArrayList<ParseTree> pt = Util
                            .tree2list(ctx.compoundStatement().blockItemList(), 2);
                    pt.stream().forEach((p) -> {
                        BlockItemContext bictx = (BlockItemContext) p;
                        if(bictx.declaration() != null) { // declaration
                            DeclarationListener dl = new DeclarationListener(source);
                            bictx.declaration().enterRule(dl);
                            dl.getDeclarations().stream().forEach((decl) -> {
                                decl.setParent(f);
                            });
                            f.addDeclarations(dl.getDeclarations());
                        } else { // statement
                            StatementListener sl = new StatementListener(source);
                            bictx.statement().enterRule(sl);
                            sl.getStatement().setParent(f);
                            f.addStatement(sl.getStatement());
                        }
                    });
                }

            }
        }

        public Function getFunction() {
            return f;
        }
    }
}
