import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopologicalSort {
    public static List<Integer> sort(Graph graph) throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        Map<Integer, Integer> indegreeMap = new HashMap<>();
        for (int i = 0; i < graph.numVertices(); i++) {
            int indegree = graph.getIndegree(i);
            indegreeMap.put(i, indegree);
            if (indegree == 0) {
                queue.enqueue(i);
            }
        }

        List<Integer> sortedList = new ArrayList<Integer>();
        while (!queue.isEmpty()) {
            int vertex = queue.dequeue();
            sortedList.add(vertex);
            List<Integer> adjacentVertices = graph.getAdjacentVertices(vertex);
            for (int i = 0; i < adjacentVertices.size(); i++) {
                int indegree = indegreeMap.get(adjacentVertices.get(i));
                int updatedIndegree = indegree - 1;
                indegreeMap.put(adjacentVertices.get(i), updatedIndegree);
                if (updatedIndegree == 0) {
                    queue.enqueue(adjacentVertices.get(i));
                }
            }
        }

        if (sortedList.size() != graph.numVertices()) {
            throw new Exception("Graph is cyclic");
        }
        return sortedList;
    }
}
