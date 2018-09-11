package Reduzindo_Mapas_171;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){

            Scanner scan = new Scanner(System.in);
                int size = scan.nextInt(), edges = scan.nextInt();
                size++;
                Graph mygraph = new Graph(size);
                for(int a = 0; a < edges; a++){
                    int origin = scan.nextInt(), target = scan.nextInt(), dist = scan.nextInt();
                    mygraph.addEdge(origin, target, dist);
                    mygraph.addEdge(target, origin, dist);
                }
                mygraph.prim(1);
                int count = 0;
                for(int a: mygraph.dist){
                    if(a != Integer.MAX_VALUE){ count += a; }
                }
                System.out.println(count);
        }
    }

