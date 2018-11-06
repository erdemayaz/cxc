package rule;

import antlr.CXBaseListener;
import antlr.CXParser;
import antlr.CXParser.AssignmentExpressionContext;
import antlr.CXParser.CompoundStatementContext;
import antlr.CXParser.ExpressionContext;
import antlr.CXParser.ExpressionStatementContext;
import antlr.CXParser.IterationStatementContext;
import antlr.CXParser.JumpStatementContext;
import antlr.CXParser.LabeledStatementContext;
import antlr.CXParser.SelectionStatementContext;
import cxc.Util;
import java.io.Serializable;
import java.util.ArrayList;
import rule.Expression.ExpressionListener;

/**
 *
 * @author Erdem Ayaz
 */
public class Statement extends Rule implements RuleAction, Serializable {
    private Class context;
    private Function parent = null;
    private ArrayList<Expression> expressions = null;
    
    
    @Override
    public void analyze() {
        if(context == ExpressionStatementContext.class) {
            expressions.stream().forEach((e) -> { e.analyze(); });
        }
    }

    @Override
    public void coding() {
        
    }

    @Override
    public void assemble() {
        
    }

    public Class getContext() {
        return context;
    }

    public void setContext(Class context) {
        this.context = context;
    }

    public Function getParent() {
        return parent;
    }

    public void setParent(Function parent) {
        this.parent = parent;
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void addExpression(Expression expression) {
        this.expressions.add(expression);
    }
    
    public static class StatementListener extends CXBaseListener {
        private final Statement s;
        private final String source;

        public StatementListener(String source) {
            this.s = new Statement();
            this.source = source;
        }

        @Override
        public void enterStatement(CXParser.StatementContext ctx) {
            if(ctx != null) {
                s.setText(Util.getRuleText(source, ctx));
                if(ctx.expressionStatement() != null) {
                    s.setContext(ExpressionContext.class);
                    if(ctx.expressionStatement().expression() != null) {
                        s.expressions = new ArrayList<>();
                        Util.tree2list(ctx.expressionStatement().expression(), 3)
                        .stream().forEach((pt) -> {
                            ExpressionListener el = new ExpressionListener(source);
                            el.enterAssignmentExpression((AssignmentExpressionContext) pt);
                            el.getExpression().setParent(s);
                            s.addExpression(el.getExpression());
                        });
                    }
                } else if(ctx.selectionStatement() != null) {
                    s.setContext(SelectionStatementContext.class);
                } else if(ctx.iterationStatement() != null) {
                    s.setContext(IterationStatementContext.class);
                } else if(ctx.jumpStatement() != null) {
                    s.setContext(JumpStatementContext.class);
                } else if(ctx.compoundStatement() != null) {
                    s.setContext(CompoundStatementContext.class);
                } else if(ctx.labeledStatement() != null) {
                    s.setContext(LabeledStatementContext.class);
                } else {
                    // __asm
                    s.setContext(null);
                }
            }
        }

        public Statement getStatement() {
            return s;
        }
    }
}
