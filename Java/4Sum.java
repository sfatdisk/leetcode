/*
*/

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer> > results= new ArrayList<List<Integer> >();
        Arrays.sort(nums);
        for(int i=0; i< nums.length-3 ;i++){
            if(i>0 && nums[i]==nums[i-1]){continue;}
            // Three sum
            for(int j=i+1; j< nums.length-2 ;j++ ){
                if( j>i+1 && nums[j]==nums[j-1] ){ continue; }
                int l= j+1;
                int r= nums.length-1;
                
                while(l<r){
                    if(nums[i]+nums[j]+nums[l]+nums[r] >target ){
                        r--;
                    }else if(nums[i]+nums[j]+nums[l]+nums[r]<target){
                        l++;
                    }else{
                        List<Integer> result = new ArrayList<Integer>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[l]);
                        result.add(nums[r]);
                        results.add(result);
                        l++;
                        r--;
                        while( l<r && nums[l-1]==nums[l]){ l++; }
                        while( l<r && nums[r+1]==nums[r]){ r--; }
                    }
                }
            }
        }
        return results; 
    }
}