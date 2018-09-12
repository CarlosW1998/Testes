package Adega_de_Vinhos_602;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdegaTest {

    @Test
    void max() {
        int[] i = {1,2, 3};
        Adega a = new Adega(i);
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
    void bestsale() {
        int[]  i = {2, 3, 5, 1, 4};
        Adega a = new Adega(i);
        assertEquals(50, a.bestsale(0, i.length-1, 1));
        i = new int[]{2, 3, 5, 12, 4, 7, 15};
        a = new Adega(i);
        assertEquals(238, a.bestsale(0, i.length-1, 1));
        i = new int[]{2, 20, 5, 12, 4, 7, 15, 13, 17};
        a = new Adega(i);
        assertEquals(529, a.bestsale(0, i.length-1, 1));
        i = new int[]{2, 20, 5, 12, 4, 7, 15, 13, 17, 23, 14, 3};
        a = new Adega(i);
        assertEquals(1061, a.bestsale(0, i.length-1, 1));
        i = new int[]{4, 5, 50, 2, 20, 5, 12, 4, 7, 15, 13, 17, 23, 14, 3};
        a = new Adega(i);
        assertEquals(1843, a.bestsale(0, i.length-1, 1));
        i = new int[]{4, 5, 50, 2, 20, 5, 12, 4, 7, 15, 13, 17, 23, 14, 3, 13, 17, 4};
        a = new Adega(i);
        assertEquals(2541, a.bestsale(0, i.length-1, 1));
        i = new int[]{4, 5, 50, 2, 20, 5, 12, 4, 7, 15, 13, 17, 23, 14, 3, 13, 17, 4, 27, 2};
        a = new Adega(i);
        assertEquals(3097, a.bestsale(0, i.length-1, 1));

    }
}