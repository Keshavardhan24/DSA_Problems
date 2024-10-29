
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class GraphTraversalAcyclica
{

    public static void main(String[] args)
    {
        int numVertices = 5+1; 
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numVertices; i++)
        {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(3); 
        graph.get(2).add(3); 
        graph.get(3).add(4); 
        graph.get(3).add(5); 
        graph.get(4).add(5); 
        graph.get(5).add(2); 

        boolean hasCycle = detectCycle(numVertices, graph);

        if (hasCycle)
        {
            System.out.println("The graph contains at least one cycle.");
        }
        else
        {
            System.out.println("The graph is acyclic.");
        }
    }

    public static boolean detectCycle(int numVertices, List<List<Integer>> adjList)
    {
        int[] inDegree = new int[numVertices];
        for (int v = 1; v < numVertices; v++)
        {
            for (int neighbor : adjList.get(v))
            {
                inDegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int v = 1; v < numVertices; v++)
        {
            if (inDegree[v] == 0)
            {
                queue.add(v);
            }
        }

        int count = 0; // Count of vertices processed
        while (!queue.isEmpty())
        {
            int vertex = queue.poll();
            count++;

            for (int neighbor : adjList.get(vertex))
            { // Iterate through the neighbors
                inDegree[neighbor]--; // Reduce the in-degree of neighbors
                if (inDegree[neighbor] == 0)
                { // If in-degree becomes 0, add to queue
                    queue.add(neighbor);
                }
            }
        }

        // If count of processed vertices is less than numVertices - 1, there's a cycle
        return count != numVertices - 1;
    }
}