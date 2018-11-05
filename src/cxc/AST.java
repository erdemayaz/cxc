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
    private ArrayList<Declaration> declarations;
    private ArrayList<Function> functions;
    private ArrayList<Vertex> vertexes;
    
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
}
