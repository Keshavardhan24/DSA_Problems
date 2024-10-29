import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeQueue
{
    private Deque<Integer> queue;

    public ArrayDequeQueue()
    {
        queue = new ArrayDeque<>();
    }

    public void enqueue(Integer element)
    {
        queue.addLast(element);
    }

    public Integer dequeue()
    {
        return queue.pollFirst();
    }

    public Integer peek()
    {
        return queue.peekFirst();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public int size()
    {
        return queue.size();
    }

    public static void main(String[] args)
    {
        ArrayDequeQueue queue = new ArrayDequeQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(5);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Is Empty? " + queue.isEmpty());
    }
}