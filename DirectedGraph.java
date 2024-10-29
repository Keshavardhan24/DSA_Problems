import java.util.Scanner;

public class DirectedGraph
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = input.nextInt();

        // Initialize adjacency matrix
        int[][] adjacencyMatrix = new int[vertices][vertices];

        // Read number of edges
        System.out.print("Enter the number of edges: ");
        int edges = input.nextInt();

        // Read each edge and update the adjacency matrix
        for (int i = 0; i < edges; i++)
        {
            System.out.print("Enter the edge (format: startVertex endVertex): ");
            int start = input.nextInt();
            int end = input.nextInt();

            adjacencyMatrix[start][end]=1 ;
        }

        // Print the adjacency matrix
        System.out.println("The adjacency matrix for the directed graph is:");
        for (int i = 0; i < vertices; i++)
        {
            for (int j = 0; j < vertices; j++)
            {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
