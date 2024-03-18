# Algorithm

Let's say we have the following linked lists that intersect at 8:

    listA = [4, 2, *8*, 3, 5]
    listB = [9, 6, 1, *8*, 11, 15]

Let's take the lengths of each list:

    lenA = 5
    lenB = 6

The total length of two lists = 5 + 6 = 11

The idea is that we traverse each list separately, one item at a time. As soon as the pointer of a list reaches NULL, we make it point to the head of the other list. So the pointer of each list, moves a maximum of 11 times in this case.

If the lists do not intersect, during the second pass, both pointers will reach the NULL value at the same time, at which point we know they don't intersect and thus return null.

If they do intersect, since each pointer moves at max 11 times, there will come a point during the first or second pass when both pointers reach the intersection point at the same time. Hence, we come to know the intersection point and return it.

**Note :** If an intersection point is present, each pointer moves exactly (lenA + lenB - 1) times to find the intersection point. Because the number of moves to find the intersection point is the same for both pointers, they both land on the intersection point at the same time.

Take two pointers, ptrA and ptrB to point to headA and headB respectively.

    Node ptrA = headA;
    Node ptrB = headB;

Start a loop with the condition that it only stops when ptrA and ptrB are equal.

    while (ptrA != ptrB)

If the loops intersect, they will land on the intersecting node together at some point during the first or second pass.

If they don't intersect, they will land on NULL at the same time, and thus exit the loop.

____

if ptrA doesn't point to NULL, increment ptrA. If it does point to NULL, make it point to headB. Vice versa for ptrB.

    if (ptrA!=null){
        ptrA = ptrA.next;
    }
    else{
        ptrA = headB;
    }

    if (ptrB!=null){
        ptrB = ptrB.next;
    }
    else{
        ptrB = headA;
    }

____

Once we are out of the loop, ptrA and ptrB will either hold the intersecting node or NULL indicating that the two lists do not intersect. Return ptrA.

    return ptrA;

## Dry Run

Let's say the two lists are as follows and they intersect at point **8**.

    listA = [4, 2, *8*, 3, 5]
    listB = [9, 6, 1, *8*, 11, 15]

Initialize ptrA to headA ie, 4 and ptrB to headB ie, 9

    ptrA = headA = 4
    ptrB = headB = 9

**Run 1:** ptrA = 2 ; ptrB = 6  
**Run 2:** ptrA = 8 ; ptrB = 1  
**Run 3:** ptrA = 3 ; ptrB = 8  
**Run 4:** ptrA = 5 ; ptrB = 11  
**Run 5:** ptrA = NULL ; ptrB = 15  
**Run 6:** ptrA = 9 (points to headB) ; ptrB = NULL  
**Run 7:** ptrA = 6 ; ptrB = 4 (points to headA)  
**Run 8:** ptrA = 1 ; ptrB = 2  
**Run 9:** ptrA = 8 ; ptrB = 8  


    ptrA = ptrB => intersection point = **8**

___

Let's take an example where the two lists do not intersect.

    listA = [1, 2, 3, 4, 5]
    listB = [6, 7, 8, 9]

Initialize ptrA to headA ie, 4 and ptrB to headB ie, 9

    ptrA = headA = 1
    ptrB = headB = 6

**Run 1:** ptrA = 2 ; ptrB = 7  
**Run 2:** ptrA = 3 ; ptrB = 8  
**Run 3:** ptrA = 4 ; ptrB = 9  
**Run 4:** ptrA = 5 ; ptrB = NULL  
**Run 5:** ptrA = NULL ; ptrB = 1 (points to headA)  
**Run 6:** ptrA = 6 (points to headB) ; ptrB = 2  
**Run 7:** ptrA = 7 ; ptrB = 3   
**Run 8:** ptrA = 8 ; ptrB = 4  
**Run 9:** ptrA = 9 ; ptrB = 5  
**Run 10:** ptrA = NULL ; ptrB = NULL  

    ptrA = ptrB = NULL => No intersection point

___