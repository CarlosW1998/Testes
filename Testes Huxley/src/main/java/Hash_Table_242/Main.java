package Hash_Table_242;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int cases;
        Scanner scan = new Scanner(System.in);
        cases = scan.nextInt();
        while(cases > 0){
            int size, elementes;
            size = scan.nextInt();
            elementes = scan.nextInt();
            Hash myhash = new Hash(size);
            for(int a = 0; a < elementes; a++){
                myhash.addValue(scan.nextInt());
            }
            myhash.printall();
            cases--;
        }
    }
}
