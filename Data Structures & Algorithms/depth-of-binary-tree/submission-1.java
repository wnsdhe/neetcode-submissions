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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        return Math.max(recurse(root.right, count+1), recurse(root.left, count+1));
    }
    public int recurse(TreeNode node, int count) {
        if (node == null) {
            return count;
        }
        return Math.max(recurse(node.right, count+1), recurse(node.left, count+1));
    }
}
