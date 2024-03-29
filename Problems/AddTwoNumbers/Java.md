## Recursive Method:
- Add the first nodes and then create the new node with the remaining sum and update the new carry number.
- Now the next node would be the Linked list node of sum of both l1.next and l2.next and also new carry number.

```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addUtil(l1, l2, 0);
    }

    public ListNode addUtil(ListNode a, ListNode b, int carry){
        int sum = a.val + b.val + carry;
        int newCarry = sum / 10;
        ListNode temp = new ListNode(sum%10);
        if(a.next != null && b.next != null){
            temp.next = addUtil(a.next, b.next, newCarry);
        } else {
            if(a.next != null){
                temp.next = addUtil(a.next, new ListNode(0), newCarry);
            } else if (b.next != null){
                temp.next = addUtil(new ListNode(0), b.next, newCarry);
            } else {{
                if(newCarry > 0){
                    temp.next = new ListNode(newCarry);
                }
            }}
        }
        return temp;
    }
}
```
