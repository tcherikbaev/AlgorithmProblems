public class MyLinkedList<T> {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();

        // Add elements at head
        myList.addAtHead(5);
        myList.addAtHead(10);
        myList.addAtHead(15);

        // Add elements at tail
        myList.addAtTail(20);
        myList.addAtTail(25);
        myList.addAtTail(30);

        // Print the elements of the list
        System.out.println("Elements of the list:");
        for (int i = 0; i < myList.size; i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        myList.addAtIndex(1, 7);
        myList.addAtIndex(4, 22);

        System.out.println("Elements of the list after addition:");
        for (int i = 0; i < myList.size; i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();


        myList.deleteAtIndex(1);
        myList.deleteAtIndex(3);
        System.out.println("Elements of the list after deletion:");
        for (int i = 0; i < myList.size; i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }
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

    public void deleteAtIndex(int index)
    {
        if (index < 0 || index >= size) {
            return; // Index out of bounds
        }
        Node<T> current = head;
        if (index==size-1) {
           tail=tail.prev;
           if(tail!=null)
           {
               tail.next=null;
           }
           else
           {
               head=null;
           }
        }
        else if(index==0)
        {
           current=current.next;
           if(current!=null)
           {
               current.prev=null;
           }
           else {
               tail=null;
           }
        }
        else
        {
            for(int i=0;i<index;i++)
            {
                current=current.next;
            }
            current.prev.next=current.next;
            current.next.prev=current.prev;

        }
        size--;
    }
    public void addAtIndex(int index, T val) {
        if (index < 0 || index > size) {
            return; // Index out of bounds
        }
        if (index == size) { // Add at tail
            addAtTail(val);
        } else if (index == 0) { // Add at head
            addAtHead(val);
        } else {
            Node<T> newNode = new Node<>(val);
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
            newNode.prev = current;
            size++;
        }
    }


}
