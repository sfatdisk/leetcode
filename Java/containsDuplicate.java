// T O(n), S O(n) 
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        int length= nums.length; 
        if( length <2 ){ return false; }
        
        HashMap map = new HashMap(); // <value, index > for lookup
        for( int i=0; i<length ; ++i ){
            if( map.get(nums[i]) != null ){ // in map -> duplicates
                return true; 
            }else{ // store in map
                map.put(nums[i], i );
            }
        }
        return false;
    }
}

// another way? HashSet

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if( nums.length< 2){ return false;  }
        HashSet<Integer> set= new HashSet<Integer>();
        for( int num: nums ){
            if( !set.add(num) ){  // set.add() true, not in set
                return true;
            }
        }
        return false; 
    }
}

// another way? 
