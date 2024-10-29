import java.util.*;
public class DirectedGraph2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enterr the number of vertices");
        int vertices = input.nextInt();

        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        System.out.println("enter the number of edges");
        int edges = input.nextInt();

        for (int i = 0; i < edges; i++) {
            System.out.println("enter the edge(format : startVertex endvertex)");
            int start = input.nextInt() -1;
            int end = input.nextInt() -1;
            adjacencyList.get(start).add(end);
          
            
        }
        System.out.println("The adjacency list for directed graph is:");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i+1 + " ");
        }
        System.out.println();
    }

    
}
