package Ciclos_556;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int size, edges, count = 1;
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        edges = scan.nextInt();
        while(size + edges != 0){
            Graph mygraph = new Graph(size);
            for(int a = 0; a < edges; a++){
                int origin = scan.nextInt(), target = scan.nextInt();
                mygraph.addEdge(origin, target);
            }
            System.out.println(count + " " + mygraph.hasCicle(0));
            size = scan.nextInt();
            edges = scan.nextInt();
            count++;
        }
    }
}
