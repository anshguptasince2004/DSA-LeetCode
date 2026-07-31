/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) {
            return null;
        }
        Node node = head;
        Node copy = new Node(head.val);
        Node result = copy;
        HashMap<Node, Node> map = new HashMap<>();
        while(node != null) {
            map.put(node, copy);
            node = node.next;
            if(node == null) {
                copy.next = null;
            } else {
                copy.next = new Node(node.val);
            }
            copy = copy.next;
        }
        node = head;
        copy = result;
        while(copy!=null) {
            copy.next = map.get(node.next);
            copy.random = map.get(node.random);
            copy = copy.next;
            node = node.next;
        }
        return result;
    }
}