# Algorithm

If head is null or head.next is null, return head. This statement acts as the edge case and also returns the last element of the linked list in the recursive call, up next.

    if (head==null || head.next==null) {
        return head;
    }

Set a node newHead to the last element of the linkedList by recursively calling the reverseList function and pushing head.next as the new head. The previous if statement will return the last element.

    newHead = reverseList(head.next)

Next we need to reverse the pointer between head and head.next. If the current state is 3 -> 4 -> null

    head.next.next = head; // 4.next = 3
    head.next = null; // 3.next = null
    
*Thus, the list becomes 4 -> 3 -> null*

Since newHead will now be set to the last element return newHead.

    return newHead;

## Dry Run

Let's take the following linked list as an example:

    1 -> 2 -> 3 -> 4 -> null

**Step 1:** reverseList (1)  

    head = 1
    head.next = 2  
    newHead = reverseList(2)  
**Step 2:** reverseList (2)

    head = 2
    head.next = 3
    newHead = reverseList(3)
**Step 3:** reverseList (3)

    head = 3
    head.next = 4
    newHead = reverseList(4)
**Step 4:** reverseList (4)

    head = 4
    head.next = null
Once head.next is null, the recursive call trails back to the previous call i.e., reverseList (3). At this point, newHead is set to the last element i.e., 4.

***newHead = 4***

**Step 5:** reverseList (3)

    head = 3
    newHead = 4
    head.next = 4

    head.next.next = head => 4.next = 3
    head.next = null => 3.next = null

***4 (newHead) -> 3 -> null***

**Step 6:** reverseList (2)

    head = 2
    newHead = 4
    head.next = 3

    head.next.next = head => 3.next = 2
    head.next = null => 2.next = null

***4 -> 3 -> 2 -> null***

**Step 7:** reverseList(1)

    head = 1
    newHead = 4
    head.next = 2

    head.next.next = head => 2.next = 1
    head.next = null => 1.next = null

***4 -> 3 -> 2 -> 1 -> null***

**Step 8:** Return newHead = 4