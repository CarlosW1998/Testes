package Ambrosio_e_as_ilhas_596;

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
        int[] test = new int[11];

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
        test = new int[11];
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
    void dist(){
        Graph g = new Graph(4);
        g.addEdge(1, 2);
        g.addEdge(2, 1);

        g.addEdge(2, 3);
        g.addEdge(3, 2);

        g.addEdge(3, 4);
        g.addEdge(4, 3);

        g.addEdge(4, 2);
        g.addEdge(2, 4);

        g.bfs(1);

        int[] i = {0, 0, 1, 2, 2};
        assertArrayEquals(i, g.path);
        assertEquals(2, g.dist(4));
        i = new int[]{0, 0, 1, 0, 0};
        assertArrayEquals(i, g.edges[1]);
        i = new int[]{0,1,0,1,1};
        assertArrayEquals(i, g.edges[2]);
        i = new int[]{0,0,1,0,1};
        assertArrayEquals(i, g.edges[3]);
        i = new int[]{0,0,1,1,0};
        assertArrayEquals(i, g.edges[4]);

    }
}