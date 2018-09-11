package Construir_Heap_Maima_578;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] i = scan.nextLine().split(" ");
        int[] j = new int[i.length];
        for(int a = 0; a < i.length; a++){
            j[a] = Integer.parseInt(i[a]);
        }
        Heap myheap = new Heap(j);
        myheap.BildMaxheap();
        myheap.printHeap();
    }
}
