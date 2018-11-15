package rule;

import antlr.CXBaseListener;
import antlr.CXParser;
import antlr.CXParser.AlignmentSpecifierContext;
import antlr.CXParser.FunctionSpecifierContext;
import antlr.CXParser.StorageClassSpecifierContext;
import antlr.CXParser.TypeQualifierContext;
import antlr.CXParser.TypeSpecifierContext;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Erdem Ayaz
 */
public class Specifier extends Rule implements RuleAction, Serializable {
    private Rule parent = null;
    private Class context = null;
    private boolean typedef = false;
    
    @Override
    public void analyze() {
        
    }

    @Override
    public void coding() {
        
    }

    @Override
    public void assemble() {
        
    }

    public Rule getParent() {
        return parent;
    }

    public void setParent(Rule parent) {
        this.parent = parent;
    }

    public Class getContext() {
        return context;
    }

    public void setContext(Class context) {
        this.context = context;
    }

    public boolean isTypedef() {
        return typedef;
    }

    public void setTypedef(boolean typedef) {
        this.typedef = typedef;
    }
    
    public static class SpecifierListener extends CXBaseListener {
        private final ArrayList<Specifier> s;
        private final String source;

        public SpecifierListener(String source) {
            this.s = new ArrayList<>();
            this.source = source;
        }

        @Override
        public void enterDeclarationSpecifiers(CXParser.DeclarationSpecifiersContext ctx) {
            ctx.declarationSpecifier().stream().map((dsctx) -> {
                Specifier spec = new Specifier();
                spec.setText(Util.getRuleText(source, dsctx));
                if(dsctx.storageClassSpecifier() != null) {
                    spec.setContext(StorageClassSpecifierContext.class);
                } else if(dsctx.typeSpecifier() != null) {
                    spec.setContext(TypeSpecifierContext.class);
                    if(dsctx.typeSpecifier().typedefName() != null) {
                        spec.setTypedef(true);
                    }
                } else if(dsctx.typeQualifier() != null) {
                    spec.setContext(TypeQualifierContext.class);
                } else if(dsctx.functionSpecifier() != null) {
                    spec.setContext(FunctionSpecifierContext.class);
                } else if(dsctx.alignmentSpecifier() != null) {
                    spec.setContext(AlignmentSpecifierContext.class);
                }
                return spec;
            }).forEach((spec) -> {
                s.add(spec);
            });
        }

        public ArrayList<Specifier> getSpecifiers() {
            return s;
        }
    }
}
