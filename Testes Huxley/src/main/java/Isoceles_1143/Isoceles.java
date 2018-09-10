package Isoceles_1143;

public class Isoceles {
    int[] size;
    public Isoceles(int[] a){
        this.size = a;
    }

    public int min(int a, int b){
        if(a < b){return a;}
        return b;
    }
    public int max(int[] sizes){
        int aux = Integer.MIN_VALUE;
        for(int a: sizes){
            if(a > aux) aux = a;
        }
        return  aux;
    }
    public int find(){
        int [] finalSize = new int[this.size.length], leftSize = new int[this.size.length], rightSize = new int[this.size.length];
        leftSize[0] = 1;
        rightSize[this.size.length-1] = 1;
        for(int a = 1; a < this.size.length; a++) {leftSize[a] = min(leftSize[a-1]+1, this.size[a]);}
        for(int a = this.size.length-2; a >= 0; a--) {rightSize[a] = min(rightSize[a+1]+1, this.size[a]);}
        for(int a = 0; a < this.size.length; a++) {finalSize[a] = min(leftSize[a], rightSize[a]);}
        return max(finalSize);
    }

}
