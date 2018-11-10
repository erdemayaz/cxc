package cxc;

import antlr.CXParser.ExpressionStatementContext;
import java.util.ArrayList;
import java.util.Arrays;
import rule.Declaration;
import rule.Function;
import rule.Vertex;

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
                int i = 0;
                i = functionNames.stream().filter((fn) -> (fn.equals("main")))
                        .map((item) -> 1).reduce(i, Integer::sum);
                if(i != 1) {
                    Error.message(Error.NO_MAIN, 
                            "There is no main function");
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
        ArrayList<String> identifiers = new ArrayList<>();
        ArrayList<String[]> postfixes = new ArrayList<>();
        if(tree.getDeclarations() != null)
            decls.addAll(tree.getDeclarations());
        
        if(tree.getFunctions() != null) {
            tree.getFunctions().stream().forEach((f) -> {
                if(f.getDeclarations() != null)
                    decls.addAll(f.getDeclarations());
                setPostfixes(postfixes, f);
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
                        setPostfixes(postfixes, f);
                    });
                }
            });
        }
        
        tree.getVertexes().stream().forEach((v) -> {
            decls.stream().forEach((d) -> {
                if(v.getIdentifier().equals(d.getSpecifiers())) {
                    identifiers.add(d.getIdentifier());
                }
            });
        });
        
        postfixes.stream().forEach((p) -> {
            postfixAnalysis(p, identifiers);
        });
    }
    
    private void setPostfixes(ArrayList<String[]> p, Function f) {
        if(f.getStatements() != null) {
            f.getStatements().stream().forEach((s) -> {
               if(s.getContext().equals(ExpressionStatementContext.class)) {
                   s.getExpressions().stream().forEach((e) -> {
                       if(e.getUnaries() != null) {
                           e.getUnaries().stream().forEach((u) -> {
                               if(u.getPostfixes() != null) {
                                   p.add(u.getPostfixStrings());
                               }
                           });
                       } 
                   });
               } 
            });
        }
    }
    
    private void postfixAnalysis(String[] primaries, ArrayList<String> ids) {
        if(ids.contains(primaries[0])){
            primaries[1] = primaries[1].replaceAll("\\s+", "");
            if(primaries[1].startsWith(".")) {
                //vertexMemberAnalysis(primaries);
            } else if(primaries[1].startsWith("(")) {
                // error --> blabla(blabla)
                Error.message(Error.MEMBER_START_ERROR, 
                        "Vertex member does not include dot annotation('" + 
                                primaries[0] + primaries[1] + "')");
            } else { // starts with '['
                
            }
        } else if(primaries[0].equals("this")) {
            primaries[1] = primaries[1].replaceAll("\\s+", "");
            if(primaries[1].startsWith(".")) {
                //System.out.println(Arrays.toString(primaries));
            } else if(primaries[1].startsWith("(")){
                //System.out.println(Arrays.toString(primaries));
            } else { // starts with '['
                Error.message(Error.MEMBER_START_ERROR, 
                        "Vertex member does not include dot annotation('" + 
                                primaries[0] + primaries[1] + "')");
            }
        } else {
            // it may be struct or union or
            // checking that include libraries or other sources
        }
    }
    
    private void vertexMemberAnalysis(String[] primaries) {
        System.out.println("From member analysis " + Arrays.toString(primaries));
        Vertex v = tree.getVertexByIdentifier(primaries[0]);
        int pLen = primaries.length;
        for(int i = 1; i < pLen; ++i) {
            if(i == pLen - 1) { // last notation
                Declaration d = v.getDeclarationByIdentifier(primaries[i]);
            } else {
                
            }
        }
    }
}
