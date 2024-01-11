package Problems.AddTwoNumbers;
public class SolutionB {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addUtil(l1, l2, 0);
    }

    public static ListNode addUtil(ListNode a, ListNode b, int carry){
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
            } else {
                if(newCarry > 0){
                    temp.next = new ListNode(newCarry);
                }
            }
        }
        return temp;
    }
}
