package Arvore_Geradora_Maxima_628;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    public boolean equals(int[] a1, int[] a2){
        if(a1.length != a2.length){return false;}
        for(int i = 0; i < a1.length; i++){ if(a1[i] != a2[i]){return false;} }
        return true;
    }
    @Test
    void edges(){
        Graph a  = new Graph(10);
        int[] test = new int[10];

        a.addEdge(1, 3, 5);
        test[3] = 5;
        assertTrue(equals(a.edges[1], test));
        a.addEdge(1, 5, 4);
        test[5] = 4;
        assertTrue(equals(a.edges[1], test));
        a.addEdge(1, 9, 15);
        test[9] = 15;
        assertTrue(equals(a.edges[1], test));
        a.addEdge(1, 7, 1);
        test[7] = 1;
        assertTrue(equals(a.edges[1], test));
        test = new int[10];
        a.addEdge(7, 1, 3);
        test[1] = 3;
        assertTrue(equals(a.edges[7], test));
        a.addEdge(7, 3, 15);
        test[3] = 15;
        assertTrue(equals(a.edges[7], test));
        a.addEdge(7, 7, 12);
        test[7] = 12;
        assertTrue(equals(a.edges[7], test));
    }
    @Test
    void geracoa(){
        Graph g = new Graph(4);

        g.addEdge(1, 2, -2);
        g.addEdge(2, 1, -2);

        g.addEdge(2, 3, -3);
        g.addEdge(3, 2, -3);

        g.addEdge(1, 3, -4);
        g.addEdge(3, 1, -4);

        g.prim(1);
        int[] i = {Integer.MAX_VALUE, 0, -3, -4};
        assertArrayEquals(i, g.dist);

    }

}