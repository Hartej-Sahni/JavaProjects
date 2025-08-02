import java.util.ArrayList;
import java.util.List;

public class GraphListNode<Integer> {
    private int vertexId;
    private List<Integer> adjacentVertices;

    public GraphListNode(int vertexId) {
        this.vertexId = vertexId;
        adjacentVertices = new ArrayList<Integer>();
    }

    public List<Integer> getAdjacentVertices() {
        return adjacentVertices;
    }

    public int getVertexId() {
        return vertexId;
    }

    public void addEdge(Integer v) {
        adjacentVertices.add(v);
    }
}
