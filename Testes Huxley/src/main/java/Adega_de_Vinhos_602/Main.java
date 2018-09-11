package Adega_de_Vinhos_602;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] vinhos = new int[size];
        for(int a = 0; a < size; a++){ vinhos[a] = scan.nextInt();}
        Adega adega = new Adega(vinhos);
        System.out.println(adega.bestsale(0, size-1, 1));
    }
}
