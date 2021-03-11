import java.util.*;


class Graph {
    private int numVertices;
    private LinkedList<Integer> adjLists[];
    private boolean visited[];
    private final ArrayList<Integer> visitedVerts = new ArrayList<>();

    Graph(int vertices){
        numVertices = vertices; //вершины
        adjLists = new LinkedList[vertices]; //рёбра
        visited = new boolean[vertices]; //пройденные вершины

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    void addEdge(int src, int dest){
        adjLists[src].add(dest);
    }

    ArrayList<Integer> getVisitedVerts() {
        return visitedVerts;
    }

    void DFS(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");
        visitedVerts.add(vertex);

        Iterator ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = (int) ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }


    public static void main(String args[]){
        Graph graph = new Graph(7);

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

        graph.DFS(6);
    }
}