import java.util.Arrays;

public class PrimsAlgorithm
 {
    private static final int V = 5; 

    // Function to find the vertex with the minimum key value
    int minKey(int[] key, boolean[] mstSet)
    {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++)
         {
            if (!mstSet[v] && key[v] < min)
             {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Function to print the constructed MST
    void printMST(int[] parent, int[][] graph)
     {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    // Function to construct and print the MST using Prim's algorithm
    void primMST(int[][] graph)
    {
        int[] parent = new int[V]; // Array to store the constructed MST
        int[] key = new int[V]; // Key values used to pick minimum weight edge
        boolean[] mstSet = new boolean[V]; // To represent set of vertices included in MST

        // Initialize all keys as INFINITE
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0; // Make key 0 so that this vertex is picked as the first vertex
        parent[0] = -1; // First node is always the root of MST

        for (int count = 0; count < V - 1; count++)
        {
            int u = minKey(key, mstSet); // Pick the minimum key vertex
            mstSet[u] = true; // Add the picked vertex to the MST set

            for (int v = 0; v < V; v++)
            {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v])
                 {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph);
    }

    public static void main(String[] args)
     {
        PrimsAlgorithm t = new PrimsAlgorithm();
        int[][] graph =
         {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        t.primMST(graph);
    }
}