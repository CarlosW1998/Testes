package Hash_Table_242;

import java.util.ArrayList;

public class Hash {
    int size;
    ArrayList<Integer>[] list;

    public Hash(int size){
        this.size = size;
        this.list = new ArrayList[size];
        for(int a = 0; a < size;a++){
            this.list[a] = new ArrayList<Integer>();
        }
    }
    public void addValue(int i){
        this.list[i%this.size].add(i);
    }
    public void printList(ArrayList<Integer> i){
        for(int a: i){
            System.out.print(a + " -> ");
        }
        System.out.println("\\");
    }
    public void printall(){
        for(int a = 0; a < this.size; a++){
            System.out.print(a + " -> ");
            printList(this.list[a]);
        }
    }

}
