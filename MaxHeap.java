import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(25);
        maxHeap.add(15);
        maxHeap.add(20);
        maxHeap.add(17);
        System.out.println("Max value: " + maxHeap.peek());
        System.out.println("Extracting max value: " + maxHeap.poll());
        System.out.println("Max value after extraction: " + maxHeap.peek());
    }
}
