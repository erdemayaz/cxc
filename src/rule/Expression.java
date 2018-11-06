package rule;

import antlr.CXBaseListener;
import antlr.CXParser;
import antlr.CXParser.UnaryExpressionContext;
import cxc.Error;
import cxc.Util;
import java.io.Serializable;

/**
 *
 * @author Erdem Ayaz
 */
public class Expression extends Rule implements RuleAction, Serializable {
    private Rule parent = null;
    
    @Override
    public void analyze() {
        if(parent.getClass() == Statement.class) {
            Statement p = (Statement) parent;
            
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
                    // error for ... = ... = ...
                    Error.message(Error.MULTIPLE_ASSIGNMENT, 
                            "Multiple assignment in expression statement", 
                            Util.getRuleLine(source, ctx.assignmentExpression()
                                    .assignmentOperator()));
                } else if(ctx.assignmentExpression().conditionalExpression() != null) {
                    
                } else {
                    // digit sequence in right of assignment
                }
            } else if (ctx.conditionalExpression() != null) {
                
            } else {
                // digit sequence
            }
        }
        
        private void unaryExpressionAnalysis(UnaryExpressionContext uectx) {
            
        }

        public Expression getExpression() {
            return e;
        }
    }
}
