import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencySetGraph implements Graph {
    private List<GraphSetNode> vertices;
    private GraphType type;

    public AdjacencySetGraph() {
        vertices = new ArrayList<GraphSetNode>();
        type = GraphType.UNDIRECTED;
    }

    public AdjacencySetGraph(GraphType type) {
        vertices = new ArrayList<GraphSetNode>();
        this.type = type;
    }

    public void addVertex(int v) {
        vertices.add(new GraphSetNode(v));
    }

    @Override
    public void addEdge(int v1, int v2) {
        GraphSetNode vertex = findVertex(v1);
        if (vertex != null) {
            vertex.addEdge(v2);
        }
        if (type == GraphType.UNDIRECTED) {
            GraphSetNode otherVertex = findVertex(v2);
            if (otherVertex != null) {
                otherVertex.addEdge(v1);
            }
        }
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        GraphSetNode vertex = findVertex(v);
        if (vertex != null) {
            List<Integer> adjacentVertices = new ArrayList<Integer>(vertex.getAdjacencySet());
            Collections.sort(adjacentVertices);
            return adjacentVertices;
        }
        return null;
    }

    private GraphSetNode findVertex(int vertexId) {
        for (int i = 0; i < vertices.size(); i++) {
            GraphSetNode vertex = vertices.get(i);
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
