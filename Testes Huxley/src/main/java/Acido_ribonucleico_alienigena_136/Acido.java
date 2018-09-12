package Acido_ribonucleico_alienigena_136;

public class Acido {
    char acid[];

    public  Acido(String a){
        a += "\0";
        this.acid = a.toCharArray();
    }
    private void push(int p){
        if(p+2 > this.acid.length){return;}
        while (this.acid[p+2] != '\0'){
            this.acid[p] = this.acid[p+2];
            p++;
        }
        this.acid[p] = '\0';
    }
    public   int merge(int p){
        if(this.acid[p] == 'Z' || this.acid[p] == '\0' || this.acid[p+1] == '\0'){return 0;}

        if(this.acid[p] == 'B' || this.acid[p] == 'S'){
            if(this.acid[p] == this.acid[p+1] && (this.acid[p+1] == 'B' || this.acid[p+1] == 'S')){
                push(p);
                return  1;
            }
            if(p > 0 && this.acid[p-1] != this.acid[p] && (this.acid[p-1] == 'B' || this.acid[p-1] == 'S')){
                push(p-1);
                return  1;
            }
        }

        if(this.acid[p] == 'C' || this.acid[p] == 'F'){
            if(this.acid[p] == this.acid[p+1] && (this.acid[p+1] == 'C' || this.acid[p+1] == 'F')){
                push(p);
                return  1;
            }
            if(p > 0 && this.acid[p-1] != this.acid[p] && (this.acid[p-1] == 'C' || this.acid[p-1] == 'F')){
                push(p-1);
                return  1;
            }
        }
        return 0;
    }
    public int numBind(){
        int cont = 0;
        int a = 0;
        while (this.acid[a] != '\0'){
            if(merge(a) == 1){
                cont++;
                if(a > 0) a--;
            }
            else {
                a++;
            }
        }
        return cont;
    }

    public void setAcid(String a){
        a += "\0";
        this.acid = a.toCharArray();
    }

    public char[] getAcid() {
        return this.acid;
    }

}
