import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack
{
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack()
    {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int x)
    {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek())
        {
            minStack.push(x);
        }
    }

    public int pop()
    {
        int poppedValue = stack.pop();
        if (poppedValue == minStack.peek())
        {
            minStack.pop();
        }
        return poppedValue;
    }

    public int top()
    {
        return stack.peek();
    }

    public int getMin()
    {
        return minStack.peek();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        MinStack minStack = new MinStack();

        minStack.push(10);
        minStack.push(20);
        minStack.push(30);
        System.out.println("Min element: " + minStack.getMin()); // 10

        System.out.println("Top element: " + minStack.top()); // 30
        System.out.println("Popped element: " + minStack.pop()); // 30
        System.out.println("Min element: " + minStack.getMin()); // 10

        minStack.push(5);
        minStack.push(25);
        System.out.println("Min element: " + minStack.getMin()); // 5

        System.out.println("Popped element: " + minStack.pop()); // 25
        System.out.println("Min element: " + minStack.getMin()); // 5

        System.out.println("Popped element: " + minStack.pop()); // 5
        System.out.println("Min element: " + minStack.getMin()); // 10
    }
}