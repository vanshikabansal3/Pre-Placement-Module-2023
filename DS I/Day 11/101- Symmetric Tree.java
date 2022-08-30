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
 
 The approach is to keep traversing over the nodes and checking the left's right and right's left node's values
 if they are unequal at any point of time then return false
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        if(root.left==null && root.right==null ) return true;
        
        if(root.left==null || root.right==null) return false;
        if(root.left.val!=root.right.val) return false;
        
        return checkSymmetry(root.left, root.right);
    }
   public boolean checkSymmetry(TreeNode left, TreeNode right){ 
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;        
        
        if(left.val!=right.val) return false;
        
        return checkSymmetry(left.left,right.right) && checkSymmetry(left.right,right.left);
    }
}
