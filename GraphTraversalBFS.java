import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphTraversalBFS {
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
        bfs(numVertices,graph, visited);
    
}

public static void bfs(int numVertices, List<List<Integer>> graph,boolean[] visited)
{
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <  numVertices ; i++) {
        if(!visited[i])
        {
            visited[i]  = true;
            queue.add(i);

            while (!queue.isEmpty())
            {
                int currentVertex = queue.poll();
                System.out.println(currentVertex + " visted");
                for (int neightbour : graph.get(currentVertex)) {
                    if(!visited[i])
        {
            visited[i]  = true;
            queue.add(neightbour);

                    
                }
            }
        }

        
    }


}

}
}