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
    TreeNode node = new TreeNode();
    public TreeNode increasingBST(TreeNode root) {
        TreeNode result = node;
        inOrder(root);
        return result.right;
    }
    public TreeNode inOrder(TreeNode root) {
        if(root == null) {
            return null;
        }
        inOrder(root.left);
        node.right = new TreeNode(root.val);
        node = node.right;
        inOrder(root.right);
        return node;
    }
}