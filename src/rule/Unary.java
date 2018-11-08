package rule;

import antlr.CXBaseVisitor;
import antlr.CXParser;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
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

    public ArrayList<Postfix> getPostfixes() {
        return postfixes;
    }
    
    public String[] getPostfixStrings() {
        if(postfixes != null && postfixes.size() > 0) {
            ArrayList<String> pf = new ArrayList<>();
            for(int i = 0; i < postfixes.size() - 1; ++i) {
                System.out.println(postfixes.get(i).getText().substring(postfixes.get(i + 1).getText().length()));
                pf.add(postfixes.get(i).getText().substring(postfixes.get(i + 1).getText().length()));
            }
            pf.add(postfixes.get(postfixes.size() - 1).getText());
            String[] p = new String[pf.size()];
            Collections.reverse(pf);
            p = pf.toArray(p);
            return p;
        } else {
            return null;
        }
        
    }

    public void setPostfixes(ArrayList<Postfix> postfixes) {
        if(this.postfixes == null)
            this.postfixes = new ArrayList<>();
        this.postfixes = postfixes;
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
                Unary unary = new Unary();
                unary.setText(Util.getRuleText(source, ctx));
                PostfixVisitor pv = new PostfixVisitor(source);
                pv.visit(ctx.postfixExpression());
                if(pv.getPostfixes().size() > 0) {
                    pv.getPostfixes().stream().forEach((p) -> {
                        p.setParent(unary);
                    });
                    unary.setPostfixes(pv.getPostfixes());
                }
                u.add(unary);
            } else if(ctx.unaryExpression() != null) {
                super.visitUnaryExpression(ctx);
            } else if(ctx.unaryOperator() != null) {
                super.visit(ctx.castExpression());
            } else if(ctx.typeName() != null) {

            } else {
                // '&&' Identifier
            }
            return null;
        }

        public ArrayList<Unary> getUnaries() {
            return u;
        }
    }
    
    
}
