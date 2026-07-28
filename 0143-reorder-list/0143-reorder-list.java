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
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        int size = 0;
        while(node != null) {
            stack.push(node);
            size++;
            node = node.next;
        }

        node = head;
        ListNode last = new ListNode();
        int i=0;
        while(i<size/2) {
            last = stack.pop();
            last.next = node.next;
            node.next = last;

            node = last.next;
            i++;
        }
        node.next = null;
    }
}