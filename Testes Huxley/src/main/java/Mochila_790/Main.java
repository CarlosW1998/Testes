package Mochila_790;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(), capacity = scan.nextInt();
        int[] valor = new int[size], peso = new int[size];
        for(int a = 0; a < size;a++){valor[a] = scan.nextInt();}
        for(int a = 0; a < size; a++){peso[a] = scan.nextInt();}
        Mochila mymochila = new Mochila(peso, valor, capacity+1);
        System.out.println(mymochila.best(0, capacity));
    }
}
