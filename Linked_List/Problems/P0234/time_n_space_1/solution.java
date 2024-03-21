package Linked_List.Problems.P0234.time_n_space_1;
import Linked_List.LinkedList.Node;

class solution {

    public Node reverseList(Node head){
        if (head==null || head.next==null) return head;

        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    public boolean isPalindrome(Node head) {
        if ((head==null) || (head.next==null)) return true;
        if (head.next.next==null){
            if (head.data==head.next.data) return true;
            else return false;
        }

        Node slow = head;
        Node fast = head;

        while((fast.next!=null)&& (fast.next.next!=null)){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node revList = reverseList(slow);

        Node i = head;
        Node j = revList;

        while((i!=null)&&(j!=null)){
            if (i.data!=j.data) return false;
            i=i.next;
            j=j.next;
        }

        return true;
    }
}
