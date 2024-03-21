package Linked_List.Problems.P0234.time_n_space_n;
import Linked_List.LinkedList.Node;
import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(Node head) {
        if (head==null || head.next==null) return true;

        ArrayList<Integer> list = new ArrayList<Integer>();
        Node ptr = head;
        while (ptr!=null){
            list.add(ptr.data);
            ptr = ptr.next;
        }
        int i = 0;
        int j = list.size()-1;
        while(i<=j){
            if (list.get(i)!=list.get(j)) return false;
            i++;
            j--;
        }
        return true;
        
    }
}