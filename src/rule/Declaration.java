package rule;

import antlr.CXBaseListener;
import antlr.CXParser;
import antlr.CXParser.InitDeclaratorContext;
import cxc.Modifier;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Erdem Ayaz
 */
public class Declaration extends Rule implements RuleAction, Serializable {
    private Modifier modifier = null;
    private String identifier = null;
    private String text = null;
    private String pointer = null;
    private String specifiers = null;
    private String initValue = null;
    
    @Override
    public void analyze() {
        
    }

    @Override
    public void coding() {
        
    }

    @Override
    public void assemble() {
        
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

    public String getSpecifiers() {
        return specifiers;
    }

    public void setSpecifiers(String specifiers) {
        this.specifiers = specifiers;
    }

    public String getInitValue() {
        return initValue;
    }

    public void setInitValue(String initValue) {
        this.initValue = initValue;
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
                        Modifier mody;
                        if(ctx.modifier() != null) {
                            if(ctx.modifier().Public() != null)
                                mody = Modifier.PUBLIC;
                            else
                                mody = Modifier.PRIVATE;
                        } else {
                            mody = Modifier.DEFAULT;
                        }
                        String specs = Util.getRuleText(source, ctx.declarationSpecifiers());

                        ArrayList<ParseTree> inits = Util.tree2list(ctx.initDeclaratorList(), 3);
                        inits.stream().map((idc) -> {
                            CXParser.DeclaratorContext dec = (CXParser.DeclaratorContext) idc.getChild(0);
                            CXParser.InitializerContext ini = null;
                            if(idc.getChildCount() == 3) {
                                ini = (CXParser.InitializerContext) idc.getChild(2);
                            }
                            Declaration d = new Declaration();
                            d.setModifier(mody);
                            d.setSpecifiers(specs);
                            d.setIdentifier(Util.getRuleText(source, dec));
                            InitDeclaratorContext idctx = (InitDeclaratorContext) idc;
                            d.setText(specs + " " + Util.getRuleText(source, idctx) + ";");
                            if(ini != null) {
                                d.setInitValue(Util.getRuleText(source, ini));
                            }
                            return d;
                        }).forEach((d) -> {
                            declarations.add(d);
                        });

                    } else {
                        // prototype
                        String specs = Util.getRuleText(source, ctx.declarationSpecifiers());
                        String dText = Util.getRuleText(source, ctx);
                        Declaration d = new Declaration();
                        d.setSpecifiers(specs);
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

        public ArrayList<Declaration> getDeclarations() {
            return declarations;
        }
    }
}
