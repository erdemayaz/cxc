package rule;

import antlr.CXBaseListener;
import antlr.CXParser;
import cxc.Util;
import java.io.Serializable;

/**
 *
 * @author Erdem Ayaz
 */
public class Statement extends Rule implements RuleAction, Serializable {
    private Class context;
    private Function parent = null;
    
    
    @Override
    public void analyze() {
        
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
            }
        }

        public Statement getStatement() {
            return s;
        }
    }
}
