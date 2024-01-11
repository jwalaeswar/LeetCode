package Problems.AddTwoNumbers;

import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        int[] arr11 = {2,4,3};
        int[] arr12 = {5,6,4};
        int[] arr21 = {0};
        int[] arr22 = {0};
        int[] arr31 = {9,9,9,9,9,9,9};
        int[] arr32 = {9,9,9,9};
        System.out.printf("Input: l1 = %s, l2 = %s\n", Arrays.toString(arr11), Arrays.toString(arr12));
        System.out.printf("Input: l1 = %s, l2 = %s\n", Arrays.toString(arr21), Arrays.toString(arr22));
        System.out.printf("Input: l1 = %s, l2 = %s\n", Arrays.toString(arr31), Arrays.toString(arr32));
        System.out.println("Direct Method: ");
        ListNode n11 = makeNode(arr11);
        ListNode n12 = makeNode(arr12);
        ListNode node = SolutionA.addTwoNumbers(n11, n12);
        System.out.printf("%s\n",ListNode.makeString(node));

        node = SolutionA.addTwoNumbers(makeNode(arr21), makeNode(arr22));
        System.out.printf("%s\n",ListNode.makeString(node));

        node = SolutionA.addTwoNumbers(makeNode(arr31), makeNode(arr32));
        System.out.printf("%s\n",ListNode.makeString(node));

        System.out.println("Recursion Method: ");
        node = SolutionB.addTwoNumbers(makeNode(arr11), makeNode(arr12));
        System.out.printf("%s\n",ListNode.makeString(node));

        node = SolutionB.addTwoNumbers(makeNode(arr21), makeNode(arr22));
        System.out.printf("%s\n",ListNode.makeString(node));

        node = SolutionB.addTwoNumbers(makeNode(arr31), makeNode(arr32));
        System.out.printf("%s\n",ListNode.makeString(node));
    }
    private static ListNode makeNode(int[] arr){
        ListNode node = new ListNode(0);
        ListNode temp = node;
        for(int i : arr){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return node.next;
    }
}
