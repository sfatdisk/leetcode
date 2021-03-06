way 1. while loop 224ms O(n^2)

public class Solution {
    
    public int addDigits(int num) {
        if( num < 10 ){ return num ; }
        
        int digitSum= getDigitSum( num );
        
        while(digitSum >=10 ){
            digitSum = getDigitSum( digitSum );
        }
        return digitSum ; 
    }
    
    private int getDigitSum( int num ){
        int reminder=0; 
        while(  num >= 10 ){
            reminder += num%10; 
            num= num/10;
        }
        return num+reminder; 
    }
}

9/ 25 /2015

public class Solution {
    public int addDigits(int num) {
        
        if( num < 10 ){ return num; }
        
        int temp=0 ; 
        while( num >=10 ){
            temp+= num%10;
            num/=10;    
        }
        int rst= temp+ num;
        if( rst >= 10 ){
            rst= addDigits(rst );
        }
        
        return rst; 
    }
}

Discussion : https://leetcode.com/discuss/59588/my-simple-java-solution-use-loop-and-without-loop
Wiki: https://en.wikipedia.org/wiki/Digital_root

public class Solution {
    public int addDigits(int num) {
        int result= 0;
        if( num < 10 ){ return num; }
        while( num >=10 ){
            result += num % 10 ;
            num/=10;
        }
        return addDigits( result+num ); 
    }
}

// amazing .....
public class Solution {
    public int addDigits(int num) {
    // Wiki
        return num-9*((num-1)/9);
    }
}


