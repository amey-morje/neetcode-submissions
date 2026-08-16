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
    public int kthSmallest(TreeNode root, int k) {
        smallNumber(root, k); 
        return small;  
    }
    int i=0;
    int small=0;
    public void smallNumber(TreeNode root, int k) {
        if(root == null) return;
        smallNumber(root.left,k);
        i++;
        if(i == k) small=root.val;
        smallNumber(root.right,k);
    }
}
