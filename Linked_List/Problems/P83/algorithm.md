# Algorithm

If the list is empty or has just one element, there can't be duplicates. Return head.

    if ((head==null)||(head.next==null)) return head;

Take two nodes, current and nextNode. Current contains head and nextNode is initialized to null.

    Node current = head;
    Node nextNode = null;


Run a parent loop till current becomes null or points to null.

    while ((current!=null) && (current.next!=null))

___

Make nextNode point to current.next

    nextNode = current.next;

Run another loop that operates if the value of current is equal to nextNode, if yes, skip nextNode to the next value.

 Make sure you check if nextNode is not null **first** in which case you will be checking the value of something against null which will throw an error.

    while ((nextNode!=null)&&(current.data==nextNode.data)){
        nextNode = nextNode.next;
    }

Once out of the above child loop, nextNode will contain a value that is NOT equal to current. Thus, it is a non-duplicate value. Make current point to this node and increment current.

This way all duplicate values are skipped.

    current.next = nextNode;
    current = current.next;

___

Once out of the parent loop, the new list will only contain non-duplicate values. Return head.

    return head;