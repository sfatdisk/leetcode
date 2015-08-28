/*
Note: 
sort,nums[i]<=0, remove duplicates
*/


public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List< List<Integer> > results= new ArrayList< List<Integer> >(); 
        
        for(int i=0;i< nums.length-2 && nums[i]<=0 ;++i){
            int l= i+1;
            int r= nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){continue;}
            
            while(l<r){
                if(nums[l]+nums[i]+nums[r]==0){
                    List<Integer> result= new ArrayList<Integer>();
                    result.add(nums[i]);
                    result.add(nums[l]);
                    result.add(nums[r]);
                    results.add(result);
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]) { l++; }
                    while(l<r && nums[r]==nums[r+1]) { r--; }
                }else if(nums[l]+nums[r]+nums[i]<0){
                    l++;
                }else{
                    r--;
                }
            }
            
        }
        return results;
    }
}