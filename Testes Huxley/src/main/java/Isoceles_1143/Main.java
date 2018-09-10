package Isoceles_1143;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int size;
        Scanner scan = new Scanner(System.in);
        try{
            size = scan.nextInt();
            int[] right = new int[size];
            for(int a = 0; a < size; a++){ right[a] = scan.nextInt();}
            Isoceles a = new Isoceles(right);
            System.out.println(a.find());
        }catch (Exception e){
            System.out.print("Dados invalidos");
        }
    }
}
