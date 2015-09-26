public class Solution {
    // assume no duplicates in the array and array length != 0

    public int searchInsert(int[] nums, int target) {
        
        int small=0;
        int large= nums.length-1;
        
        while( small <= large ){
            
            int mid= small + ( large-small)/2 ;
            
            if( target == nums[mid] ){ return mid; }
            
            if( target < nums[ mid ] ){
                large = mid-1; // large become small
            }else{
                small = mid+1; // small become large 
            }
        }
        //当循环结束时，如果没有找到target，那么low一定停target应该插入的位置上，high一定停在恰好比target小的index上。
        return small; 
        
    }
}