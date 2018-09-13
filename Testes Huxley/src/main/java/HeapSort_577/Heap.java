package HeapSort_577;

public class Heap {
    int size, maxsize;
    int[] elemntes;
    public Heap(int[] a){
        this.elemntes = new int[a.length+1];
        for(int i = 1; i <= a.length; i++){ this.elemntes[i] = a[i-1]; }
        this.maxsize = a.length;
        this.size = a.length-1;
        BildMaxheap();
    }
    private int paretIndex(int i){ return  i/2; }
    private int leftIndex(int i) { return i * 2; }
    private int rightIndex(int i){return  i*2 +1;}
    public boolean isEmpt(){return this.size == 0;}

    public void maxHeapfy(int i){
        int larguest;
        int left=leftIndex(i), right = rightIndex(i);
        if(left <= this.size && this.elemntes[left] > this.elemntes[i]) {larguest = left;}
        else  {larguest = i;}
        if(right <= this.size && this.elemntes[right] > this.elemntes[larguest]){larguest = right;}
        if(this.elemntes[i] != this.elemntes[larguest]){
            int aux = this.elemntes[i];
            this.elemntes[i] = this.elemntes[larguest];
            this.elemntes[larguest] = aux;
            maxHeapfy(larguest);
        }
    }
    public void BildMaxheap(){
        for(int i = this.size/2; i >= 1 ; i--){
            maxHeapfy(i);
        }
    }
    public int[] heapSort(){
        int k = this.size-1;
        int[] sorted = new int[this.size];
        for(int i = this.size; i>=2; i--, k--){
            sorted[k] = this.elemntes[1];

            int aux = this.elemntes[i];
            this.elemntes[i] = this.elemntes[1];
            this.elemntes[1] = aux;

            this.size--;
            maxHeapfy(1);
        }
        sorted[k] = this.elemntes[1];
        return sorted;
    }
}
