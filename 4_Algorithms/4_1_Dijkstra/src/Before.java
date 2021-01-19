import java.util.PriorityQueue;

class Graph {
    // TODO
}

class Dijkstra {
    static float INF = Float.POSITIVE_INFINITY;
    static float [] dijkstra(int start, Graph graph) {
        int n = graph.length;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        float [] distances = new float [n];
        for (int i = 0; i < n; i++) {
            distances[i] = INF;
        }

        // TODO: implement dijkstra algorithm

        return distances;
    }
}

class DijkstraTest {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.nodes.add(new Node())
        
        graph = [[(2, 5), (3, 2)], # (인접노드, 가중치)
                 [(3, 5), (4, 3)],
                 [(0, 3), (4, 9)],
                 [(0, 10), (4, 2)],
                 [(2, 13), (1, 3)]]
    }
}

def dijkstra(start, graph):
    n = len(graph)
    heap = []
    distances = [float('inf')] * n
    


