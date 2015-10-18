public class Solution {
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> paths =  new ArrayList<>();
       
       if( root== null){
           return paths; 
       }
       
       String path = root.val+"";
       buildBinaryTreePaths( paths, path, root );
       return paths;
    } 
       
      
    private void buildBinaryTreePaths( List<String>paths, String path, TreeNode root ){
         
           
        if( root.left==null && root.right==null ){ // leaf node
            paths.add(path); // 
            return;
        }
      
        if( root.left != null ){
            buildBinaryTreePaths( paths, path+"->"+root.left.val, root.left );
        }
        if( root.right != null ){
            buildBinaryTreePaths( paths, path+"->"+root.right.val , root.right );
        }
    }
    
}