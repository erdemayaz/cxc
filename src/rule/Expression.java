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
        if(parent.getClass() == Statement.class) {
            Statement p = (Statement) parent;
            
        }
        if(unaries != null)
            unaries.stream().forEach((u) -> { u.analyze(); });
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
                    Error.message(Error.MULTIPLE_ASSIGNMENT, 
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
                        e.unaries.add(uvRight.getUnaries().get(0));
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
                        e.unaries.addAll(uvLeft.getUnaries());
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
                    e.unaries.addAll(uv.getUnaries());
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
