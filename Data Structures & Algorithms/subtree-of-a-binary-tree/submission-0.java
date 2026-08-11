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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root == null) return false;

        if(isValidSubTree(root, subRoot)){
            return true;
        }

        return (isSubtree(root.left, subRoot)) || (isSubtree(root.right, subRoot));
    }

    private boolean isValidSubTree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        if(root == null && subRoot != null) return false;
        if(root != null && subRoot == null) return false;

        if(subRoot.val != root.val) {
            return false;
        } else {
            return (isValidSubTree(root.right, subRoot.right) && isValidSubTree(root.left, subRoot.left));
        }
    }
}
