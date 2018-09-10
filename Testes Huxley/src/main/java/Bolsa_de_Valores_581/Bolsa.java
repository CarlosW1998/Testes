package Bolsa_de_Valores_581;

public class Bolsa {
    int[][] dp;
    int[] cust;
    int size, sale;

    public Bolsa(int[] c, int sale){
        this.sale = sale;
        this.cust = c;
        this.size = c.length;
        this.dp = new int[2][200000];
        for(int a = 0; a < 200000; a++){
            dp[0][a] = -1;
            dp[1][a] = -1;
        }
    }

    public int max(int a, int b){
        if(a > b){return a;}
        return b;
    }
    public int bestSale(int i, int flag){
        if(i >= this.size) return 0;
        if(dp[flag][i] != -1) return dp[flag][i];
        if(flag == 1){
            dp[flag][i] = max(-(this.cust[i]+this.sale) + bestSale(i+1, 0), bestSale(i+1, 1));
            return dp[flag][i];
        }
        dp[flag][i] = max(this.cust[i] + bestSale(i+1, 1), bestSale(i+1, 0));
        return dp[flag][i];
    }
}
