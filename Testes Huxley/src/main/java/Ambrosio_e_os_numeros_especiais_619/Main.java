package Ambrosio_e_os_numeros_especiais_619;

import java.util.Scanner;

public class Main {
    public static int isEspecial(char[] i){
        if(i[0] == i[i.length-1]){return 1;}
        return 0;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(), comands = scan.nextInt();
        scan.nextLine();
        int[] elements = new int[size+1];
        String[] data = scan.nextLine().split(" ");
        for(int a = 1; a <= size; a++){elements[a] = isEspecial(data[a-1].toCharArray());}
        SegmentTree mytree = new SegmentTree(elements);
        while (comands >0){
            int op = scan.nextInt();
            if(op == 1){
                int x = scan.nextInt(), y = scan.nextInt();
                System.out.println(mytree.getSun(1, size, x, y, 1));
            }
            else if(op == 2){
                int x = scan.nextInt();
                int newvalue = isEspecial(Integer.toString(scan.nextInt()).toCharArray());
                int dif = newvalue - elements[x];
                mytree.elements[x] = newvalue;
                if(dif != 0){mytree.update(1, size, x, dif, 1);}
            }
            comands--;
        }
    }
}
