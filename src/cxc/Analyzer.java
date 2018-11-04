package cxc;

import java.util.ArrayList;
import rule.Declaration;

/**
 *
 * @author Erdem Ayaz
 */
public class Analyzer {
    private final AST tree;

    public Analyzer(AST tree) {
        this.tree = tree;
    }
    
    public void analyze() {
        ruleAnalysis();
        usageAnalysis();
    }
    
    private void ruleAnalysis() {
        if(tree.getDeclarations() != null) {
            ArrayList<String> declarationNames = new ArrayList<>();
            tree.getDeclarations().stream().forEach((d) -> {
                if(!declarationNames.contains(d.getIdentifier())) {
                    declarationNames.add(d.getIdentifier());
                } else {
                    Error.message(Error.MULTIPLE_IDENTIFIER, 
                            "Multiple declaration identifier '" + 
                                    d.getIdentifier() + "'");
                }
                d.analyze();
            });
        }
            
        if(tree.getFunctions() != null) {
            ArrayList<String> functionNames = new ArrayList<>();
            tree.getFunctions().stream().forEach((f) -> {
                if(!functionNames.contains(f.getIdentifier())) {
                    functionNames.add(f.getIdentifier());
                } else {
                    Error.message(Error.MULTIPLE_IDENTIFIER, 
                            "Multiple function identifier '" + 
                                    f.getIdentifier() + "'");
                }
                f.analyze();
            });
        }
            
        if(tree.getVertexes() != null) {
            ArrayList<String> vertexNames = new ArrayList<>();
            tree.getVertexes().stream().forEach((v) -> {
                if(!vertexNames.contains(v.getIdentifier())) {
                    vertexNames.add(v.getIdentifier());
                } else {
                    Error.message(Error.MULTIPLE_IDENTIFIER, 
                            "Multiple vertex identifier '" + 
                                    v.getIdentifier() + "'");
                }
                v.analyze();
            });
        }
    }
    
    private void usageAnalysis() {
        ArrayList<Declaration> decls = new ArrayList<>();
        if(tree.getDeclarations() != null)
            decls.addAll(tree.getDeclarations());
        
        if(tree.getFunctions() != null) {
            tree.getFunctions().stream().forEach((f) -> {
                if(f.getDeclarations() != null)
                    decls.addAll(f.getDeclarations());
            });
        }
        
        if(tree.getVertexes() != null) {
            tree.getVertexes().stream().forEach((v) -> {
                if(v.getDeclarations() != null)
                    decls.addAll(v.getDeclarations());

                if(v.getFunctions() != null) {
                    v.getFunctions().stream().forEach((f) -> {
                        if(f.getDeclarations() != null)
                            decls.addAll(f.getDeclarations());
                    });
                }
            });
        }
        
        tree.getVertexes().stream().forEach((v) -> {
            decls.stream().forEach((d) -> {
                if(v.getIdentifier().equals(d.getSpecifiers())) {
                    findUsage(d.getIdentifier());
                }
            });
        });
    }
    
    private void findUsage(String identifier) {
        // find all expression statements that includes the identifier
    }
}
