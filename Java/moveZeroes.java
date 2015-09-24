// http://www.geeksforgeeks.org/move-zeroes-end-array/
public class Solution {
    public void moveZeroes(int[] nums) {
        int length= nums.length ; 
        int count= 0; 
        for(int i=0 ; i< length ; ++i ){
            if( nums[i] !=0 ){
                nums[count++]=nums[i];
            }
        }
        while( count < length ){
            nums[count++]=0;
        }
    }
}