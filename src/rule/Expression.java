package rule;

import antlr.CXBaseListener;
import antlr.CXParser;
import cxc.Error;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;
import rule.Unary.UnaryVisitor;

/**
 *
 * @author Erdem Ayaz
 */
public class Expression extends Rule implements RuleAction, Serializable {
    private Rule parent = null;
    private ArrayList<Unary> unaries = null;
    
    @Override
    public void analyze() {
        if(unaries != null) {
            ArrayList<Unary> temps = new ArrayList<>();
            for(Unary u : unaries) {
                int level = 1;
                Unary un = new Unary();
                un.setParent(u.getParent());
                un.setText(u.getText());
                if(u.getPostfixes() != null) {
                    for(Postfix p : u.getPostfixes()) {
                        if(p.getLevel() != level) {
                            level++;
                            temps.add(un);
                            un = new Unary();
                            un.setParent(u.getParent());
                            un.setText(u.getText());
                        }
                        un.addPostfix(p);
                    }
                }
                temps.add(un);
            }
            unaries.clear();
            unaries.addAll(temps);
            unaries.stream().forEach((u) -> { u.analyze(); });
        }
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

    public ArrayList<Unary> getUnaries() {
        return unaries;
    }
    
    public void addUnary(Unary unary) {
        unaries.add(unary);
    }

    public void addUnaries(ArrayList<Unary> unary) {
        unaries.addAll(unary);
    }
    
    public static class ExpressionListener extends CXBaseListener {
        private final Expression e;
        private final String source;

        public ExpressionListener(String source) {
            this.e = new Expression();
            this.source = source;
        }

        @Override
        public void enterAssignmentExpression(CXParser.AssignmentExpressionContext ctx) {
            if(ctx.assignmentOperator() != null) {
                if(ctx.assignmentExpression().assignmentOperator() != null) {
                    Error.message(cxc.Exception.Error.MULTIPLE_ASSIGNMENT, 
                            "Multiple assignment in expression statement", 
                            Util.getRuleLine(source, ctx.assignmentExpression()
                                    .assignmentOperator()));
                } else if(ctx.assignmentExpression().conditionalExpression() != null) {
                    // left single unary
                    UnaryVisitor uvRight = new UnaryVisitor(source);
                    uvRight.visit(ctx.unaryExpression());
                    if(uvRight.getUnaries().size() == 1) {
                        uvRight.getUnaries().get(0).setParent(e);
                        if(e.unaries == null)
                            e.unaries = new ArrayList<>();
                        e.addUnary(uvRight.getUnaries().get(0));
                    }
                    // right multiple unaries
                    UnaryVisitor uvLeft = new UnaryVisitor(source);
                    uvLeft.visit(ctx.assignmentExpression());
                    if(uvLeft.getUnaries().size() > 0) {
                        uvLeft.getUnaries().stream().forEach((u) -> {
                            u.setParent(e);
                        });
                        if(e.unaries == null)
                            e.unaries = new ArrayList<>();
                        e.addUnaries(uvLeft.getUnaries());
                    }
                } else {
                    // digit sequence in right of assignment
                }
            } else if (ctx.conditionalExpression() != null) {
                UnaryVisitor uv = new UnaryVisitor(source);
                uv.visit(ctx.conditionalExpression());
                if(uv.getUnaries().size() > 0) {
                    uv.getUnaries().stream().forEach((u) -> {
                        u.setParent(e);
                    });
                    if(e.unaries == null)
                        e.unaries = new ArrayList<>();
                    e.addUnaries(uv.getUnaries());
                }
            } else {
                // digit sequence
            }
        }

        public Expression getExpression() {
            return e;
        }
    }
}
