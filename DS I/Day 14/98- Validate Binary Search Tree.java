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
    public boolean isValidBST(TreeNode root) {
        if(root==null) return false;
        
        int arr[]={-103};
        return inorder(root,arr);
    }
    
    public boolean inorder(TreeNode node, int[] c){
        if(node==null) return true;
        
        if(!inorder(node.left,c)) return false;
        if(c[0]==-103) c[0]=node.val;
        
        else if(c[0]>=node.val) return false;
        
        else c[0]=node.val;
            
        if(!inorder(node.right,c)) return false;
        
        return true;
    }
}
