// way1 : sort O(nlogn)

public class Solution {
    public boolean isAnagram(String s, String t) {

        if(s==null){
            return (t==null);
        }
        if( t=null || s.length() != t.length() ){
            return false; 
        }
        char[] sToCharAry= s.toCharArray();
        char[] tTocharAry= t.toCharArray();
        
        Arrays.sort( sToCharAry );
        Arrays.sort( tTocharAry );
        return Arrays.equals(sToCharAry, tTocharAry);
    }
}
// https://leetcode.com/discuss/61456/my-java-solution-8ms
// way2 : O(n), record
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length() ){
            return false; 
        }

        int[] sample= new int[26] ; // assume all lowercase
        
        for(int i=0; i< 26 ; ++i ){
            sample[i]=0;
        }
        for(int i=0;i<s.length(); ++i ){
            sample[ s.charAt(i) -'a' ]++;
        }
        for(int i=0;i<t.length() ;++i){
            sample[t.charAt(i) -'a' ]--;
            if( sample[ t.charAt(i)-'a'] < 0 ){
                return false;
            }
        }
        return true; 
    }
}
// https://leetcode.com/discuss/56765/java-my-solution-with-o-n-only-8-lines-need-not-using-map
// way 3: O(n), record
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null){
            return (t==null);
        }
        if( t==null || s.length()!= t.length() ){
            return false; 
        }
        
        int[] ary= new int[256];
        
        for(int flag: ary ){
            flag=0;
        }
        for(char c: s.toCharArray() ){
            ary[c]++;
        }
        for(char c: t.toCharArray() ){
            ary[c]--;
            if(ary[c]< 0 ){ return false; }
        }
        return true;
    }
}
