public class CircularQueue
 {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int size)
    {
        this.size = size;
        queueArray = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int value)
    {
        if ((rear + 1) % size == front)
        {
            System.out.println("Queue is full.");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queueArray[rear] = value;
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int value = queueArray[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return value;
    }

    public int peek() {
        if (front == -1) {
            System.out.println("Queue is empty. No peek value.");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        System.out.println("Peek: " + circularQueue.peek());
        System.out.println("Dequeue: " + circularQueue.dequeue());
        System.out.println("Peek after dequeue: " + circularQueue.peek());
    }
}