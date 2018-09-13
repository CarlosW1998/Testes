package Isoceles_1143;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsocelesTest {

    @Test
    void min() {
        int[]i = new int[0];
        Isoceles a  =new Isoceles(i);
        assertAll(
                ()->assertEquals(2, a.min(3, 2)),
                ()->assertEquals(7, a.min(12, 7)),
                ()->assertEquals(123, a.min(123, 234)),
                ()->assertEquals(3, a.min(3, 47)),
                ()->assertEquals(12, a.min(12, 21)),
                ()->assertEquals(-1, a.min(-1, 2))
        );
    }

    @Test
    void max() {
        int[] i = {2, 5, 3, 6, 6, 7, 13};
        int[] i1 = {23, 17, 15, 2, 5, 3, 6, 6, 7, 13};
        int[] i2 = {23, 17, 15, 2, 5, 3, 6, 6, 7, 13, 45, 33, 37, 42};
        int[] i3 = {69, 55, 51, 49, 23, 17, 15, 2, 5, 3, 6, 6, 7, 13, 45, 33, 37, 42};
        int[]j = new int[0];
        Isoceles a  =new Isoceles(j);
        assertAll(
                ()->assertEquals(13, a.max(i)),
                ()->assertEquals(23, a.max(i1)),
                ()->assertEquals(45, a.max(i2)),
                ()->assertEquals(69, a.max(i3))
        );
    }

    @Test
    void find() {
        int[] i = {5, 1, 1, 1, 1, 1, 1, 1, 3};
        int[] i1 = {5, 6, 5, 8, 9, 10, 5, 8, 9, 5, 7, 9, 9, 9, 6, 3};
        Isoceles a = new Isoceles(i);
        assertEquals(1, a.find());
        a = new Isoceles(i1);
        assertEquals(6, a.find());
    }
}