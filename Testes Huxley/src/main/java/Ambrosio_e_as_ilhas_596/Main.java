package Ambrosio_e_as_ilhas_596;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int cases;
        Scanner scan = new Scanner(System.in);
        cases = scan.nextInt();
        while(cases > 0){
            int size, edges;
            size = scan.nextInt();
            edges = scan.nextInt();
            Graph islands = new Graph(size);
            for(int a = 0; a < edges; a++){
                int origin, target;
                origin = scan.nextInt();
                target = scan.nextInt();
                islands.addEdge(origin, target);
                islands.addEdge(target, origin);
            }
            islands.bfs(1);
            System.out.println(islands.dist(size));
            cases--;
        }
    }
}
