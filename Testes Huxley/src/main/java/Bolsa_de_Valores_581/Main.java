package Bolsa_de_Valores_581;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int size, sale;
        Scanner scan = new Scanner(System.in);
        try{
            size = scan.nextInt();
            sale = scan.nextInt();
            int[] i = new int[size];
            for(int a = 0; a < size; a++){i[a] = scan.nextInt();}
            Bolsa bolsa = new Bolsa(i, sale);
            System.out.println(bolsa.bestSale(0, 1));
        }catch (Exception e){
            System.out.println("DADOS INVALIDOS");
        }
    }
}
