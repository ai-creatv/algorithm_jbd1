import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Vertex {
    public int value;
    List<Integer> adjList;

    public Vertex(int value, List<Integer> adjList) {
        this.value = value;
        this.adjList = adjList;
    }
}

class Graph {
    List<Vertex> vertexList = new ArrayList<>();

    public void insert(int value, int [] adjVertices) {
        int vInd = vertexList.size();
        List<Integer> adjList = new ArrayList<>();

        for (int idx: adjVertices) {
            adjList.add(idx);
        }
        Vertex v = new Vertex(value, adjList);

        for (int adjV: v.adjList) {
            vertexList.get(adjV).adjList.add(vInd);
        }

        vertexList.add(v);
    }

    public boolean bfs(int ind, int value) {
        return true;
    }

    public boolean dfs(int ind, int value) {
        return true;
    }
}

class GraphTest {
    public static void main(String[] args) {
        Graph g = new Graph();

        int [] array1 = {};
        g.insert(0, array1);

        int [] array2 = {0};
        g.insert(1, array2);

        int [] array3 = {1};
        g.insert(2, array3);

        int [] array4 = {0, 2};
        g.insert(3, array4);

        int [] array5 = {3};
        g.insert(4, array5);

        System.out.println(g.bfs(0, 2));
        System.out.println(g.bfs(0, 6));
        System.out.println(g.dfs(0, 2));
        System.out.println(g.dfs(0, 6));
    }
}