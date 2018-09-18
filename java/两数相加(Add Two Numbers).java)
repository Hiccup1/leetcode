/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode l3 = new ListNode(0);
        res.next = l3;
        int k = 0;
        while(l1 != null || l2 != null || k != 0) {
            l3.val = ((l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + k) % 10;
            k = ((l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + k) / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            if(l1 != null || l2 != null || k != 0) {
                l3.next = new ListNode(0);
                l3 = l3.next;
            }
        }
        return res.next;
    }
}
