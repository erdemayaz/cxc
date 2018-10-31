package cxc;

import java.util.ArrayList;
import java.util.Collections;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Erdem Ayaz
 */
public class Util {
    public static ArrayList<ParseTree> tree2list(ParseTree tree, int ruleElementNumber) {
        ArrayList<ParseTree> list = new ArrayList<>();
        while(tree.getChildCount() == ruleElementNumber) {
            list.add(tree.getChild(ruleElementNumber - 1));
            tree = tree.getChild(0);
        }
        list.add(tree.getChild(0));
        Collections.reverse(list);
        return list;
    }
    
    public static String getRuleText(String source, ParserRuleContext ctx) {
        return source.substring(ctx.start.getStartIndex(), ctx.stop.getStopIndex() + 1);
    }
}
