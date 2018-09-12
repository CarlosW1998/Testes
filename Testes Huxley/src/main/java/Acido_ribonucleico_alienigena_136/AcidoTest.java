package Acido_ribonucleico_alienigena_136;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcidoTest {
    @Test
    void Algoritmotest(){
        Acido a = new Acido("");
        a.setAcid("SBC");
        assertEquals(a.numBind(), 1);
        a.setAcid("FCC");
        assertEquals(a.numBind(), 1);
        a.setAcid("SFBC");
        assertEquals(a.numBind(), 0);
        a.setAcid("CFCBSFFSBCCB");
        assertEquals(a.numBind(), 5);


    }
}