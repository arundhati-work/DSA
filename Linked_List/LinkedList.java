package Linked_List;

public class LinkedList {
    Node head;
    int currentSize;

    public class Node {
        int data;
        public Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

        Node() {
        }

        Node(int val, Node next) {
            this.data = val;
            this.next = next;
        }
    }

    public LinkedList() {
        head = null;
        currentSize = 0;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        currentSize++;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            currentSize++;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        currentSize++;
        return;
    }

    public Node removeFirst() {
        if (head == null) {
            return null;
        }

        Node temp = head;
        head = head.next;
        currentSize--;
        return temp;
    }

    public Node removeLast() {
        if (head == null) {
            return null;
        }

        if (head.next == null)
            return removeFirst();

        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        currentSize--;
        return current;
    }
}