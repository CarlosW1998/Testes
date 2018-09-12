package Super_Sales_1021;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        while(casos > 0){
            int objs = scan.nextInt();
            int[] valor = new int[objs], peso = new int[objs];
            for(int a = 0; a < objs; a++){
                valor[a] = scan.nextInt();
                peso[a] = scan.nextInt();
            }
            int membros = scan.nextInt(), max = 0;
            while (membros > 0){
                int c = scan.nextInt();
                Mochila mymochila = new Mochila(peso, valor, c+1);
                max += mymochila.best(0, c);
                membros--;
            }
            System.out.println(max);
            casos--;
        }
    }
}
