// left direction, left update right, how about right direction right update left
// https://leetcode.com/discuss/55573/straightforward-java-recursive-dfs-solution

public class Solution {
    
    public TreeNode invertTree(TreeNode root) {
        if( root == null ){ return root; }
        
        if( root.left == null && root.right== null ){
            return root; 
        }
        
        TreeNode right= root.right; 
        root.right = invertTree( root.left  );
        root.left  = invertTree( right );
        return root; 
    }
}

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root== null ){ return null; }
        
        TreeNode right = root.right ;
        root.right = invertTree( root.left); // move left
        root.left  = invertTree( right );   // move right
        
        return root;
        
    }
}