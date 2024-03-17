package Linked_List.Problems.P0141;
import Linked_List.LinkedList.Node;

public class solution {
    public boolean hasCycle(Node head) {

        if ((head==null)||(head.next==null)) return false;
        Node slow = head;
        Node fast = head;

        while((fast!=null)&&(fast.next!=null)){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast) return true;
        }

        return false;
    }
}
