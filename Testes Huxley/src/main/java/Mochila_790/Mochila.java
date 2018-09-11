package Mochila_790;

public class Mochila {
    int[][] dp;
    int[] peso, valor;
    int size;

    public Mochila(int[]p, int[] v, int c){
        this.peso = p;
        this.valor = v;
        this.size = p.length;
        this.dp = new int[p.length][c];
    }
    public int max(int a, int b){
        if(a > b){return a;}
        return b;
    }
    public int best(int i, int capacity){
        if(i == this.size || capacity <= 0){return 0;}
        if(dp[i][capacity] != 0) {return this.dp[i][capacity];}
        if(this.peso[i] > capacity){
            dp[i][capacity] = best(i+1, capacity);
            return dp[i][capacity];
        }
        dp[i][capacity] = max(this.valor[i] + best(i+1, capacity-this.peso[i]), best(i+1, capacity));
        return dp[i][capacity];
    }
}
