import java.util.ArrayList;
import java.util.List;
public class GraphTraversal {
    public static void main(String[] args) {
        int numVertices = 5+1;
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(new ArrayList<>());
        graph.add(List.of(2,3));
        graph.add(List.of(1,3,4));
        graph.add(List.of(1,2,4));
        graph.add(List.of(2,3,5));
        graph.add(List.of(4));

        boolean[] visited = new boolean[numVertices];
        traversal(numVertices,graph, visited);
    }
    public  static void traversal(int numVertices,List<List<Integer>> graph,boolean[] visited)

    {
        for (int i = 1; i < numVertices; i++) {
            if(!visited[i])
            {
                dfs(i,graph,visited);
            }
            
        }
    }
    public static void dfs(int vertex, List<List<Integer>> graph, boolean[] visited){
        System.out.println(vertex + " visited");
        visited[vertex] = true;
        for (int neighbour : graph.get(vertex))
        {
            if(!visited[neighbour])
            {
                dfs(neighbour ,graph,visited);
            }
        }
    }
    
}
