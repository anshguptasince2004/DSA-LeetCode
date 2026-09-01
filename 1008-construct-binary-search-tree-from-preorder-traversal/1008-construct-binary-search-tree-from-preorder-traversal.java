/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int index;
    public TreeNode bstFromPreorder(int[] preorder) {
        return preOrder(preorder, Integer.MAX_VALUE);
    }
    public TreeNode preOrder(int[] preorder, int highest) {
        if(index == preorder.length || preorder[index] > highest) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[index++]);
        node.left = preOrder(preorder, node.val);
        node.right = preOrder(preorder, highest);
        return node;
    }
}