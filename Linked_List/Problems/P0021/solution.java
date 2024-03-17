package Linked_List.Problems.P0021;
import Linked_List.LinkedList.Node;

class Solution {
    public Node mergeTwoLists(Node list1, Node list2) {
        if (list1==null) return list2;
        if (list2 == null) return list1;
        Node dummy = new Node();
        Node tail = dummy;

        while((list1!=null)&&(list2!=null)){
            if (list1.data < list2.data){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if ((list1!=null) && (list2==null)){
            tail.next = list1;
        }

        else if ((list2!=null) && (list1==null)){
            tail.next = list2;
        }

        return dummy.next;
    }
}
