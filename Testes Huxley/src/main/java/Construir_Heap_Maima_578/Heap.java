package Construir_Heap_Maima_578;

public class Heap {
    int size, maxsize;
    int[] elemntes;
    public Heap(int[] a){
        this.elemntes = a;
        this.maxsize = a.length;
        this.size = a.length;
    }
    private int paretIndex(int i){ return  i/2; }
    private int leftIndex(int i) { return i * 2; }
    private int rightIndex(int i){return  i*2 +1;}
    public boolean isEmpt(){return this.size == 0;}
    public void maHeapfy(int i){
        int larguest;
        int left=leftIndex(i), right = rightIndex(i);
        if(left <= this.size && this.elemntes[left] > this.elemntes[i]) {larguest = left;}
        else  {larguest = i;}
        if(right <= this.size && this.elemntes[right] > this.elemntes[larguest]){larguest = right;}
        if(this.elemntes[i] != this.elemntes[larguest]){
            int aux = this.elemntes[i];
            this.elemntes[i] = this.elemntes[larguest];
            this.elemntes[larguest] = aux;
            maHeapfy(larguest);
        }
    }
    public void BildMaxheap(){
        for(int i = 0; i < this.size/2; i++){
            maHeapfy(i);
        }
        printHeap();
    }
    public void printHeap(){
        for(int a = 0; a < this.size; a++){ System.out.print(this.elemntes[a] + " | "); }
        System.out.println();
    }

}
