/* HasMap idea:
 * if lookingFor is not in the HashMap
 *    store current number in the HasMap
 * else
 *    return the nums[]
 */

// 1
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer,Integer> map= new HashMap();
        for( int i=0;i< nums.length ;++i ){
            int lookingFor= target-nums[i];
            if( map.get(lookingFor)!=null ){
                return new int[]{ map.get(lookingFor), i+1 }; 
            }else{
                map.put( nums[i], i+1);
            }
        }
        return null;
    }
}

public class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        
        int length= nums.length; 
        if(length < 2 ){ return nums ; }
        
        int res[] = new int[2];
        HashMap<Integer, Integer > map= new HashMap<Integer, Integer>(); // < value, index >
        int search= 0; 
        for( int i=0; i<length ;++i ){
            search= target-nums[i]; 
            if( map.get(search) != null ){// found
                res[0]= map.get(search)+1;
                res[1]= i+1;
                return res;
            }
            map.put( nums[i],i );
        }
        return null; // not match 
    }
}


// 167 Two Sum II - Input array is sorted
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int l=0;
        int r=nums.length;
        while(l<r){
            if(nums[l]+nums[r]==target){
                result[0]=nums[l];
                result[1]=nums[r];
                retrun result; 
            }else if(nums[l]+nums[r]>target){
                r--;
            }else{
                l++;
            }   
        }
        retur null;
    }
}

