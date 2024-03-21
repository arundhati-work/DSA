# Algorithm

Here, we work with just the one linked list so there's no extra space required. We find the mid-point of the list and reverse the list from the mid-point to the end. Then we compare the values of the start-mid of the list with the reversed mid-end part of the list. If the values match, the linked list is palindrome.

Time Complexity: O(n)  
Space Complexity: O(1)

First, we start by writing a function to reverse the linked list. For the algorithm, refer problem #206.

    public Node reverseList(Node head){
        if (head==null || head.next==null) return head;

        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

Now coming to the isPalindrom function.

If the list is empty or has only one element, it is automatically a palindrome. Return true.

    if ((head==null) || (head.next==null)) return true;

If the list has only two elements, there's no point of reversing the list. Just check if the two values are same and return the result.

    if (head.next.next==null){
        if (head.data==head.next.data) return true;
        else return false;
    }

Next, to find the mid-point of the list, we initialize two pointers slow and fast with head.

    Node slow = head;
    Node fast = head;

Increment slow pointer by 1 place and fast pointer by two places till the fast pointer reaches the end of the list.

When the fast pointer is at the end of the list, the slow pointer will be pointing at the mid-point of the list.

    while((fast.next!=null)&& (fast.next.next!=null)){
        slow = slow.next;
        fast = fast.next.next;
    }

Now we reverse the list starting from the slow pointer till the end. Here we can use the recursive function reverseList and store the pointer to the reversed list in revList.

    Node revList = reverseList(slow);

Once we have the reversed list, we need to check the values of the two lists (head->slow and slow->end) one by one. If the values match, it is a palindrome.

Here we initialize two temporary pointers i (points to head) and j (points to revList);

    Node i = head;
    Node j = revList;

Start a while loop with the condition that i and j are not null. If at any point the data at i and j don't match, return false as it's no longer a palindrome.

Increment both i and j.

    while((i!=null)&&(j!=null)){
        if (i.data!=j.data) return false;
        i=i.next;
        j=j.next;
    }

If we are out of the loop without returning false, it means the list is palindrome. Return true.

    return true;