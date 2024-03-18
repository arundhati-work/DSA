package Linked_List.Problems.P0160;
import Linked_List.LinkedList.Node;

public class solution {
    public Node getIntersectionNode(Node headA, Node headB) {
        Node ptrA = headA;
        Node ptrB = headB;

        while (ptrA!=ptrB){
            if (ptrA!=null){
                ptrA = ptrA.next;
            }
            else{
                ptrA = headB;
            }

            if (ptrB!=null){
                ptrB = ptrB.next;
            }
            else{
                ptrB = headA;
            }
        }

        return ptrA;
    }
}