import java.util.Arrays;
import java.util.PriorityQueue;

class Node implements Comparable<Node> {
    public int index;
    public int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(distance, o.distance);
    }
}

class Dijkstra {
    static int INF = Integer.MAX_VALUE;
    static int [] dijkstra(int start, int [][][] graph) {
        int n = graph.length;

        PriorityQueue<Node> pq = new PriorityQueue<>();

        int [] distances = new int [n];
        for (int i = 1; i < n; i++) {
            distances[i] = INF;
        }
        distances[start] = 0;

        pq.offer(new Node(start, distances[start]));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int [][] adjNodes = graph[node.index];

            for (int[] adjNode : adjNodes) {
                int adjIdx = adjNode[0];
                int adjDist = adjNode[1];

                if (node.distance + adjDist < distances[adjIdx]) {
                    distances[adjIdx] = node.distance + adjDist;
                    pq.offer(new Node(adjIdx, distances[adjIdx]));
                }
            }
        }

        return distances;
    }
}

class DijkstraTest {
    public static void main(String[] args) {
        int start = 0;
        int [][][] graph = {
                {{2, 5}, {3, 2}}, // 0번 노드의 {인접 노드, 가중치}
                {{3, 5}, {4, 3}}, // 1번 노드의 {인접 노드, 가중치}
                {{0, 3}, {4, 9}}, // ...
                {{0, 10}, {4, 2}},
                {{2, 13}, {1, 3}}
        };

        int [] distances = Dijkstra.dijkstra(start, graph);
        System.out.println(Arrays.toString(distances));
    }
}
