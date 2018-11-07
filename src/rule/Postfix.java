package rule;

import antlr.CXBaseVisitor;
import antlr.CXParser;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Erdem Ayaz
 */
public class Postfix extends Rule implements RuleAction, Serializable {
    private Unary parent;
    
    @Override
    public void analyze() {
        
    }

    @Override
    public void coding() {
        
    }

    @Override
    public void assemble() {
        
    }

    public Unary getParent() {
        return parent;
    }

    public void setParent(Unary parent) {
        this.parent = parent;
    }
    
    public static class PostfixVisitor extends CXBaseVisitor {
        private final ArrayList<Postfix> p;
        private final String source;

        public PostfixVisitor(String source) {
            this.p = new ArrayList<>();
            this.source = source;
        }

        @Override
        public Object visitPostfixExpression(CXParser.PostfixExpressionContext ctx) {
            if(ctx.getChildCount() == 3 && ctx.getChild(1).toString().equals(".")) {
                
            }
            return super.visitPostfixExpression(ctx);
        }

        public ArrayList<Postfix> getPostfixes() {
            return p;
        }
    }
}
