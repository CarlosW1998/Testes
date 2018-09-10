package Apagando_e_Ganahando_653;

import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size, erasers;
        try {
            size = scan.nextInt();
            erasers = scan.nextInt();
            char[] num = new char[size];
            scan.nextLine();
            num = scan.nextLine().toCharArray();
            BestNumber a = new BestNumber(num);
            a.erase(erasers);
            a.printUpdateNumber();


        }catch (Exception e){
            System.out.print("Dados Invalidos");
        }

    }
}
