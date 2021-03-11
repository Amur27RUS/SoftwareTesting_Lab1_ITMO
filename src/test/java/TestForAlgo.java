import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ListIterator;

public class TestForAlgo {
    public int vertices = 7;
    public Graph graph = new Graph(vertices);

    @Before
    public void buildAGraph(){
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 2);
        graph.addEdge(3, 4);
        graph.addEdge(2, 4);
        graph.addEdge(4, 1);
        graph.addEdge(6, 4);
        graph.addEdge(1, 6);
        graph.addEdge(1, 5);
    }

    public void testMatch(int[] correctValues) {
        boolean expected = true;
        ListIterator<Integer> ite = graph.getVisitedVerts().listIterator();
        while (ite.hasNext() && expected) {
            expected = (correctValues[ite.nextIndex()] == ite.next());
        }
        assertTrue(expected);
    }

    @Test
    public void startFromZero() {
        int[] correctValues = { 0, 1, 6, 4, 5, 2, 3 };
        graph.DFS(0);
        testMatch(correctValues);
    }

    @Test
    public void startFromOne() {
        int[] correctValues = { 1, 6, 4, 5  };
        graph.DFS(1);
        testMatch(correctValues);
    }

    @Test
    public void startFromFive() {
        int[] correctValues = { 5 };
        graph.DFS(5);
        testMatch(correctValues);
    }

    @Test
    public void graphWithOneElemTest(){
        int[] correctValues = { 0 };
        Graph g = new Graph(1);
        g.addEdge(0, 0);
        boolean expected = true;
        ListIterator<Integer> ite = g.getVisitedVerts().listIterator();
        while (ite.hasNext() && expected) {
            expected = (correctValues[ite.nextIndex()] == ite.next());
        }
        assertTrue(expected);
    }

    @Test
    public void graphWithZeroElemTest(){
        int[] correctValues = { 0 };
        Graph g = new Graph(0);
        boolean expected = true;
        ListIterator<Integer> ite = g.getVisitedVerts().listIterator();
        while (ite.hasNext() && expected) {
            expected = (correctValues[ite.nextIndex()] == ite.next());
        }
        assertTrue(expected);
    }



}
