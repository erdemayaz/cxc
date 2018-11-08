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
    private int start;
    private int stop;
    
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
                addPostfix(ctx);
            } else if(ctx.getChildCount() < 5 && ctx.getChildCount() > 2 && 
                    ctx.getChild(1).toString().equals("(")) {
                addPostfix(ctx);
            }
            return super.visitPostfixExpression(ctx);
        }
        
        private void addPostfix(CXParser.PostfixExpressionContext ctx) {
            Postfix pf = new Postfix();
            pf.setText(Util.getRuleText(source, ctx));
            pf.setStart(Util.getRuleStart(source, ctx));
            pf.setStop(Util.getRuleStop(source, ctx));
            p.add(pf);
        }

        public ArrayList<Postfix> getPostfixes() {
            return p;
        }
    }
}
