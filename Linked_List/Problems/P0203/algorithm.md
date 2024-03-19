# Algorithm

First we check if the linked list is empty, we return the empty list.

    if (head==null) return head;

Next, we remove all the leading nodes of the linked list that match the value 'val'.
To remove the leading values, we simply move the head ahead till we stop finding nodes that match 'val'. If while removing leading matches, the list becomes empty, we return the empty list.

    while(head.data==val){
        head = head.next;
        if (head==null) return head;
    }

After removing the leading nodes, if we're left with a list with only one node that doesn't match the 'val', we return the list with the updated head.

    if (head.next==null) return head;

Now, we create two pointers, prev and ptr. The ptr pointer points to the current value and prev points to the prev value.

Initialize prev to head and ptr to head.next. Since we have already removed the leading matches, prev will not contain a match and hence we can start looking for a match from the second index in the list.

    Node ptr = head.next;
    Node prev = head;

Start a while loop that executes while ptr!=null.

    while(ptr!=null)

___

If the value of ptr matches val, make prev's next point to the value after the current ptr node, thus skipping the current node in ptr. Increment ptr to point to the next value.

    if (ptr.data==val){
        prev.next = ptr.next;
        ptr = ptr.next;
    }

Otherwise, knowing that ptr doesn't match val, increment both prev and ptr.

    else{
        ptr = ptr.next;
        prev = prev.next;
    }

___

At the end of the loop, the nodes matching val have been skipped. Return head.

    return head;