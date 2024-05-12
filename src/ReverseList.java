public class ReverseList {
    public static void main(String []strings)
    {
        // Create a linked list for testing
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print original list
        System.out.println("Original Singly Linked list:");
        printList(head);

        // Reverse the list
        head = reverseList(head);

        // Print reversed list
        System.out.println("\nReversed list:");
        printList(head);
    }

    private static void printList(ListNode head) {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.val+ " ");
            current=current.next;
        }
    }

    public static class ListNode {
    int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public static ListNode reverseList(ListNode head)
  {
      ListNode prev=null;
      ListNode current=head;
      while(current!=null)
      {
          ListNode nextNode= current.next;
          current.next=prev;
          prev=current;
          current=nextNode;
      }
      return prev;
  }
}
