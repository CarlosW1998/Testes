package Pizzaria_562;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int counter = 1;
        while(cases>0){
            int size = scan.nextInt(), edges = scan.nextInt();
            Graph mygraph = new Graph(size+1);
            for(int a = 0; a < edges; a++){
                int origin = scan.nextInt(), target = scan.nextInt(), dist = scan.nextInt();
                mygraph.addEdge(origin, target, dist);
                mygraph.addEdge(target, origin, dist);
            }
            mygraph.dijkstra(1);
            int pedidos = scan.nextInt(), time = 0;
            while (pedidos > 0){
                time += mygraph.dist[scan.nextInt()];
                pedidos--;
            }
            System.out.println("Caso " + counter + ": " + time*2);
            counter++;
            cases--;
        }
    }
}
