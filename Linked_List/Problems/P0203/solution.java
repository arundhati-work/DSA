package Linked_List.Problems.P0203;
import Linked_List.LinkedList.Node;

class solution {
    public Node removeElements(Node head, int val) {
        if (head==null) return head;

        while(head.data==val){
            head = head.next;
            if (head==null) return head;
        }

        if (head.next==null) return head;

        Node ptr = head.next;
        Node prev = head;

        while(ptr!=null){
            if (ptr.data==val){
                prev.next = ptr.next;
                ptr = ptr.next;
            }
            else{
                ptr = ptr.next;
                prev = prev.next;
            }
        }

        return head;
    }
}