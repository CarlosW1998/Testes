package Construir_Heap_Maima_578;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {

    @Test
    void isEmpt() {
        int[] i = new int[0];
        int[] i2 = new int[3];
        Heap myheap = new Heap(i);
        Heap myheap1 = new Heap(i2);
        assertAll(
                ()->assertTrue(myheap.isEmpt()),
                ()->assertFalse(myheap1.isEmpt())
        );
    }


    @Test
    void bildMaxheap() {
        int[] i0  = {0, 14, 15, 17, 19, 23, 27, 29};
        int[] i2  = {0, 23, 18, 31, 17, 19, 20, 27, 29, 33, 44, 33};
        int[] i3 = {0, 23, 18, 31, 17, 19, 23, 27, 29, 41, 10, 20, 54, 47, 7};
        int[] i;
        Heap myheap = new Heap(i0);
        myheap.BildMaxheap();
        i = new int[]{0, 29, 23, 27, 19, 15, 14, 17};
        assertArrayEquals(myheap.elemntes, i);
        myheap = new Heap(i2);
        myheap.BildMaxheap();
        i = new int[]{0, 44, 33, 31, 29, 33, 20, 27, 23, 17, 19, 18};
        assertArrayEquals(i, myheap.elemntes);
        myheap = new Heap(i3);
        myheap.BildMaxheap();
        i = new int[]{0, 54, 41, 47, 29, 20, 31, 27, 18, 17, 10, 19, 23, 23, 7};
        assertArrayEquals(i, myheap.elemntes);

    }
}