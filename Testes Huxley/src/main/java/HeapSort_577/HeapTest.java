package HeapSort_577;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {

    @Test
    void heapSort() {
        int[] i = {0, 27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0};
        int[] r= { 0, 1, 3, 4, 5, 7, 8, 9, 10, 12, 13, 16, 17, 27};
        Heap myheap = new Heap(i);

        assertArrayEquals(r, myheap.heapSort());
        i = new int[]{0, 27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 23, 32, 47, 39, 55, 44};
        r = new int[]{0, 1, 3, 4, 5, 7, 8, 9, 10, 12, 13, 16, 17, 23, 27, 32, 39, 47, 55};
        myheap = new Heap(i);
        assertArrayEquals(r, myheap.heapSort());

        i = new int[]{0, 27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 23, 32, 47, 39, 55, 44, 76, 46, 54, 64, 113, 92, 83, 88};
        r = new int[]{0, 1, 3, 4, 5, 7, 8, 9, 10, 12, 13, 16, 17, 23, 27, 32, 39, 44, 46, 47, 54, 55, 64, 76, 83, 92, 113};
        myheap = new Heap(i);
        assertArrayEquals(r, myheap.heapSort());
    }
}