
// http://www.jiuzhang.com/solutions/path-sum-ii/
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer> > results= new ArrayList<>();
        List<Integer> result= new ArrayList<>();
        if( root== null ){ return results; }
        
        buildPathSum(root, sum , results, result );
        return results; 
    }
    private void buildPathSum( TreeNode root, int sum , List<List<Integer> > results, List<Integer> result ){
        
        if(root == null){ 
            return ;
        }
        
        sum-=root.val; 
        if(root.left==null && root.right==null && sum==0 ){  // leaf node
            result.add( root.val );
            results.add( new ArrayList<Integer>(result) );
            result.remove( result.size()-1 );
            return;
        }
        // backtracking 
        result.add(root.val); 
        buildPathSum( root.left  , sum , results, result );
        buildPathSum( root.right , sum , results, result );
        result.remove( result.size()-1 );
    }
}


// Time Limit Exceeded 
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer> > results= new ArrayList<>();
        List<Integer> result= new ArrayList<>();
        if( root== null ){ return results; }
        
        buildPathSum(root, sum , results, result );
        return results; 
    }
    private void buildPathSum( TreeNode root, int sum , List<List<Integer> > results, List<Integer> result ){
        
        if(root == null){ // leaf node 
            return ;
        }
        result.add(root.val); 
        
        if(sum == root.val ){
            results.add( result );
        } 
        buildPathSum( root.left  , sum-root.val , results, result );
        buildPathSum( root.right , sum-root.val , results, result );
    }
}