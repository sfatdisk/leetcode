// way 2, this solution is very similer to Balanced Binary Tree
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if( root==null ){
            return true; 
        }
        return isMirro( root.left, root.right ) && isMirro( root.right, root.left );
    }
    
    private boolean isMirro( TreeNode t1, TreeNode t2 ){
        
        if( t1 == null && t2 == null ){
            return true ; 
        }
        
        if( t1 != null && t2 != null && t1.val == t2.val ){ // lead node
            return isMirro( t1.left, t2.right ) && isMirro( t1.right, t2.left );
        }
        return false; 
    }
}

// https://github.com/leetcoders/LeetCode-Java/blob/master/SymmetricTree.java
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){ return true; }
        return isMirror( root.left , root.right );
    }
    // create a method to left and right deeply at the same time
    private boolean isMirror(TreeNode t1, TreeNode t2 ){
        if( t1 == null && t2 == null ){
            return true; 
        }
        if( t1 == null && t2 != null || t1 != null && t2 == null || t1.val != t2.val  ){
            return false; 
        }
        return isMirror( t1.left, t2.right ) && isMirror( t1.right, t2.left );
    }
}
