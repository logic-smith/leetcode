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
    private static final int MOD = 1_000_000_007;
    private long totalSum = 0, maxProduct = 1;

    public int maxProduct(TreeNode root) {
        totalSum = computeTotalSum(root);
        computeSubtreeSum(root);
        return (int) (maxProduct % MOD);
    }

    //first DFS - total sum of tree
    private long computeTotalSum(TreeNode node){
        if(node == null) return 0;
        long left = computeTotalSum(node.left);
        long right = computeTotalSum(node.right);
        return node.val + left + right;
    }

    //second dfs - subtree sum + best product
    private long computeSubtreeSum(TreeNode node){
        if(node == null) return 0;

        long left = computeSubtreeSum(node.left);
        long right = computeSubtreeSum(node.right);
        long subSum = node.val + left + right;

        long other = totalSum - subSum;
        long product = subSum * other;
        if(product > maxProduct){
            maxProduct = product;
        }
        return subSum;
    }
}