# Algorithm

If list 1 is empty, return list 2 and vice versa.

    if (list1==null) return list2;
    if (list2 == null) return list1;


Take a dummy node (i.e., a dummy head) and a tail pointer to point to the dummy node. The dummy node would itself be empty but will point to the smallest node in list1 and list2. 

    Node dummy = new Node();
    Node tail = dummy;

Run a loop till either list1 or list2 or both are empty.

    while((list1!=null)&&(list2!=null))

___

If the current value in list1 is smaller, make the tail pointer point to it and increment list1 to move to the next element in the list.  
Similarly for list2.

    if (list1.data < list2.data){
        tail.next = list1;
        list1 = list1.next;
    }
    else{
        tail.next = list2;
        list2 = list2.next;
    }

Once a value has been inserted, into the new list, increment the tail node.

    tail = tail.next;

___

At this point, we're out of the loop, so either list1 or list2 or both are empty.

If one of them is empty, push the rest of the elements of the other list into the new list.

    if ((list1!=null) && (list2==null)){
        tail.next = list1;
    }

    else if ((list2!=null) && (list1==null)){
        tail.next = list2;
    }

The lists have now been merged. Since the dummy node is the head node but doesn't contain a value, return dummy.next.

    return dummy.next;