package Frete_1997;

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
    void dijkstra() {
        Graph mygraph = new Graph(8);
        mygraph.addEdge(1, 2, 5);
        mygraph.addEdge(3, 1, 32);
        mygraph.addEdge(1, 4, 3);
        mygraph.addEdge(2, 3, 4);
        mygraph.addEdge(2, 6, 20);
        mygraph.addEdge(6, 3, 1);
        mygraph.addEdge(6, 4, 9);
        mygraph.addEdge(6, 5, 6);
        mygraph.addEdge(3, 7, 19);
        mygraph.addEdge(5, 7, 2);
        mygraph.dijkstra(1);
        int[] i = {Integer.MAX_VALUE, 0,5,9,3,31,25,28};
        assertArrayEquals(i, mygraph.dist);
        mygraph = new Graph(6);
        mygraph.addEdge(1, 2, 4);
        mygraph.addEdge(1, 3, 3);
        mygraph.addEdge(4, 3, 6);
        mygraph.addEdge(4, 5, 2);
        mygraph.addEdge(2, 4, 1);
        mygraph.addEdge(3, 5, 5);
        mygraph.dijkstra(1);
        i = new int[]{Integer.MAX_VALUE, 0,4,3,5,7};
        assertArrayEquals(i, mygraph.dist);
    }
}