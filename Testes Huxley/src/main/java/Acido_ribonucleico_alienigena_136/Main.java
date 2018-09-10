package Acido_ribonucleico_alienigena_136;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        String s = f.nextLine();
        Acido a = new Acido("jfdlkasf");
        a.setAcid(s);
        System.out.println(a.numBind());
    }
}
