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
    List<Integer> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return buildtree(0, list.size()-1);
    }
    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public TreeNode buildtree(int left, int right) {
        if(left > right) {
            return null;
        }
        int mid = (right+left)/2;

        TreeNode root = new TreeNode(list.get(mid));
        root.left = buildtree(left, mid-1);
        root.right = buildtree(mid+1, right);
        return root;
    }
}