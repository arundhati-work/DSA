package Linked_List.Problems.P1290;
import Linked_List.LinkedList.Node;

public class solution {
    public Node reverseList(Node head){
        if ((head==null)||(head.next==null)) return head;
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public int getDecimalValue(Node head) {
        if (head==null) return 0;
        Node revList = reverseList(head);
        Node ptr = revList;
        int decNum = 0;
        int counter = 0;
        while(ptr!=null){
            decNum = decNum + (int)(ptr.data*Math.pow(2,counter));
            counter++;
            ptr=ptr.next;
        }
        return decNum;
    }
}
