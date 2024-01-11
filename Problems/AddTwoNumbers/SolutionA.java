package Problems.AddTwoNumbers;

public class SolutionA {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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