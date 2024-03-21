# Algorithm

We take the values of the nodes one by one and push it into an arraylist. Then we check if the arraylist is a palindrome.

Time Complexity: O(n)  
Space Complexity: O(n)

First, we check if the head is null, or the list contains only one item. In that case, it will be a palindrome, so we return true.

    if (head==null || head.next==null) return true;

Initialize an integer arraylist and a temporary pointer that points to head.

    ArrayList<Integer> list = new ArrayList<Integer>();
    Node ptr = head;

Push the values of the linked list nodes into the arraylist.

    while (ptr!=null){
        list.add(ptr.data);
        ptr = ptr.next;
    }

Initialize two index tracking pointers i and j. Pointer i starts at the beginning of the array list (0) and j starts at the end of the list.

    int i = 0;
    int j = list.size()-1;

Start a loop while i<=j.  

    while(i<=j)

___

If at any point list[i] is not equal to list[j], it means it's not a palindrome. Return false.

    if (list.get(i)!=list.get(j)) return false;

Increment pointer i and decrement j.

    i++;
    j--;

___

If you're out of the loop without returning false, your list is a palindrome. Return true.

    return true;
