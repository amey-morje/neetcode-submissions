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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i=0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        return makeTree(preorder, map, 0, inorder.length-1);
    }

    int idx=0;
    public TreeNode makeTree(int[] preorder, Map<Integer,Integer> map, int low, int high) {
        if(low > high) return null;
        TreeNode node = new TreeNode(preorder[idx]);
        idx++;
        int id = map.get(node.val);
        node.left = makeTree(preorder, map, low, id-1);
        node.right = makeTree(preorder, map, id+1, high);
        return node;
    }
}
