public class Solution {
    public int lengthOfLastWord(String s) {
        int length= s.length() ; 
        
        int i= length-1; 
        int count=0; 
        while( i>=0 && s.charAt(i) == ' ' ){  --i; }
        while( i>=0 && s.charAt(i) != ' ' ){  ++count; --i; }
        return count; 
    }
}