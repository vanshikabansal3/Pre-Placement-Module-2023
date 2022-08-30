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
    public int maxDepth(TreeNode root) {
         Queue<TreeNode> nodes=new LinkedList<>();
        int res=0;
        if(root==null)
            return res;
        
        nodes.offer(root);
        
        while(!nodes.isEmpty()){
            int len=nodes.size();
            for(int i=0;i<len;i++){
            if(nodes.peek().left!=null)  nodes.offer(nodes.peek().left);
            if(nodes.peek().right!=null) nodes.offer(nodes.peek().right);
            nodes.poll();
            }
           ++res;
        }
        
        return res;
    }
}
