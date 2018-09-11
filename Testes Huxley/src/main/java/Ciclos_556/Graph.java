package Ciclos_556;

import java.util.ArrayList;

public class Graph {
    int[][] edges;
    int size;
    int[] visited, path;

    public Graph(int size){
        this.edges = new int[size][size];
        this.visited = new int[size];
        this.path = new int[size];
        this.size = size;
    }
    public void addEdge(int origin, int target){
        edges[origin][target] = 1;
    }
    public int hasCicle(int origin){
        this.visited[origin] = 1;
        for(int a = 0; a < this.size; a++){
            if(this.edges[origin][a] == 1){
                if(this.visited[a] == 0){
                    if(hasCicle(a) == 1){return 1;}
                }
                else { return 1; }
            }
        }
        return 0;
    }
}
