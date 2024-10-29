

import java.util.*;

public class DijkstraAlgorithm
{
    static class Pair
    {
        int vertex;
        int weight;

        Pair(int vertex, int weight)
        {
            this.vertex = vertex;
            this.weight = weight;
        }

    }

    static int[] dijkstra(int V, List<List<Pair>> adj, int source)
    {
        int[] distances = new int[V];
        Arrays.fill(distances, Integer.MAX_VALUE);

        computeDistances(adj, source, distances);

        return distances;
    }

    static void computeDistances(List<List<Pair>> adj, int source, int[] distances)
    {
        PriorityQueue<Pair> queue = new PriorityQueue<>(Comparator.comparingInt(pair -> pair.weight));

        distances[source] = 0;
        queue.add(new Pair(source, 0));

        while (!queue.isEmpty())
        {
            Pair currentPair = queue.remove();

            int currentNode = currentPair.vertex;
            int currentWeight = currentPair.weight;

            for (Pair neighbor : adj.get(currentNode))
            {
                int neighborNode = neighbor.vertex;
                int neighborWeight = neighbor.weight;

                if (currentWeight + neighborWeight < distances[neighborNode])
                {
                    distances[neighborNode] = currentWeight + neighborWeight;
                    queue.add(new Pair(neighborNode, distances[neighborNode]));
                }
            }
        }
    }
    static void addEdge(List<List<Pair>> graph, int u, int v, int weight)
    {
        graph.get(u).add(new Pair(v, weight));
        graph.get(v).add(new Pair(u, weight));
    }

    public static void main(String[] args)
    {
        int numVertices = 6;
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < numVertices; i++)
        {
            graph.add(new ArrayList<>());
        }

        // Adding edges
        addEdge(graph, 0, 1, 4);
        addEdge(graph, 0, 2, 3);
        addEdge(graph, 0, 5, 6);
        addEdge(graph, 1, 2, 2);
        addEdge(graph, 2, 4, 4);
        addEdge(graph, 2, 3, 1);
        addEdge(graph, 3, 4, 1);
        addEdge(graph, 4, 5, 2);
        System.out.println(graph);
        int[] distances = dijkstra(numVertices, graph, 0);
        System.out.println(Arrays.toString(distances)); // Expected output: [0, 4, 3, 4, 8, 6]
    }
}