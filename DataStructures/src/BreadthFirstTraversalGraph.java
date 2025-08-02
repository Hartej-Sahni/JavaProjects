import java.util.List;

public class BreadthFirstTraversalGraph {
    public static void traverse(Graph graph, int[] visited, int vertexId) throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(vertexId);
        while (!queue.isEmpty()) {
            int vertex = queue.dequeue();
            if (visited[vertex] == 1) {
                continue;
            }
            System.out.print(vertex + "->");
            visited[vertex] = 1;
            List<Integer> adjacentVertices = graph.getAdjacentVertices(vertex);
            for (int i = 0; i < adjacentVertices.size(); i++) {
                queue.enqueue(adjacentVertices.get(i));
            }
        }
    }
}
