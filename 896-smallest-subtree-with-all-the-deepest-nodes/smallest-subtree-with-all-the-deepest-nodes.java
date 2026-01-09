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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return helper(root).node;
    }

    private class Pair{
        TreeNode node;
        int depth;
        Pair(TreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }

    private Pair helper(TreeNode node){
        if(node == null){
            return new Pair(null, 0);
        }

        Pair left = helper(node.left);
        Pair right = helper(node.right);

        if(left.depth > right.depth){
            return new Pair(left.node, left.depth+1);
        }else if(right.depth > left.depth){
            return new Pair(right.node, right.depth+1);
        }else{
            return new Pair(node, left.depth+1);
        }
    }
}