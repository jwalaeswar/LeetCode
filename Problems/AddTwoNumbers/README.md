# 2. Add Two Numbers

You are given two **non-empty** linked lists representing two non-negative integers. The digits are stored in **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

**Example 1:**

<img alt="" src="https://assets.leetcode.com/uploads/2020/10/02/addtwonumber1.jpg" style="width: 483px; height: 342px;">
<pre><strong>Input:</strong> l1 = [2,4,3], l2 = [5,6,4]
<strong>Output:</strong> [7,0,8]
<strong>Explanation:</strong> 342 + 465 = 807.
</pre>

**Example 2:**

<pre><strong>Input:</strong> l1 = [0], l2 = [0]
<strong>Output:</strong> [0]
</pre>

**Example 3:**

<pre><strong>Input:</strong> l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
<strong>Output:</strong> [8,9,9,9,0,0,0,1]
</pre>

**Constraints:**
- The number of nodes in each linked list is in the range `[1, 100]`.
- `0 <= Node.val <= 9`
- It is guaranteed that the list represents a number that does not have leading zeros.

# Solution and Explanation
## Direct Method:
- Create a new return node with head as 0 and initiate carry as 0.
- Add the first nodes and carry append the new node to the return node.
- Keep on adding the respective nodes from l1 & l2 and carry and then append them to the return node.
- If carry is non-zero at last then add the new node with value as carry.
```
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1 != null){
            int sum = l1.val + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            l1=l1.next;
        }
        while(l2 != null){
            int sum = l2.val + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            l2=l2.next;
        }
        if(carry != 0){
            temp.next = new ListNode(carry);
        }
        return ans.next;
    }
}
```
## Recursive Method:
- Add the first nodes and then create the new node with the remaining sum and update the new carry number.
- Now the next node would be the Linked list node of sum of both l1.next and l2.next and also new carry number.

```
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
