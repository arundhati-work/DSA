package Linked_List.Problems.P876;

import Linked_List.LinkedList.Node;

class Solution {
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
}