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
    int sum = 0;
    TreeNode node = new TreeNode();
    public TreeNode convertBST(TreeNode root) {
        reverseInOrder(root);
        return root;
    }
    public TreeNode reverseInOrder(TreeNode root) {
        if(root == null) {
            return null;
        }
        reverseInOrder(root.right);
        sum+=root.val;
        root.val = sum;
        reverseInOrder(root.left);
        return root;
    }
}