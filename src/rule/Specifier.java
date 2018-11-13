package rule;

import antlr.CXBaseListener;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Erdem Ayaz
 */
public class Specifier extends Rule implements RuleAction, Serializable {

    @Override
    public void analyze() {
        
    }

    @Override
    public void coding() {
        
    }

    @Override
    public void assemble() {
        
    }
    
    public static class SpecifierListener extends CXBaseListener {
        private final ArrayList<Specifier> s;
        private final String source;

        public SpecifierListener(String source) {
            this.s = new ArrayList<>();
            this.source = source;
        }
        
        
    }
}
