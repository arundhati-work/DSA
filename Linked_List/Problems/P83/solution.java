package Linked_List.Problems.P83;
import Linked_List.LinkedList.Node;

public class solution {
    public Node deleteDuplicates(Node head) {
        if ((head==null)||(head.next==null)) return head;
        Node current = head;
        Node nextNode = null;
        while ((current!=null)&&(current.next!=null)){
            nextNode = current.next;
            while ((nextNode!=null)&&(current.data==nextNode.data)){
                nextNode = nextNode.next;
            }
            current.next = nextNode;
            current = current.next;
        }

        return head;
    }
}
