public class MergeSortLists 
{

    public ListNode mergeSort(ListNode L1, ListNode L2)
     {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (L1 != null && L2 != null)
         {
            if (L1.val < L2.val) 
            {
                current.next = L1;
                L1 = L1.next;
            } else {
                current.next = L2;
                L2 = L2.next;
            }
            current = current.next;
        }

        if (L1 != null) 
        {
            current.next = L1;
        } else {
            current.next = L2;
        }

        return dummy.next;
    }

    public ListNode createList(int[] values) 
    {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values)
         {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    public void printList(ListNode head) 
    {
        ListNode current = head;
        while (current != null) 
        {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
     {
        MergeSortLists sol = new MergeSortLists();
        int[] values1 = {3, 2, 5, 6};
        int[] values2 = {1, 7, 9, 10};
        ListNode L1 = sol.createList(values1);
        ListNode L2 = sol.createList(values2);
        ListNode mergedList = sol.mergeSort(L1, L2);
        sol.printList(mergedList);
    }
}

class ListNode
 {
    int val;
    ListNode next;

    ListNode(int val)
     {
        this.val = val;
    }

    ListNode()
     {
        this.val = 0;
    }
}