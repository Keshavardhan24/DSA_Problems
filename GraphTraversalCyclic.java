
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class GraphTraversalCyclic
{

    public static void main(String[] args)
    {
        int numVertices = 5+1; 
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(new ArrayList<>()); 
        graph.add(List.of(2)); 
        graph.add(List.of(3,4)); 
        graph.add(new ArrayList<>()); 
        graph.add(new ArrayList<>()); 
        graph.add(List.of(4)); 

        List<Integer> topoSort = topologicalSortBFS(numVertices, graph);

        System.out.println("Topological Sort (BFS): ");
        for (int vertex : topoSort)
        {
            System.out.print(vertex + " ");
        }

    }

    public static List<Integer> topologicalSortBFS(int numVertices, List<List<Integer>> graph)
    {
        int[] inDegree = new int[numVertices];
        for (int i = 1; i < numVertices; i++)
        {
            for (int neighbor : graph.get(i))
            {
                inDegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> topoSort = new ArrayList<>();
        for (int i = 1; i < numVertices; i++)
        {
            if (inDegree[i] == 0)
            {
                queue.add(i);
            }
        }

        while (!queue.isEmpty())
        {
            int vertex = queue.poll();
            topoSort.add(vertex);

            for (int neighbor : graph.get(vertex))
            {
                inDegree[neighbor]--; 
                if (inDegree[neighbor] == 0)
                { 
                    queue.add(neighbor);
                }
            }
        }

        return topoSort;
    }
}