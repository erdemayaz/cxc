package rule;

import antlr.CXBaseListener;
import antlr.CXParser.BlockItemContext;
import antlr.CXParser.DeclarationSpecifierContext;
import antlr.CXParser.DirectDeclaratorContext;
import antlr.CXParser.FunctionDefinitionContext;
import antlr.CXParser.ParameterDeclarationContext;
import cxc.Modifier;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import rule.Declaration.DeclarationListener;
import rule.Statement.StatementListener;

/**
 *
 * @author Erdem Ayaz
 */
public class Function extends Rule implements RuleAction, Serializable {
    private String identifier;
    private int identifierStart;
    private int identifierStop;
    private int functionStart;
    private int functionStop;
    private String pointer = null;
    private Modifier modifier = null;
    private Vertex parent = null;
    private ArrayList<Declaration> declarations = null;
    private ArrayList<Statement> statements = null;
    private final ArrayList<String> specifiers;
    private final ArrayList<ArrayList<String>> parameterSpecifiers;

    public Function() {
        this.specifiers = new ArrayList<>();
        this.parameterSpecifiers = new ArrayList<>();
    }
    
    @Override
    public void analyze() {
        // modifier control
        modifierAnalysis();
        
        // declarations analysis
        if(declarations != null) {
            ArrayList<String> declarationNames = new ArrayList<>();
            declarations.stream().forEach((d) -> {
                if(!declarationNames.contains(d.getIdentifier())) {
                    declarationNames.add(d.getIdentifier());
                } else {
                    cxc.Error.message(cxc.Error.MULTIPLE_IDENTIFIER, 
                            "Multiple declaration identifier '" + 
                                    d.getIdentifier() + "' in " + identifier);
                }
                d.analyze(); 
            });
        }
        
        // statements analysis
        if(statements != null) {
            statements.stream().forEach((s) -> { s.analyze(); });
        }
    }

    @Override
    public void coding() {
        
    }

    @Override
    public void assemble() {
        
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
    
    private void modifierAnalysis() {
        if(modifier != Modifier.DEFAULT && parent == null) {
            cxc.Error.message(cxc.Error.INCOMPATIBLE_MODIFIER, 
                    "Usage of modifier is incompatible for function '" 
                            + identifier + "'");
        }
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

    public ArrayList<String> getSpecifiers() {
        return specifiers;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }
    
    public void addSpecifier(String specifier) {
        specifiers.add(specifier);
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
                
                // function specs
                if(ctx.declarationSpecifiers() != null) {
                    List<DeclarationSpecifierContext> dsctx 
                            = ctx.declarationSpecifiers().declarationSpecifier();
                    dsctx.stream().forEach((dsctx2) -> {
                        f.addSpecifier(Util.getRuleText(source, dsctx2));
                    });
                } else {
                    // error
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
