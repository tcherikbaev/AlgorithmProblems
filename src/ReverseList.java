public class ReverseList {
    public static void main(String []strings)
    {
        System.out.println("Reverse one linked list");
    }
    public static class ListNode {
    int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode reverseList(ListNode head)
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
