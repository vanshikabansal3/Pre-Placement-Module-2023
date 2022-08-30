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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> nodes=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        
        if(root==null)
            return res;
        
        nodes.offer(root);
        
        while(!nodes.isEmpty()){
             List<Integer> ls=new ArrayList<>();
            int len=nodes.size();
            for(int i=0;i<len;i++){
            if(nodes.peek().left!=null)  nodes.offer(nodes.peek().left);
            
            if(nodes.peek().right!=null) nodes.offer(nodes.peek().right);
                
            ls.add(nodes.poll().val);
            }
           res.add(ls);
        }
        
        return res;
    }
}
