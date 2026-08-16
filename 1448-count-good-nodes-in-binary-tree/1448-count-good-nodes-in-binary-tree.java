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
    int count = 1;
    public int goodNodes(TreeNode root) {
        countNodes(root.left, root.val);
        countNodes(root.right, root.val);
        return count;
    }
    public int countNodes(TreeNode root, int max) {
        if(root==null) {
            return count;
        }
        if(root.val >= max) {
            count++;
            max = root.val;
        }
        countNodes(root.left, max);
        countNodes(root.right, max);
        return count;
    }
}