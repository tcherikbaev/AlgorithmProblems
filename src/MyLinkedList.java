public class MyLinkedList<T> {
    public static class Node<T>
    {
        T val;
        Node<T> next;
        Node<T> prev;
        public Node(T val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    private Node<T> head;
    private Node<T> tail;
    private int size ;
    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }
    public void addAtHead(T val) {
        Node<T> current = new Node<T>(val);
        if (head == null) {
            head = current;
            tail = current;
        } else {
            current.next = head;
            head.prev = current;
            head = current;
        }
        size++;
    }
    public void addAtTail(T val) {
        Node<T> current = new Node<T>(val);
        if (head == null) {
            head = current;
            tail = current;
        } else {
            tail.next = current;
            current.prev = tail;
            tail = current;
        }
        size++;
    }



}
