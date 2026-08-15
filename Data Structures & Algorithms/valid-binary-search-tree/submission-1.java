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
    TreeNode prev = null;
    boolean ans = true;
    public boolean isValidBST(TreeNode root) {
        TreeNode prev = null;
        ans = true;
        validateBST(root);
        return ans;
    }

    public void validateBST(TreeNode root){
        if(root == null)return;
        validateBST(root.left);
        if(prev== null){
            prev = root;
        } else {
            if(root.val <= prev.val){
                ans = false;
            }
            prev = root;
        }
        validateBST(root.right);
    }
}

//Better Solution
// class Solution {
//     private TreeNode prev = null;

//     public boolean isValidBST(TreeNode root) {
//         if (root == null) return true;

//         if (!isValidBST(root.left)) return false;

//         if (prev != null && root.val <= prev.val) return false;
//         prev = root;

//         return isValidBST(root.right);
//     }
// }
