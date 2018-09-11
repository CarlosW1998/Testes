package Ambrosio_e_as_ilhas_596;

import java.util.ArrayList;

public class Graph {
    int[][] edges;
    int size;
    int[] visited, path;

    public Graph(int size){
        size += 1;
        this.edges = new int[size][size];
        this.visited = new int[size];
        this.path = new int[size];
        this.size = size;
    }
    public void addEdge(int origin, int target){
        edges[origin][target] = 1;
    }
    public void bfs(int origin){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(origin);
        while (list.size() != 0){
            int current = list.get(0);
            list.remove(0);
            this.visited[current] = 1;
            for(int a = 0; a < this.size; a++){
                if(this.edges[current][a] != 0 && this.visited[a] == 0){
                    list.add(a);
                    this.path[a] = current;
                    if(a == this.size-1) return;
                }
            }

        }
    }
    public int dist(int target){
        if(this.path[target] == 0){return -1;}
        int cont = 0;
        while (this.path[target] != 0){
            target = this.path[target];
            cont++;
        }
        return  cont;
    }

}
