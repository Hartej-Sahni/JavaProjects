import java.util.HashSet;
import java.util.Set;

public class GraphSetNode<Integer> {
    private int vertexId;
    private Set<Integer> adjacencySet;

    public GraphSetNode(int vertexId) {
        this.vertexId = vertexId;
        adjacencySet = new HashSet<Integer>();
    }

    public int getVertexId() {
        return vertexId;
    }

    public void setVertexId(int vertexId) {
        this.vertexId = vertexId;
    }

    public Set<Integer> getAdjacencySet() {
        return adjacencySet;
    }

    public void addEdge(Integer v) {
        adjacencySet.add(v);
    }
}
