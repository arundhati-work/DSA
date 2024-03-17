# Algorithm

We take two pointers:
* **slow pointer:** moves ahead one step at a time
* **fast pointer:** moves ahead two steps at a time

The idea is that, if we move through the list which *contains a cycle*, the slow and fast pointer *will overlap at some point*.

First check if the list is empty or has only one element. In this case, return false as there's no cycle.

    if ((head==null)||(head.next==null)) return false;

Initialize the slow and fast pointers to head.

    Node slow = head;
    Node fast = head;

Run a loop till fast pointer reaches the end or points to the end of the list.

    while((fast!=null)&&(fast.next!=null))

___

Increment slow pointer by one step and fast pointer by two steps.

    slow = slow.next;
    fast = fast.next.next;

If slow and fast pointers overlap, there's a cycle in the list. Return true and exit.

    if (slow==fast) return true;

___

Once we are out of the loop, it means the fast pointer reached the end of the loop, so there was no cycle. Hence, return false.

    return false;