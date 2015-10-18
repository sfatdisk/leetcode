http://www.jiuzhang.com/solutions/balanced-binary-tree/

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1; 
    }
    
    private int maxDepth(TreeNode root){
        if(root == null ){ // leaf return left/right height
            return 0;
        }

        int left = maxDepth( root.left );
        int right = maxDepth( root.right );

        if(  left == -1 || right == -1 || Math.abs(left - right) > 1 ){ // defination of the height-balanced binary tree
            return -1; // 因为 一个node, 可能他的child是不平衡的, 但是他是平衡的 => if I skip left==-1 || right == -1 !!
        }
        return Math.max( left, right ) + 1 ; // because accept the difference is 1 
    }
}