package Construir_Heap_Maima_578;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] i = scan.nextLine().split(" ");
        int[] j = new int[i.length+1];
        for(int a = 1; a <= i.length; a++){
            j[a] = Integer.parseInt(i[a-1]);
        }
        Heap myheap = new Heap(j);
        myheap.BildMaxheap();
        myheap.printHeap();
    }
}
