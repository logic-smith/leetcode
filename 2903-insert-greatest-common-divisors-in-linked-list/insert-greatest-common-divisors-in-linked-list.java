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
    //function to find gcd using euclidean algorithm
    public static int findGcd(int x, int y){
        while(y != 0){
            int t = y;
            y = x % y;
            x = t;
        }
        return x;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr != null && curr.next != null){
            int gcd = findGcd(curr.val, curr.next.val);
            ListNode newNode = new ListNode(gcd, curr.next);
            curr.next = newNode;
            curr = newNode.next;
        }
        return head;
    }
}