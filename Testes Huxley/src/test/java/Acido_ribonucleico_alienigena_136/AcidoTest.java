package Acido_ribonucleico_alienigena_136;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AcidoTest {

    @Test
    void merge(){
        Acido a = new Acido("");
        a.setAcid("Z");
        assertEquals(0, a.merge(0));
        a.setAcid("");
        assertEquals(0, a.merge(0));
        a.setAcid("A");
        assertEquals(0, a.merge(0));
        a.setAcid("BB");
        assertEquals(1, a.merge(0));
        a.setAcid("SS");
        assertEquals(1, a.merge(0));
        a.setAcid("CC");
        assertEquals(1, a.merge(0));
        a.setAcid("FF");
        assertEquals(1, a.merge(0));
        a.setAcid("CF");
        assertEquals(0, a.merge(0));

    }
    @Test
    void numBind() {
        Acido a = new Acido("");
        a.setAcid("SBC");
        assertEquals(1, a.numBind());
        a.setAcid("FCC");
        assertEquals(1, a.numBind());
        a.setAcid("SFBC");
        assertEquals(0, a.numBind());
        a.setAcid("SFBCFSCB");
        assertEquals(3, a.numBind());
        a.setAcid("CFCBSFFSBCCB");
        assertEquals(5, a.numBind());
    }
}