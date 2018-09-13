package Ambrosio_e_os_numeros_especiais_619;

import org.junit.jupiter.api.Test;

import static Ambrosio_e_os_numeros_especiais_619.Main.isEspecial;
import static org.junit.jupiter.api.Assertions.*;

class SegmentTreeTest {
    @Test
    void sun(){
        int[]  i = {0, 42, 125, 5123, 2312, 123, 5125, 123, 5125, 12, 123, 512, 1255, 15, 23, 123, 15, 15, 123, 512, 125, 123, 12,42, 123,512, 123, 321};
        int[] j = new int[i.length];
        for(int a = 1; a < i.length; a++){
            j[a] = isEspecial(Integer.toString(i[a]).toCharArray());
        }
        SegmentTree s = new SegmentTree(j);
        int size = j.length-1;
        assertAll(
                ()->assertEquals(1, s.getSun(1, size, 1, 5, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 9, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 13, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 15, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 23, 1)),
                ()->assertEquals(1, s.getSun(1, size, 7, 23, 1)),
                ()->assertEquals(0, s.getSun(1, size, 9, 23, 1)),
                ()->assertEquals(0, s.getSun(1, size, 13, 23, 1)),
                ()->assertEquals(0, s.getSun(1, size, 15, 23, 1)),
                ()->assertEquals(0, s.getSun(1, size, 17, 23, 1)),
                ()->assertEquals(0, s.getSun(1, size, 20, 23, 1)),
                ()->assertEquals(2, s.getSun(1, size, 1, 7, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 11, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 11, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 15, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 12, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 12, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 18, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 11, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 20, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 22, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 15, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 15, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 17, 1)),
                ()->assertEquals(3, s.getSun(1, size, 1, 9, 1))

        );
    }

}