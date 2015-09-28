public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length= strs.length ;
        if(length == 0){ return "" ; }
        
        String common= strs[0];
        for( int i= 1; i<length ;++i ){
            
            String temp=""; 
            for(int j=0; j< Math.min( common.length(), strs[i].length() ) ; ++j){
            
                if( common.charAt(j) == strs[i].charAt(j) ){
                    temp+= common.charAt(j);
                }else{
                    break;
                }
            }
            common= temp; 
        }
        return common; 
    }
}