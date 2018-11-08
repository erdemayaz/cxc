package rule;

import antlr.CXBaseVisitor;
import antlr.CXParser;
import antlr.CXParser.UnaryExpressionContext;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Erdem Ayaz
 */
public class Postfix extends Rule implements RuleAction, Serializable {
    private Unary parent;
    private int start;
    private int stop;
    private boolean unaryElement;
    
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

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public boolean isUnaryElement() {
        return unaryElement;
    }

    public void setUnaryElement(boolean unaryElement) {
        this.unaryElement = unaryElement;
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
                if(ctx.parent.getClass().equals(UnaryExpressionContext.class))
                    addPostfix(ctx, true);
                else
                    addPostfix(ctx, false);
            } else if(ctx.getChildCount() < 5 && ctx.getChildCount() > 2 && 
                    ctx.getChild(1).toString().equals("(")) {
                if(ctx.parent.getClass().equals(UnaryExpressionContext.class))
                    addPostfix(ctx, true);
                else
                    addPostfix(ctx, false);
            }
            return super.visitPostfixExpression(ctx);
        }
        
        private void addPostfix(CXParser.PostfixExpressionContext ctx, boolean u) {
            Postfix pf = new Postfix();
            pf.setText(Util.getRuleText(source, ctx));
            pf.setStart(Util.getRuleStart(source, ctx));
            pf.setStop(Util.getRuleStop(source, ctx));
            pf.setUnaryElement(u);
            p.add(pf);
            if(ctx.postfixExpression().primaryExpression() != null) {
                Postfix pr = new Postfix();
                pr.setText(Util.getRuleText(source, 
                        ctx.postfixExpression().primaryExpression()));
                pr.setStart(Util.getRuleStart(source, 
                        ctx.postfixExpression().primaryExpression()));
                pr.setStop(Util.getRuleStop(source, 
                        ctx.postfixExpression().primaryExpression()));
                p.add(pr);
            }
        }

        public ArrayList<Postfix> getPostfixes() {
            return p;
        }
    }
}
