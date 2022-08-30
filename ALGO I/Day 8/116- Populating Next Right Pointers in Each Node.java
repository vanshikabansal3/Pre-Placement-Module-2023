/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    
    public Node connect(Node root) {
        if(root==null) return null;
        
        Queue<Node> nodes=new LinkedList<>();
        nodes.offer(root);
        
        while(!nodes.isEmpty()){
            int len=nodes.size();
            for(int i=0;i<len;i++){
                Node node=nodes.poll();
                if(nodes.peek()==null || i==len-1)
                    node.next=null;
                else
                    node.next=nodes.peek();
                
                if(node.left!=null) nodes.offer(node.left);
                if(node.right!=null) nodes.offer(node.right);
            }
        }
        
        return root;
    }
}
