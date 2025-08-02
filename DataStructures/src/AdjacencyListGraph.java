import java.util.ArrayList;
import java.util.List;

public class AdjacencyListGraph implements Graph {
    private List<GraphListNode<Integer>> vertices;
    private GraphType type;

    public AdjacencyListGraph() {
        vertices = new ArrayList<GraphListNode<Integer>>();
        type = GraphType.UNDIRECTED;
    }

    public AdjacencyListGraph(GraphType type) {
        vertices = new ArrayList<GraphListNode<Integer>>();
        this.type = type;
    }

    @Override
    public void addEdge(int v1, int v2) {
        GraphListNode vertex = findVertex(v1);
        if (vertex != null) {
            vertex.addEdge(v2);
        }
        if (type == GraphType.UNDIRECTED) {
            GraphListNode otherVertex = findVertex(v2);
            if (otherVertex != null) {
                otherVertex.addEdge(v1);
            }
        }
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        GraphListNode vertex = findVertex(v);
        if (vertex != null) {
            return vertex.getAdjacentVertices();
        }
        return null;
    }

    public void addVertex(int vertexId) {
        GraphListNode vertex = new GraphListNode(vertexId);
    }

    private GraphListNode findVertex(int vertexId) {
        for (int i = 0; i < vertices.size(); i++) {
            GraphListNode vertex = vertices.get(i);
            if (vertex.getVertexId() == vertexId) {
                return vertex;
            }
        }
        return null;
    }

    public int numVertices() {
        return vertices.size();
    }

    @Override
    public int getIndegree(int v) {
        int indegree = 0;
        for (int i = 0; i < vertices.size(); i++) {
            if (getAdjacentVertices(i).contains(v)) {
                indegree++;
            }
        }
        return indegree;
    }
}
