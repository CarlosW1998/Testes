package Ajude_Ambrosio_625;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] elementes = new int[size+1];
        for(int a = 1; a <= size; a++){elementes[a] = scan.nextInt();}
        SegmentTree mytree = new SegmentTree(elementes);
        int comands = scan.nextInt();
        while(comands > 0){
            int op = scan.nextInt(), x = scan.nextInt(), y = scan.nextInt();
            if(op == 1){System.out.println(y - x + 1 - mytree.getSun(x, y, 1, size, 1));}
            else if(op == 2){System.out.println(mytree.getSun(x, y, 1, size, 1));}
            else{
                int dif = y%2 - mytree.elements[x]%2;
                mytree.elements[x] = y;
                if(dif != 0){mytree.update(1, size, x, dif, 1);}
            }
            comands--;
        }

    }
}
