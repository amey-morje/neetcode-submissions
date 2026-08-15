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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        findRightSideNodes(root, list, 0);
        return list;
    }

    public void findRightSideNodes(TreeNode node, ArrayList list, int level){
        if(node == null) return;
        if(level == list.size()){
            list.add(node.val);
        }
        findRightSideNodes(node.right, list, level+1);
        findRightSideNodes(node.left, list, level+1);
    }
}
