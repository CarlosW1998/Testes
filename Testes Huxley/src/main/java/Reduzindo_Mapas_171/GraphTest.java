package Reduzindo_Mapas_171;

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
    void prim() {
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

         g = new Graph(6);
         g.addEdge(1, 2, 15);
         g.addEdge(2, 1, 15);

         g.addEdge(1, 3, 10);
         g.addEdge(3, 1, 10);

         g.addEdge(2, 3, 1);
         g.addEdge(3, 2, 1);

         g.addEdge(3, 4, 3);
         g.addEdge(4, 3, 3);

         g.addEdge(2, 4, 5);
         g.addEdge(4, 2, 5);

         g.addEdge(4, 5, 20);
         g.addEdge(5, 3, 20);

         g.prim(1);

         i = new int[]{Integer.MAX_VALUE, 0, 1, 10, 3, 20};

         assertArrayEquals(i, g.dist);

    }
}