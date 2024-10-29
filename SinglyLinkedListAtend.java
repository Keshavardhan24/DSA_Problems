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
public class SinglyLinkedListAtend
 {
    private Node head; // The first node of the linked list

    // Method to insert a new node at the end
    public void insertAtEnd(int data) 
    {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        
        // Step 2: If the list is empty, make newNode the head
        if (head == null) 
        {
            head = newNode;
            return;
        }

        // Step 3: Traverse to the last node
        Node current = head;
        while (current.next != null)
         {
            current = current.next;
        }

        // Step 4: Change the next of the last node to newNode
        current.next = newNode;
    }

    // Method to display the list
    public void display() 
    {
        Node current = head; // Start from the head node
        while (current != null)
         {
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null");
    }

    // Main method to test the insertAtEnd function
    public static void main(String[] args) 
    {
        SinglyLinkedListAtend list = new SinglyLinkedListAtend();

        // Insert nodes at the end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        // Display the list
        list.display(); // Output: 10 -> 20 -> 30 -> null
    }
}