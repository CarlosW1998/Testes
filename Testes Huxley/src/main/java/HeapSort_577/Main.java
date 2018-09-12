package HeapSort_577;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] data = scan.nextLine().split(" ");
        int[] h = new int[data.length];
        for(int a = 0; a < data.length;a++){ h[a] = Integer.parseInt(data[a]); }
        Heap myheap = new Heap(h);
        for(int a: myheap.heapSort()){
            System.out.print(a + "->");
        }
    }
}
