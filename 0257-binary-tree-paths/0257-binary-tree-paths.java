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
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) {
            return list;
        }
        dfs(root, String.valueOf(root.val));
        return list;
    }
    public void dfs(TreeNode node, String word) {
        if(node.left == null && node.right == null) {
            list.add(word);
        }
        if(node.left!=null) {
            dfs(node.left, word + "->" + node.left.val);
        }
        if(node.right!=null) {
            dfs(node.right, word + "->" + node.right.val);
        }
    }
}