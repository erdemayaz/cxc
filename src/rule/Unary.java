package rule;

import antlr.CXBaseListener;
import antlr.CXBaseVisitor;
import antlr.CXParser;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Erdem Ayaz
 */
public class Unary extends Rule implements RuleAction, Serializable {
    private Expression parent = null;
    
    @Override
    public void analyze() {
        
    }

    @Override
    public void coding() {
        
    }

    @Override
    public void assemble() {
        
    }

    public Expression getParent() {
        return parent;
    }

    public void setParent(Expression parent) {
        this.parent = parent;
    }
    
    public static class UnaryVisitor extends CXBaseVisitor {
        private final ArrayList<Unary> u;
        private final String source;

        public UnaryVisitor(String source) {
            this.u = new ArrayList<>();
            this.source = source;
        }

        @Override
        public Object visitUnaryExpression(CXParser.UnaryExpressionContext ctx) {
            
            return super.visitUnaryExpression(ctx);
        }

        public ArrayList<Unary> getUnaries() {
            return u;
        }
    }
}
