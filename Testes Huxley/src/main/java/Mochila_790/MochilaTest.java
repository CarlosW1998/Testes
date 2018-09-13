package Mochila_790;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MochilaTest {

    @Test
    void max() {
        int[] i = new int[0];
        Mochila a = new Mochila(i, i, 0);
        assertAll(
                ()->assertEquals(3, a.max(3, 2)),
                ()->assertEquals(12, a.max(12, 7)),
                ()->assertEquals(234, a.max(123, 234)),
                ()->assertEquals(47, a.max(3, 47)),
                ()->assertEquals(21, a.max(12, 21)),
                ()->assertEquals(2, a.max(-1, 2))
        );
    }
    @Test
    void best() {
        int[] v = {4, 2, 10};
        int[] p = {12, 1, 4};
        Mochila mymochila = new Mochila(p, v, 16);
        assertEquals(12, mymochila.best(0, 15));

        v = new int[]{4, 2, 10, 2, 1};
        p = new int[]{12, 1, 4, 2, 1};
        mymochila = new Mochila(p, v, 16);
        assertEquals(15, mymochila.best(0, 15));

        v = new int[]{72, 44, 31};
        p = new int[]{17, 23, 24};
        mymochila = new Mochila(p, v, 27);
        assertEquals(72, mymochila.best(0, 26));

        v = new int[]{64, 85, 52, 99, 39, 54};
        p = new int[]{26, 22, 4, 18, 13, 9};
        mymochila = new Mochila(p, v, 16);
        assertEquals(106, mymochila.best(0, 15));
    }
}