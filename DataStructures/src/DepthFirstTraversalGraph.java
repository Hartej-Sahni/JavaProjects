import java.util.List;

public class DepthFirstTraversalGraph {
    public static void postOrderTraversal(Graph graph, int[] visited, int vertexIndex) {
        if (visited[vertexIndex] == 1) {
            return;
        }
        visited[vertexIndex] = 1;
        List<Integer> adjacentVertices = graph.getAdjacentVertices(vertexIndex);
        for (int i = 0; i < adjacentVertices.size(); i++) {
            postOrderTraversal(graph, visited, adjacentVertices.get(i));
        }
        System.out.print(vertexIndex + "->");
    }

    public static void preOrderTraversal(Graph graph, int[] visited, int vertexIndex) {
        if (visited[vertexIndex] == 1) {
            return;
        }
        visited[vertexIndex] = 1;
        System.out.print(vertexIndex + "->");
        List<Integer> adjacentVertices = graph.getAdjacentVertices(vertexIndex);
        for (int i = 0; i < adjacentVertices.size(); i++) {
            preOrderTraversal(graph, visited, adjacentVertices.get(i));
        }
    }
}
