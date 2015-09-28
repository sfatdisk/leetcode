public class Solution {
    public void sortColors(int[] nums) {
        int len= nums.length; 
        if( len<2 ){ return ; } 
        int l= 0;
        int r= len-1;
    
        int cur= l; 
        while( cur<= r  ){
            if( nums[cur]==0 ){
                nums[cur++]=nums[l];
                nums[l++]=0;
            }else if( nums[cur]== 2){
                nums[cur]=nums[r];
                nums[r--]=2;
            }else{
                cur++;  
            }
        }
    }
}