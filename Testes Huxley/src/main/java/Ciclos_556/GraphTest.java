package Ciclos_556;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    public boolean equals(int[] a1, int[] a2){
        if(a1.length != a2.length){return false;}
        for(int i = 0; i < a1.length; i++){ if(a1[i] != a2[i]){return false;} }
        return true;
    }
    @Test
    void addEdge(){
        Graph a  = new Graph(10);
        int[] test = new int[10];

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

    @Test
    void cicle(){
        Graph a = new Graph(5);
        a.addEdge(0, 1);
        a.addEdge(0, 2);
        a.addEdge(0, 3);
        a.addEdge(1, 2);
        a.addEdge(1, 2);
        a.addEdge(2, 3);
        a.addEdge(2, 4);
        assertEquals(1, a.hasCicle(0));
        a = new Graph(6);
        a.addEdge(1, 4);
        a.addEdge(1, 5);
        a.addEdge(2, 4);
        a.addEdge(3, 5);
        assertEquals(0, a.hasCicle(0));
        a = new Graph(7);
        a.addEdge(0, 1);
        a.addEdge(1, 3);
        a.addEdge(1, 4);
        a.addEdge(1, 5);
        a.addEdge(2, 3);
        a.addEdge(2, 6);
        a.addEdge(3, 5);
        a.addEdge(4, 5);
        assertEquals(1, a.hasCicle(0));
    }


}

