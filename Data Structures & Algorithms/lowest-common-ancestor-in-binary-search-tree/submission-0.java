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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(q.val > p.val){
            return lCA(root,p,q);
        } else {
            return lCA(root,q,p);
        }
    }
    
    private TreeNode lCA(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null ) return null;
        if(root.val > q.val){
            return lCA(root.left, p, q);
        } else if(root.val < p.val){
            return lCA(root.right,p,q);
        } else {
            return root;
        }
    }
}
