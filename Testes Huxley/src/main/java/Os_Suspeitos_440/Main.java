package Os_Suspeitos_440;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int size, edges;
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        edges = scan.nextInt();
        scan.nextLine();
        while (size+edges != 0){
            String[] aux;
            Graph mygraph = new Graph(size);
            for(int i = 0; i < edges; i++){
                aux = scan.nextLine().split(" ");
                int tam = Integer.parseInt(aux[0]);
                for(int b = 1; b < tam; b++){
                    for(int c = b+1; c <= tam; c++){
                        mygraph.addEdge(Integer.parseInt(aux[b]), Integer.parseInt(aux[c]));
                        mygraph.addEdge(Integer.parseInt(aux[c]), Integer.parseInt(aux[b]));
                    }
                }
            }
            mygraph.dfs(0);
            System.out.println(mygraph.countUnvisited());
            size = scan.nextInt();
            edges = scan.nextInt();
            scan.nextLine();
        }
    }

}
