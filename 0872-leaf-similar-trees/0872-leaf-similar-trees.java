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
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(tree1(root1).equals(tree2(root2))) {
            return true;
        }
        return false;
    }
    public ArrayList<Integer> tree1(TreeNode root) {
        if(root==null) {
            return list1;
        }
        if(root.left == null && root.right == null) {
            list1.add(root.val);
        }
        tree1(root.left);
        tree1(root.right);
        return list1;
    }
    public ArrayList<Integer> tree2(TreeNode root) {
        if(root==null) {
            return list2;
        }
        if(root.left == null && root.right == null) {
            list2.add(root.val);
        }
        tree2(root.left);
        tree2(root.right);
        return list2;
    }
}