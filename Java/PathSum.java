
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if( root == null ){ return false; }
        if( sum==root.val && root.left==null && root.right==null ){ return true; }
        
        return hasPathSum( root.left , sum-root.val ) 
            || hasPathSum( root.right, sum-root.val );
    }
}




// http://www.jiuzhang.com/solutions/path-sum/
public class Solution {
    
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if( root == null ){ // empty
            return false; 
        }
        
        if( root.left == null && root.right == null ){ // if leaf node
            return sum == root.val; 
        }
        
        return hasPathSum( root.left, sum-root.val ) 
        	|| hasPathSum( root.right , sum-root.val );
    }
}