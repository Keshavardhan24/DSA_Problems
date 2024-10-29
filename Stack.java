import java.util.*;
class MyStack
{
    Deque<Integer> stack;

    public MyStack()
    {
        stack = new ArrayDeque<>();
    }
    public void push(int x)
    {
        stack.push(x);
    }

    public Integer pop()
    {
        return stack.pop();
    }

    public Integer peek()
    {
        return stack.peek();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Integer size()
    {
        return stack.size();
    }
}

public class Stack
{
    public static void main(String[] args)
    {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.size());
    }
}
