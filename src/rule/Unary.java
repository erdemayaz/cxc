package rule;

import antlr.CXBaseVisitor;
import antlr.CXParser;
import java.io.Serializable;
import java.util.ArrayList;
import rule.Postfix.PostfixVisitor;

/**
 *
 * @author Erdem Ayaz
 */
public class Unary extends Rule implements RuleAction, Serializable {
    private Expression parent = null;
    private ArrayList<Postfix> postfixes = null;
    
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
            if(ctx.postfixExpression() != null) {
                //System.out.println(Util.getRuleText(source, ctx));
                PostfixVisitor pv = new PostfixVisitor(source);
                pv.visit(ctx.postfixExpression());
                
            } else if(ctx.unaryExpression() != null) {
                //super.visitUnaryExpression(ctx);
            } else if(ctx.unaryOperator() != null) {
                //super.visit(ctx.castExpression());
            } else if(ctx.typeName() != null) {

            } else {
                // '&&' Identifier
            }
            return super.visitUnaryExpression(ctx);
        }

        public ArrayList<Unary> getUnaries() {
            return u;
        }
    }
    
    
}
