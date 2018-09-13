package Os_Suspeitos_440;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    public boolean equals(int[] a1, int[] a2){
        if(a1.length != a2.length){return false;}
        for(int i = 0; i < a1.length; i++){ if(a1[i] != a2[i]){return false;} }
        return true;
    }
    @Test
    void addEdge() {
        int[] test = new int[10];
        Graph a = new Graph(10);
        a.addEdge(1, 3);
        test[3] = 1;
        assertTrue(equals(a.edges[1], test));
        a.addEdge(1, 5);
        test[5] = 1;
        assertTrue(equals(a.edges[1], test));
        a.addEdge(1, 9);
        test[9] = 1;
        assertTrue(equals(a.edges[1], test));
        a.addEdge(1, 7);
        test[7] = 1;
        assertTrue(equals(a.edges[1], test));
        test = new int[10];
        a.addEdge(7, 1);
        test[1] = 1;
        assertTrue(equals(a.edges[7], test));
        a.addEdge(7, 3);
        test[3] = 1;
        assertTrue(equals(a.edges[7], test));
        a.addEdge(7, 7);
        test[7] = 1;
        assertTrue(equals(a.edges[7], test));
    }

}