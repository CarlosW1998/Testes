package DataStruct;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    HashMap<String, ArrayList<Node>> edges;
    Node[] vertex;
    int size;

    public Graph(int size){
        edges = new HashMap<String, ArrayList<Node>>();
        vertex = new Node[size];
        this.size = size;
    }

    public void addEdge(String origen, Node target){
        ArrayList<Node> e = this.edges.get(origen);
        e.add(target);
    }
}
