package cxc;

import java.io.Serializable;
import java.util.ArrayList;
import rule.Declaration;
import rule.Function;
import rule.Vertex;

/**
 *
 * @author Erdem Ayaz
 */
public class AST implements Serializable {
    private ArrayList<Declaration> declarations = null;
    private ArrayList<Function> functions = null;
    private ArrayList<Vertex> vertexes = null;
    
    public void addDeclarations(ArrayList<Declaration> declaration) {
        if(declarations == null)
            declarations = new ArrayList<>();
        declarations.addAll(declaration);
    }
    
    public void addFunction(Function function) {
        if(functions == null)
            functions = new ArrayList<>();
        functions.add(function);
    }
    
    public void addVertex(Vertex vertex) {
        if(vertexes == null)
            vertexes = new ArrayList<>();
        vertexes.add(vertex);
    }

    public ArrayList<Declaration> getDeclarations() {
        return declarations;
    }

    public ArrayList<Function> getFunctions() {
        return functions;
    }

    public ArrayList<Vertex> getVertexes() {
        return vertexes;
    }
    
    public Declaration getDeclarationByIdentifier(String identifier) {
        if(declarations != null) {
            for(Declaration d : declarations) {
                if(d.getIdentifier().equals(identifier))
                    return d;
            }
        }
        return null;
    }
    
    public Function getFunctionByIdentifier(String identifier) {
        if(functions != null) {
            for(Function f : functions) {
                if(f.getIdentifier().equals(identifier))
                    return f;
            }
        }
        return null;
    }
    
    public Vertex getVertexByIdentifier(String identifier) {
        if(vertexes != null) {
            for(Vertex v : vertexes) {
                if(v.getIdentifier().equals(identifier))
                    return v;
            }
        }
        return null;
    }
}
