public class Solution {
    public int removeElement(int[] nums, int val) {
        
        int length= nums.length; 
        if( length ==0 ){ return 0; }
        
        int i=0;
        int j=0;
        while( i<length ){
            if(  nums[i] == val ){ // not equal to target
                i++;
            }else{
                nums[j]= nums[i]; //update
                i++;
                j++;
            }
        }
        return j; 
    }
}