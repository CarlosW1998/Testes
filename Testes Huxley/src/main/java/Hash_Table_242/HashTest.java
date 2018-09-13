package Hash_Table_242;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HashTest {
    public boolean equals(ArrayList<Integer> a1, ArrayList<Integer> a2){
        if(a1.size() != a2.size()) {return false;}
        for(int a = 0; a < a1.size(); a++){ if (a1.get(a) != a2.get(a)) { return false; } }
        return true;
    }

    @Test
    void addValue() {
        Hash myhash = new Hash(7);
        ArrayList<Integer> i0 = new ArrayList<Integer>();
        i0.add(7);
        i0.add(21);
        ArrayList<Integer> i1 = new ArrayList<Integer>();
        i1.add(57);
        i1.add(43);
        ArrayList<Integer> i2 = new ArrayList<Integer>();
        i2.add(2);
        i2.add(23);
        i2.add(51);
        ArrayList<Integer> i3 = new ArrayList<Integer>();
        i3.add(3);
        i3.add(17);
        i3.add(73);
        i3.add(115);
        i3.add(94);
        i3.add(87);
        ArrayList<Integer> i4 = new ArrayList<Integer>();
        i4.add(25);
        i4.add(39);
        i4.add(81);
        ArrayList<Integer> i5 = new ArrayList<Integer>();
        i5.add(33);
        ArrayList<Integer> i6 = new ArrayList<Integer>();
        i6.add(13);
        i6.add(27);
        i6.add(62);

        myhash.addValue(2);
        myhash.addValue(3);
        myhash.addValue(7);
        myhash.addValue(21);
        myhash.addValue(13);
        myhash.addValue(33);
        myhash.addValue(23);
        myhash.addValue(17);
        myhash.addValue(27);
        myhash.addValue(25);
        myhash.addValue(39);
        myhash.addValue(73);
        myhash.addValue(51);
        myhash.addValue(57);
        myhash.addValue(43);
        myhash.addValue(62);
        myhash.addValue(115);
        myhash.addValue(81);
        myhash.addValue(94);
        myhash.addValue(87);

        assertAll(
                ()->assertTrue(equals(myhash.list[0], i0)),
                ()->assertTrue(equals(myhash.list[1], i1)),
                ()->assertTrue(equals(myhash.list[2], i2)),
                ()->assertTrue(equals(myhash.list[3], i3)),
                ()->assertTrue(equals(myhash.list[4], i4)),
                ()->assertTrue(equals(myhash.list[5], i5)),
                ()->assertTrue(equals(myhash.list[6], i6))
        );


    }
}