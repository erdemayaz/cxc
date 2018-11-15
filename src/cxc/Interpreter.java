package cxc;

import antlr.CXLexer;
import antlr.CXParser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author Erdem Ayaz
 */
public class Interpreter extends Thread {
    private final String sourceName;
    private String sourceString;
    private CXParser parser;
    private AST tree;
    private boolean viewTree;
    private boolean viewWarnings;
    private long begin, end;
    
    public Interpreter(String sourceName) {
        if(sourceName.endsWith(".cx")) {
            this.sourceName = sourceName;
        } else {
            this.sourceName = null;
            Error.message(Exception.Error.UNAVAIBLE_EXTENSION, 
                    "File extension is not avaible. It must be 'cx'");
        }
        viewTree = false;
        viewWarnings = false;
    }
    
    private void read() {
        String source = null;
        
        try {
            source = new String(Files.readAllBytes(Paths.get(sourceName)));
        } catch (IOException ex) {
            Error.message(Exception.Error.READING_EXCEPTION, 
                    "Source file cannot read");
        }
        
        if(source == null) {
            Error.message(Exception.Error.EMPTY_SOURCE, "Source file empty");
        } else {
            sourceString = source;
        }
    }
    
    private void parse() {
        CharStream cs = CharStreams.fromString(sourceString);
        CXLexer lexer = new CXLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new CXParser(tokens);
        if(parser == null) {
            Error.message(Exception.Error.PARSER_ERROR, "Parser error");
        }
    }
    
    private void construct() {
        Constructor c = new Constructor(sourceString);
        c.enterCompilationUnit(parser.compilationUnit());
        tree = c.getTree();
    }
    
    private void analyze() {
        Analyzer a = new Analyzer(tree);
        a.analyze();
        if(viewWarnings) {
            a.getWarnings().stream().forEach((w) -> { Warning.message(w); });
        }
    }
    
    private void coding() {
        Coder c = new Coder(tree);
    }
    
    private void assemble() {
        
    }

    @Override
    public void run() {
        try {
            begin = System.currentTimeMillis();
            read();
            parse();
            if(!viewTree) {
                construct();
                analyze();
                coding();
                assemble();
                end = System.currentTimeMillis();
                System.out.println("Interpreter Runtime : " + (end - begin) + "ms");
            } else {
                TreeViewer tv = new TreeViewer(Arrays.asList(parser.getRuleNames()), 
                parser.compilationUnit());
                tv.open();
            }
            super.run();
        } catch (Throwable t) {
            System.err.println(t);
            for(StackTraceElement ste : t.getStackTrace()) {
                System.err.println(ste);
            }
            
        }
    }
    
    public String getSourceName() {
        return sourceName;
    }
    
    public String getSourceString() {
        return sourceString;
    }
    
    public void viewTree(boolean tree) {
        viewTree = tree;
    }
    
    public void viewWarnings(boolean warning) {
        viewWarnings = warning;
    }
}
