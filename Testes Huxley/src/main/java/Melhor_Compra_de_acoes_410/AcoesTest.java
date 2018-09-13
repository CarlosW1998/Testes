package Melhor_Compra_de_acoes_410;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcoesTest {

    @Test
    void max() {
        int[] i = new int[0];
        Acoes a = new Acoes(i);
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
    void bestPrice() {
        int[] i = {100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94, 90, 97};
        Acoes a = new Acoes(i);
        assertEquals(43, a.bestPrice(0));

        i = new int[]{70, 80, 50, 40, 60};
        a  = new Acoes(i);
        assertEquals(20, a.bestPrice(0));

        i = new int[]{10, 80, 20, 40, 30, 50, 40, 60, 70, 60, 10, 200};
        a  = new Acoes(i);
        assertEquals(190, a.bestPrice(0));

        i  = new int[]{270, 30, 40, 990, 550, 530, 320, 180, 190, 220, 330, 120, 730, 630, 150};
        a  = new Acoes(i);
        assertEquals(960, a.bestPrice(0));

        i = new int[]{3500, 2320, 5330, 4440, 7200};
        a  = new Acoes(i);
        assertEquals(4880, a.bestPrice(0));
    }
}