public class Solution {
    public int[] plusOne(int[] digits) {
        
        int length= digits.length; 
        if( length==0){ return null; }
        
        int carry=1;
        for(int i=length-1; i>=0 ; --i ){
            int digit = (carry + digits[i]) % 10 ;
            carry= (carry+digits[i]) / 10;
            digits[i]= digit; 
        }
        
        if( carry==1){
            int[] result= new int [ length +1 ];
            result[0]= carry;
            for(int i=0; i< length ;++i ){
                result[i+1]= digits[i]; 
            }
            return result;
        }

        return digits; 
    }
}

//  you can try this : System.arraycopy(digits, 0, res, 1, digits.length);
