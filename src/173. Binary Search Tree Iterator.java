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
class BSTIterator {
    private Stack<TreeNode> s = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
      PushAllLeft(root);  
    }
    
    public int next() {
      TreeNode currnode = s.pop();
      PushAllLeft(currnode.right);
      return currnode.val; 
    }
    
    public boolean hasNext() {
        return !s.isEmpty();
    }
    public void PushAllLeft(TreeNode root){
        for(TreeNode node = root; node != null; node = node.left){
            s.push(node);
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
