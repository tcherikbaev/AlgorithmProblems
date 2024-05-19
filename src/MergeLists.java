class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to serve as the start of the merged list
        ListNode dummy = new ListNode(0);
        // Pointer to the current node in the new list
        ListNode current = dummy;

        // While both lists are not empty
        while (list1 != null && list2 != null) {
            // Compare the current nodes of both lists
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            // Move the pointer to the next node in the new list
            current = current.next;
        }

        // If there are remaining nodes in either list, append them
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        // The merged list starts at dummy.next
        return dummy.next;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeLists solution = new MergeLists();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
