package Problems.AddTwoNumbers;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    static String makeString(ListNode node){
        String str = "[";
        ListNode temp = node;
        while(temp.next != null){
            str += (temp.val + ",");
            temp = temp.next;
        }
        str += temp.val;
        str += "]";
        return str;
    }
}
