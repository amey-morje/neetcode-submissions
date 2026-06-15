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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        maxLength(root, diameter);
        return diameter[0];
    }

    public int maxLength(TreeNode node, int[] maxI){
        if(node == null) return 0;

        int lMax = maxLength(node.left, maxI);
        int rMax = maxLength(node.right, maxI);
        maxI[0] = Math.max(maxI[0], lMax+rMax);
        return 1+ Math.max(lMax, rMax);
    }
}
