// n= 1-> 1, 2 -> 11 , 3 -> 21, 4-> 1221 ....
public class Solution {
    public String countAndSay( int n) {
        
        String rst="1";
        for(int i=1; i< n ;++i ){ 
    
            int count=1;
            //String temp="";
            StringBuilder temp= new StringBuilder();
            
            for( int j=1; j<= rst.length();++j ){
                
                if( j!=rst.length() && rst.charAt(j-1) == rst.charAt(j) ){ // duplicate ,count 
                    count++;
                    
                }else{
                    //temp+= count+ rst.charAt(j-1);
                    temp.append(count).append( rst.charAt(j-1) );
                    count=1;
                }
            }
            //rst=temp;
            rst=temp.toString() ;
        }
        return rst; 
    }
}

// 注意到这题如果用 tmp.append(cnt+s.charAt(j-1)); 则会超时
// http://blog.csdn.net/fightforyourdream/article/details/12901505
// Time Limit Exceeded, because I use "+" as string contaction 
public class Solution {
    public String countAndSay(int n) {
        
        String rst="1";
        for(int i=0; i< n ;++i ){ 
            
            int count=1;
            String temp="";
            
            for(int j=1; j<= rst.length();++j ){
                
                if( j!=rst.length() && rst.charAt(j-1) == rst.charAt(j) ){ // duplicate ,count 
                    count++;
                    
                }else{
                    temp+= count+ rst.charAt(j-1);
                    count=1;
                }
            }
            rst=temp;
        }
        return rst; 
        
    }
}