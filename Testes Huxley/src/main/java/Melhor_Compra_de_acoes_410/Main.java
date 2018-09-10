package Melhor_Compra_de_acoes_410;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int size;
        int[] cust;
        Scanner scan = new Scanner(System.in);
        try{
            size = scan.nextInt();
            cust = new int[size];
            for(int a = 0; a < size;a ++){
                cust[a] = scan.nextInt();
            }
            Acoes a = new Acoes(cust);
            System.out.println(a.bestPrice(0));
        }catch (Exception e){
            System.out.println("Dados Invalidos");
        }

    }
}
