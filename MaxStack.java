import java.util.ArrayDeque;
import java.util.Deque;

public class MaxStack
{
    private Deque<Integer> stack;
    private Deque<Integer> maxStack;

    public MaxStack()
    {
        stack = new ArrayDeque<>();
        maxStack = new ArrayDeque<>();
    }

    public void push(int x)
    {
        stack.push(x);
        if (maxStack.isEmpty() || x >= maxStack.peek())
        {
            maxStack.push(x);
        }
    }

    public int pop()
    {
        int poppedValue = stack.pop();
        if (poppedValue == maxStack.peek())
        {
            maxStack.pop();
        }
        return poppedValue;
    }

    public int top()
    {
        return stack.peek();
    }

    public int getMax()
    {
        return maxStack.peek();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        MaxStack maxStack = new MaxStack();

        maxStack.push(10);
        maxStack.push(20);
        maxStack.push(30);
        System.out.println("Max element: " + maxStack.getMax()); // 30

        System.out.println("Top element: " + maxStack.top()); // 30
        System.out.println("Popped element: " + maxStack.pop()); // 30
        System.out.println("Max element: " + maxStack.getMax()); // 20

        maxStack.push(5);
        maxStack.push(25);
        System.out.println("Max element: " + maxStack.getMax()); // 25
    }
}