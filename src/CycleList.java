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
          ListNode node=new ListNode(1);



      }
    public boolean hasCycle(ListNode head) {
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

