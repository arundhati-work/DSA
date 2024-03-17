package Linked_List.Problems.P206;
import Linked_List.LinkedList.Node;

class Solution {
    public Node reverseList(Node head) {
        if (head==null || head.next==null){
            return head;
        }
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
        
    }
}
