// https://leetcode.com/problems/binary-tree-right-side-view/
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> results= new ArrayList<>();
        if( root == null ){ return results; } 
        HashMap<Integer, Integer > depthToValue= new HashMap<>(); 
        
        findRightSideView(root, depthToValue, 1  );
        int depth= 1;
        while( depthToValue.containsKey(depth) ){
            results.add( depthToValue.get(depth) );
            depth++;
        }
        return results; 
    }
    private void findRightSideView( TreeNode root ,HashMap<Integer, Integer > depthToValue, int depth  ){
        if(root== null ){ return; }
        
        depthToValue.put(depth, root.val );
        findRightSideView( root.left,  depthToValue, depth+1 );
        findRightSideView( root.right, depthToValue, depth+1 );
    }
}