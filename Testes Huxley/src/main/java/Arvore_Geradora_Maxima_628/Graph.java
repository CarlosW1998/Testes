package Arvore_Geradora_Maxima_628;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Graph {
        int[][] edges;
        int size;
        int[] visited, dist;

        public Graph(int size){
            this.edges = new int[size][size];
            this.visited = new int[size];
            this.dist = new int[size];
            for(int a = 0; a < size; a++){ this.dist[a] = Integer.MAX_VALUE; }
            this.size = size;
        }
        public void addEdge(int origin, int target, int size){
            edges[origin][target] = size;
        }
        public void prim(int origin){
            Comparator<Integer[]> c = new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    return o1[0].compareTo(o2[0]);
                }
            };
            PriorityQueue<Integer[]> queue = new PriorityQueue<>(c);
            Integer[] o = {0, origin};
            this.dist[origin] = 0;
            queue.add(o);
            while(!queue.isEmpty()){
                Integer[] current = queue.poll();
                if(this.visited[current[1]] == 0){
                    this.visited[current[1]] = 1;
                    for(int a  = 0; a < this.size; a++){
                        if(this.edges[current[1]][a] != 0){
                            if(this.edges[current[1]][a] < this.dist[a] && this.visited[a] == 0){
                                this.dist[a] = this.edges[current[1]][a];
                                Integer[] i = {this.dist[a], a};
                                queue.add(i);
                            }
                        }
                    }
                }
            }

        }
}
