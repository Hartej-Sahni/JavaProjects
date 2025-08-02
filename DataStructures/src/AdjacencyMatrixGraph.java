import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencyMatrixGraph implements Graph {
    private int[][] adjacencyMatrix;
    private int numVertices;
    private GraphType type;

    public AdjacencyMatrixGraph(int numVertices, GraphType type) {
        this.numVertices = numVertices;
        this.type = type;
        adjacencyMatrix = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public int numVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    @Override
    public void addEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0 || v1 >= numVertices || v2 >= numVertices) {
            throw new IllegalArgumentException("Not a valid vertex");
        }
        adjacencyMatrix[v1][v2] = 1;
        if (type == GraphType.UNDIRECTED) {
            adjacencyMatrix[v2][v1] = 1;
        }
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        if (v < 0 || v >= numVertices) {
            throw new IllegalArgumentException("Not a valid vertex");
        }
        ArrayList<Integer> adjacentVertices = new ArrayList<Integer>();
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[v][i] == 1) {
                adjacentVertices.add(i);
            }
        }
        Collections.sort(adjacentVertices);
        return adjacentVertices;
    }

    @Override
    public int getIndegree(int v) {
        int indegree = 0;
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[i][v] == 1) {
                indegree++;
            }
        }
        return indegree;
    }
}
