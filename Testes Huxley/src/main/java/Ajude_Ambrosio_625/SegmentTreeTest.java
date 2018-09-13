package Ajude_Ambrosio_625;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SegmentTreeTest {
    @Test
    void getSun() {
        int[]  i = {0, 42, 125, 5123, 2312, 123, 5125, 123, 5125, 12, 123, 512, 1255, 15, 23, 123, 15, 15, 123, 512, 125, 123, 12,42, 123,512, 123, 321};
        int size = i.length-1;
        SegmentTree s = new SegmentTree(i);
        assertAll(
                ()->assertEquals(5, s.getSun(1, 7, 1, size, 1)),
                ()->assertEquals(7, s.getSun(2, 11, 1, size, 1)),
                ()->assertEquals(6, s.getSun(3, 11, 1, size, 1)),
                ()->assertEquals(11, s.getSun(2, 15, 1, size, 1)),
                ()->assertEquals(7, s.getSun(3, 12, 1, size, 1)),
                ()->assertEquals(3, s.getSun(11, 14, 1, size, 1)),
                ()->assertEquals(10, s.getSun(7, 18, 1, size, 1)),
                ()->assertEquals(7, s.getSun(2, 11, 1, size, 1)),
                ()->assertEquals(7, s.getSun(13, 20, 1, size, 1)),
                ()->assertEquals(10, s.getSun(10, 22, 1, size, 1)),
                ()->assertEquals(4, s.getSun(12, 15, 1, size, 1)),
                ()->assertEquals(2, s.getSun(14, 15, 1, size, 1)),
                ()->assertEquals(5, s.getSun(13, 17, 1, size, 1)),
                ()->assertEquals(4, s.getSun(4, 9, 1, size, 1))
        );
    }
}