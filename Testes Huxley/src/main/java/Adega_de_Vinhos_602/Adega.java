package Adega_de_Vinhos_602;

public class Adega {
    int[] vinhos;
    int[][] dp;
    int size;

    public Adega(int[] a){
        this.vinhos = a;
        this.size = a.length;
        this.dp = new int[this.size][this.size];
    }
    public int max(int a, int b){
        if(a > b) return a;
        return b;
    }
    public int bestsale(int i, int f, int ano){
        if(this.dp[i][f] != 0 ){return dp[i][f];}
        if(i == f){return ano*this.vinhos[i];}
        dp[i][f] =  max(vinhos[i]*ano + bestsale(i+1, f, ano+1), vinhos[f]*ano + bestsale(i,f-1, ano+1));
        return dp[i][f];
    }
}
