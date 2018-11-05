package rule;

import antlr.CXBaseListener;
import antlr.CXParser;
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
        public void enterExpression(CXParser.ExpressionContext ctx) {
            
        }

        public Expression getExpression() {
            return e;
        }
    }
}
