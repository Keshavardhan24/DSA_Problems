class Node
 {
    int data;
    Node next;

    public Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}
public class SinglyLinkedList 
 {
    private Node head;
    public void addFirst(int data) 
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void display() 
    {
        Node current = head;
        while (current != null) 
        {
            System.out.print(current.data + " -> ");
            current = current.next; 
        }
        System.out.println("null");
    }
    public static void main(String[] args)
     {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.display(); 
    }
}