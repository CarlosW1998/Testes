package Bolsa_de_Valores_581;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BolsaTest {
    @Test
    void max(){
        int[] i = new int[5];
        Bolsa a = new Bolsa(i, 15);

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
    void bolsa(){
        int[] i = {100, 120, 130, 80, 50, 40};
        Bolsa a = new Bolsa(i, 10);
        assertEquals(20, a.bestSale(0, 1));
        i = new int[]{70, 80, 50, 40, 60};
        a = new Bolsa(i, 10);
        assertEquals(10, a.bestSale(0, 1));
        i = new int[]{10, 80, 20, 40, 30, 50, 40, 60, 70, 60, 10, 200};
        a = new Bolsa(i, 30);
        assertEquals(220, a.bestSale(0, 1));
        i  = new int[]{270, 30, 40, 990, 550, 530, 320, 180, 190, 220, 330, 120, 730, 630, 150};
        a = new Bolsa(i, 50);
        assertEquals(1570, a.bestSale(0, 1));
        i = new int[]{3500, 2320, 5330, 4440, 7200};
        a = new Bolsa(i, 15);
        assertEquals(5740, a.bestSale(0, 1));
    }

}