public class CycleList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = createLinkedList(values);
        System.out.print("Original List: ");
        printLinkedList(head);

        // Check for cycle
        System.out.println("Has Cycle: " + hasCycle(head));

        // Remove elements with value 2
        head = removeElements(head, 2);
        System.out.print("List after removing elements with value 2: ");
        printLinkedList(head);

        // Remove middle node
        head = removeMiddleNode(head);
        System.out.print("List after removing middle node: ");
        printLinkedList(head);

        // Rotate right by 2
        head = rotateRight(head, 2);
        System.out.print("List after rotating right by 2: ");
        printLinkedList(head);

        // Delete node with value 3
        ListNode nodeToDelete = findNode(head, 3);
        if (nodeToDelete != null) {
            deleteNode(nodeToDelete);
            System.out.print("List after deleting node with value 3: ");
            printLinkedList(head);
        } else {
            System.out.println("Node with value 3 not found.");
        }
    }

    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static ListNode findNode(ListNode head, int val) {
        ListNode current = head;
        while (current != null && current.val != val) {
            current = current.next;
        }
        return current;
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return head;
    }

    public static ListNode removeMiddleNode(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = slow.next;
        } else {
            head = head.next;
        }
        return head;
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        current.next = head;
        int rotateIndex = k % length;
        for (int i = 0; i < length - rotateIndex - 1; i++) {
            head = head.next;
        }
        ListNode newNode = head.next;
        head.next = null;
        return newNode;
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
