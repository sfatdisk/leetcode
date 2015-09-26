public class Solution {
    public int removeDuplicates(int[] nums) {
        int length= nums.length;
        if( length< 2 ){ return length; }
        
        int left= 0;
        int right=1;
        while(right < length ){
            if( nums[left]== nums[right] ){ // duplicates
                right++;
            }else{
                left++;
                nums[left]= nums[right];
                right++; 
            }
        }
        return left+1; 
    }
}