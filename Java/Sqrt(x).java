// way 1 : Binary Search 
// concept: 对于一个非负数n，它的平方根不会大于（n/2+1）
// why? because we need to find the result after sqrt
// so if data is sotred, BS is the fastest solution O( log n )
// refer: http://www.cnblogs.com/AnnieKim/archive/2013/04/18/3028607.html

public class Solution {
    public int mySqrt(int x) {

    	if( x<2 ){ return x; } // handle x= 0 || 1

    	int left= 1;
    	int right= x/2; // df the original range

    	while( left <= right ){ // execute BS
    		int mid= (left+right) / 2 ;

    		if( x/mid == mid ){ return mid ; } //  x = mid*mid -> sqrt(x) = mid


    		if( x/mid >mid ){
    			left= mid+1; // move to right
    		}else{
    			right= mid-1;
    		}
    	}
    	return right; 
    }
}

// way 2: Newton's method 
// sqrt(x)=y -> x=y^2 -> y^2-x = 0 : f(y)= y^2 -x 
// 
public class Solution {
    public int mySqrt(int x) {
        if(x==0){ return 0; }
        double last= 0;
        double rst= 1;
        while(last != rst){
            last= rst;
            rst= ( rst+ x/rst )/2;
        }
        return (int)rst; 
    }
}


