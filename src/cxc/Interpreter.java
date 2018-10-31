package cxc;

import antlr.CXLexer;
import antlr.CXParser;
import java.io.IOException;
import static java.lang.System.exit;
import java.nio.file.Files;
import java.nio.file.Paths;
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
    private long begin, end;
    
    public Interpreter(String sourceName) {
        if(sourceName.endsWith(".cx")) {
            this.sourceName = sourceName;
        } else {
            this.sourceName = null;
            System.err.println("File extension is not avaible");
            exit(-1);
        }
    }
    
    private void read() {
        String source = "";
        
        try {
            source = new String(Files.readAllBytes(Paths.get(sourceName)));
        } catch (IOException ex) {
            System.err.println("Source file cannot read");
        }
        
        if(source.equals("")) {
            System.err.println("Source file cannot read");
            exit(-1);
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
            System.err.println("Parser error");
            exit(-1);
        }
        
//        TreeViewer tv = new TreeViewer(Arrays.asList(parser.getRuleNames()), 
//                parser.compilationUnit());
//        tv.open();
    }
    
    private void construct() {
        Constructor c = new Constructor(sourceString);
        c.enterCompilationUnit(parser.compilationUnit());
        tree = c.getTree();
    }
    
    private void analyze() {
        Analyzer a = new Analyzer(tree);
    }
    
    private void coding() {
        Coder c = new Coder(tree);
    }
    
    private void assemble() {
        
    }

    @Override
    public void run() {
        begin = System.currentTimeMillis();
        read();
        parse();
        construct();
        analyze();
        coding();
        assemble();
        end = System.currentTimeMillis();
        System.out.println("Interpreter Runtime : " + (end - begin) + "ms");
        super.run();
    }
    
    public String getSourceName() {
        return sourceName;
    }
    
    public String getSourceString() {
        return sourceString;
    }
}
