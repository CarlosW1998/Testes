package Melhor_Compra_de_acoes_410;

public class Acoes {
    private int size;
    private int[] cust;

    public Acoes(int[] a){
        this.cust = a;
        this.size = a.length;
    }

    public int max(int a, int b){
        if(a > b){return a;}
        return b;
    }
    public int bestPrice(int i){
        if(i >= this.size) return 0;
        int a, pivot = i, bestBuy = Integer.MIN_VALUE;
        for(a = i; a < this.size; a++) if(this.cust[a] >= this.cust[pivot]) pivot = a;
        for(a = i; a <= pivot; a++) if((this.cust[pivot] - this.cust[a]) > bestBuy){bestBuy = this.cust[pivot] - this.cust[a];}
        return max(bestBuy, bestPrice(i+1));

    }
}
