package rule;

import antlr.CXBaseListener;
import antlr.CXParser;
import antlr.CXParser.DeclarationContext;
import antlr.CXParser.DeclaratorContext;
import antlr.CXParser.InitializerContext;
import antlr.CXParser.TypeSpecifierContext;
import cxc.Error;
import cxc.Modifier;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;
import org.antlr.v4.runtime.tree.ParseTree;
import rule.Specifier.SpecifierListener;

/**
 *
 * @author Erdem Ayaz
 */
public class Declaration extends Rule implements RuleAction, Serializable {
    private Rule parent = null;
    private Modifier modifier = null;
    private String identifier = null;
    private String text = null;
    private String pointer = null;
    private ArrayList<Specifier> specifiers = null;
    private String initValue = null;
    private int arraySize = 0;
    
    @Override
    public void analyze() {
        modifierAnalysis();
        typeSpecifierControl();
    }

    @Override
    public void coding() {
        
    }

    @Override
    public void assemble() {
        
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
    
    private void modifierAnalysis() {
        if(modifier != Modifier.DEFAULT && 
                (parent == null || parent.getClass() == Function.class)) {
            Error.message(Error.INCOMPATIBLE_MODIFIER, 
                    "Usage of modifier is incompatible for declaration '" + 
                            identifier + "'");
        }
    }
    
    private void typeSpecifierControl() {
        if(getTypeSpecifier() == null) {
            Error.message(Error.NO_TYPE, "Declaration has not type specifier ('" 
                    + identifier + "')");
        }
    }

    public Rule getParent() {
        return parent;
    }

    public void setParent(Rule parent) {
        this.parent = parent;
    }

    public Modifier getModifier() {
        return modifier;
    }

    public void setModifier(Modifier modifier) {
        this.modifier = modifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPointer() {
        return pointer;
    }

    public void setPointer(String pointer) {
        this.pointer = pointer;
    }

    public ArrayList<Specifier> getSpecifiers() {
        return specifiers;
    }

    public void setSpecifiers(ArrayList<Specifier> specifiers) {
        this.specifiers = specifiers;
    }

    public String getInitValue() {
        return initValue;
    }

    public void setInitValue(String initValue) {
        this.initValue = initValue;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }
    
    public static class DeclarationListener extends CXBaseListener {
        private final ArrayList<Declaration> declarations;
        private final String source;

        public DeclarationListener(String source) {
            this.declarations = new ArrayList<>();
            this.source = source;
        }

        @Override
        public void enterDeclaration(CXParser.DeclarationContext ctx) {
            if(ctx != null) {
                if(ctx.declarationSpecifiers() != null) {
                    if(ctx.initDeclaratorList() != null) {
                        Modifier mody = modifierAnalysis(ctx);
                        SpecifierListener sl = new SpecifierListener(source);
                        ctx.declarationSpecifiers().enterRule(sl);
                        ArrayList<ParseTree> inits = Util.tree2list(ctx.initDeclaratorList(), 3);
                        inits.stream().map((idc) -> {
                            CXParser.DeclaratorContext dec = 
                                    (CXParser.DeclaratorContext) idc.getChild(0);
                            CXParser.InitializerContext ini = null;
                            int arraySize = 0;
                            if(idc.getChildCount() == 3) {
                                ini = (CXParser.InitializerContext) idc.getChild(2);
                            }
                            arraySize = assignmentControl(dec, ini, arraySize);
                            Declaration d = new Declaration();
                            d.setModifier(mody);
                            d.setSpecifiers((ArrayList<Specifier>) sl.getSpecifiers().clone());
                            d.getSpecifiers().stream().forEach((spec) -> {
                                spec.setParent(d);
                            });
                            d.setIdentifier(Util.getRuleText(source, dec));
                            if(ini != null) {
                                d.setInitValue(Util.getRuleText(source, ini));
                            }
                            d.setArraySize(arraySize);
                            return d;
                        }).forEach((d) -> {
                            declarations.add(d);
                        });

                    } else {
                        // prototype
                        SpecifierListener sl = new SpecifierListener(source);
                        ctx.declarationSpecifiers().enterRule(sl);
                        String dText = Util.getRuleText(source, ctx);
                        Declaration d = new Declaration();
                        d.setSpecifiers((ArrayList<Specifier>) sl.getSpecifiers().clone());
                        d.getSpecifiers().stream().forEach((spec) -> {
                            spec.setParent(d);
                        });
                        d.setText(dText);
                        declarations.add(d);
                    }
                } else {
                    // static assert
                    String dText = Util.getRuleText(source, ctx);
                    Declaration d = new Declaration();
                    d.setText(dText);
                    declarations.add(d);
                }
            }
        }

        private Modifier modifierAnalysis(DeclarationContext ctx) {
            Modifier mody;
            if(ctx.modifier() != null) {
                if(ctx.modifier().Public() != null)
                    mody = Modifier.PUBLIC;
                else
                    mody = Modifier.PRIVATE;
            } else {
                mody = Modifier.DEFAULT;
            }
            return mody;
        }
        
        private int listCount(ParseTree tree, int minElementNumber) {
            int counter = 1;
            while(tree.getChildCount() >= minElementNumber) {
                tree = tree.getChild(0);
                counter++;
            }
            return counter++;
        }
        
        private int assignmentControl(DeclaratorContext dec, InitializerContext ini, int arraySize) {
            if(dec.directDeclarator().Identifier() != null) {
                //single variable
            } else if(dec.directDeclarator().directDeclarator() != null 
                    && dec.directDeclarator().getChild(1).getText().equals("[")) {
                if(dec.directDeclarator().assignmentExpression() == null) {
                    // identifier[]
                    if(ini != null && ini.initializerList() != null) {
                        arraySize = listCount(ini.initializerList(), 3);
                    } else {
                        Error.message(Error.NO_INITIALIZER_LIST, 
                                "There is no initializer list", 
                                Util.getRuleLine(source, dec));
                    }
                } else {
                    // identifier[expression]
                    if(ini != null) {
                        Error.message(Error.HAS_INITIALIZER, 
                                "There is initializer", 
                                Util.getRuleLine(source, dec));
                    }
                }
            } else if(dec.directDeclarator().directDeclarator() != null 
                    && dec.directDeclarator().getChild(1).getText().equals("(")) {
                // identifier(identifier list)
                Error.message(Error.INCORRECT_ASSIGNMENT, 
                                "Function cannot be assigned anything", 
                                Util.getRuleLine(source, dec));
            }
            return arraySize;
        }
        
        public ArrayList<Declaration> getDeclarations() {
            return declarations;
        }
    }
}
