package Ambrosio_e_os_numeros_especiais_619;

public class SegmentTree {
    int[] elements, segment;

    public SegmentTree(int[] a){
        this.elements = a;
        this.segment = new int[500000];
        construct(1, a.length-1, 1);
    }

    private int construct(int i, int f, int p){
        if(i == f){
            this.segment[p] = elements[i]%2;
            return this.segment[p];
        }
        this.segment[p] = construct(i, (i+f)/2, p*2) + construct(1+(i+f)/2, f, p*2+1 );
        return this.segment[p];
    }
    public int getSun(int i, int f, int ie, int fe, int p){
        if(i >= ie && f <= fe) {return segment[p];}
        if(ie > f  || fe < i ){return 0;}
        int midle = (i+f)/2;
        return getSun(i, midle, ie, fe, p*2) + getSun(midle+1, f, ie, fe, p*2+1);
    }
    public void update(int i, int f, int ie, int dif, int p){
        if(i > ie  || f < ie) return;
        this.segment[p] += dif;
        if(i != f){
            int midle = (i+f)/2;
            update(i, midle, ie, dif, p*2);
            update(midle+1, f, ie, dif, p*2+1);
        }
    }
}
