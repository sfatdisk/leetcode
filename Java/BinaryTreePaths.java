
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> rsts= new ArrayList<>();
        if(root== null){ return rsts; }
        
        String rst= ""+root.val ;
        buildBinaryTreePaths( root, rst , rsts );
        return rsts; 
    }
    private void buildBinaryTreePaths( TreeNode root, String rst , List<String> rsts ){
        
        if( root.left== null && root.right== null  ){ // leaf node
            rsts.add (rst);
            return;
        }
        
        if( root.left !=null ){
            buildBinaryTreePaths( root.left, rst+"->"+root.left.val , rsts );
        }
        if( root.right !=null ){
            buildBinaryTreePaths( root.right, rst+"->"+root.right.val, rsts );
        }
    }
}