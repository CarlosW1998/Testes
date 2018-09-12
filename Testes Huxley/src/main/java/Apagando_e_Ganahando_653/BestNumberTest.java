package Apagando_e_Ganahando_653;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestNumberTest {

    @Test
    void test(){
        BestNumber a = new BestNumber("3759".toCharArray());
        a.erase(2);
        assertArrayEquals("79\0".toCharArray(), a.updatedNumber);
        a = new BestNumber("123123".toCharArray());
        a.erase(3);
        assertArrayEquals("323\0".toCharArray(), a.updatedNumber);
        a = new BestNumber("1000000".toCharArray());
        a.erase(4);
        assertArrayEquals("100\0".toCharArray(), a.updatedNumber);
        a = new BestNumber("9382736452".toCharArray());
        a.erase(7);
        assertArrayEquals("987\0".toCharArray(), a.updatedNumber);
        a = new BestNumber("291827364536370".toCharArray());
        a.erase(10);
        assertArrayEquals("98770\0".toCharArray(), a.updatedNumber);
        a = new BestNumber("7281920".toCharArray());
        a.erase(2);
        assertArrayEquals("81920\0".toCharArray(), a.updatedNumber);
    }
}