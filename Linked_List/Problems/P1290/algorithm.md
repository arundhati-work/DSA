# Algorithm

The way to convert a binary number to decimal is as follows:

    |  1  |   |  0  |   |  1  |   |  0  |   |  1  |
    |  *  | + |  *  | + |  *  | + |  *  | + |  *  |
    |(2^4)|   |(2^3)|   |(2^2)|   |(2^1)|   |(2^0)|


The linked list starts from the value at the maximum place value. We can either find the total number of nodes in the linked list to calculate the power of two for the first binary digit, or we can reverse the binary list, start the exponent of 2 from 0 and make our way up.

Taking the latter approach, we first reverse the linked list. For the algorithm to reverse a linked list, refer problem #206.

    public Node reverseList(Node head){
        if ((head==null)||(head.next==null)) return head;
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

Now within our getDecimalValue method, we first check if the value of head is null, we return the decimal equivalent to be zero.

    if (head==null) return 0;

Next we call the reverseList method and store the reversed list in the revList variable.

    Node revList = reverseList(head);

Next we initialize a temporary pointer ptr to point to the head of revList, a variable decNum to store the decimal value and a counter variable to keep track of the exponent for 2. The counter starts at 0.

    Node ptr = revList;
    int decNum = 0;
    int counter = 0;

Next we use a loop with the condition ptr!=null

    while(ptr!=null)

___

To calculate the decimal value, we multiple (2^counter) to the data at current ptr, then add it to the pre-existing value of decNum.

Math.pow returns a double value, so be sure to convert the result to int before adding it to decNum.

    decNum = decNum + (int)(ptr.data*Math.pow(2,counter));

Next, we increment counter and the temporary pointer ptr.

    counter++;
    ptr=ptr.next;

___

Once out of the loop, we have the decimal equivalent stored in decNum. Return decNum.

    return decNum;

