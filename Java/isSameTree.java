// use recursive to traverse the tree !
public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p==null && q==null ){
            return true; 
        }
        
        if(p!=null && q!= null ){
            if(p.val == q.val ){  
                return isSameTree( p.left , q.left  ) && isSameTree( p.right, q.right );
            }
        }
        
        return false; 
    }
}
// way 1.2
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if( p == null && q == null ){
             return true;
        }
     
        if( p!=null && q!=null ){ 

            if(p.val == q.val ){
                return isSameTree( p.left, q.left ) && isSameTree( p.right, q.right );  
            }else{ 
                return false; 
            }
        }else{ 
            return false;
        }
    }
}
// way 1.3
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if( p == null && q == null ){
             return true;
        }
        if( p!=null && q!=null && p.val == q.val  ){ 
            return isSameTree( p.left, q.left ) && isSameTree( p.right, q.right );  
        }else{ 
            return false;
        }
    }
}
// way 1.4
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if( p == null && q == null ){
             return true;
        }
        if( p!=null && q!=null && p.val == q.val  ){ 
            return isSameTree( p.left, q.left ) && isSameTree( p.right, q.right );  
        }
        return false;
    }
}