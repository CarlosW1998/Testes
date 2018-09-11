package Frete_1997;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int size, edges;
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        edges = scan.nextInt();
        size += 1;
        Graph mygraph = new Graph(size);
        for(int a = 0; a < edges; a++){
            int origin = scan.nextInt(), target = scan.nextInt(), dist = scan.nextInt();
            mygraph.addEdge(origin, target, dist);
            mygraph.addEdge(target, origin, dist);
        }
        mygraph.dijkstra(1);
        System.out.println(mygraph.dist[size-1]);
    }
}
