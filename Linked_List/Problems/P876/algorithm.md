# Algorithm

Take a slow pointer and a fast pointer.

    ListNode slow = head  
    ListNode fast = head

Slow pointer moves ahead 1 step at a time. Fast pointer moves ahead 2 steps at a time.

    slow = slow.next  
    fast = fast.next.next


When the fast pointer either hits null or the items next to fast pointer is null, the slow pointer will point to the middle of the linked list.

    while(fast!=null && fast.next!=null)

Return the slow pointer.

    return slow