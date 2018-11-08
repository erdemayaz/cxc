package cxc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
    
    public static int getRuleStart(String source, ParserRuleContext ctx) {
        return ctx.start.getStartIndex();
    }
    
    public static int getRuleStop(String source, ParserRuleContext ctx) {
        return ctx.stop.getStopIndex() + 1;
    }
    
    public static String getRuleText(String source, ParserRuleContext ctx) {
        return source.substring(ctx.start.getStartIndex(), ctx.stop.getStopIndex() + 1);
    }
    
    public static int getRuleLine(String source, ParserRuleContext ctx) {
        return ctx.start.getLine();
    }
    
    public static ArrayList<String> stringListRetain(List<String> a, List<String> b) {
        ArrayList<String> l = new ArrayList<>(a);
        l.retainAll(b);
        return l;
    }
}
