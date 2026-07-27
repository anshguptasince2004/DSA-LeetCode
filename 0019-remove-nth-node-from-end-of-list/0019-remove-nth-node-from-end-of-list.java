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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode node = head;
        while(node!=null) {
            node = node.next;
            size++;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        node = dummy;
        int count = 0;
        while(count<=size-n) {
            if(count == size-n) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
            count++;
        }
        return dummy.next;
    }
}