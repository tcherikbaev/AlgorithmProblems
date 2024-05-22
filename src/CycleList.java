public class CycleList {
     static class ListNode {
     int val;
      ListNode next;
     ListNode(int x) {
          val = x;
             next = null;
          }
      }
      public static void main(String []strings)
      {
          ListNode head1;
          head1 = new ListNode(1);
          head1.next = new ListNode(2);
          head1.next.next = new ListNode(3);
          head1.next.next.next = new ListNode(4);
          head1.next.next.next.next = new ListNode(5);
          boolean hasCycle1 = hasCycle(head1);
          System.out.println("Linked list 1 has cycle: " + hasCycle1);


      }
    public static boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

    }

