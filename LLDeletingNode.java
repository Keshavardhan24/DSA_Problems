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
public class LLDeletingNode
 {
    private Node head; 
    public void insertAtEnd(int data) 
    {
        Node newNode = new Node(data);

        if (head == null) 
        {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null)
         {
            current = current.next;
        }

        current.next = newNode;
    }
    public void deleteNode(int key)
     {
        Node current = head, previous = null;
        if (current != null && current.data == key)
         {
            head = current.next; 
            return;
        }
        while (current != null && current.data != key)
         {
            previous = current;
            current = current.next;
        }
        if (current == null) return;
        previous.next = current.next;
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
        LLDeletingNode list = new LLDeletingNode();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        System.out.print("Original list: ");
        list.display(); 
        list.deleteNode(20);
        System.out.print("After deleting 20: ");
        list.display();
        list.deleteNode(10);
        System.out.print("After deleting 10: ");
        list.display(); 
    }
}