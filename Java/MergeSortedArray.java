public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       // [0] , 0, [1], 1
        
        int  i= m+n-1 ;
        int index1= m-1;
        int index2= n-1;
        
        for(  ; i>=0 && index1>=0 && index2>=0  ; --i  ){
           
            if(nums1[index1] > nums2[ index2] ){
                nums1[i] =nums1[ index1--];
            }else  {
                nums1[i] =nums2[ index2--];
            }
        }
        while( i>=0 && index2>=0 ){ nums1[i--] = nums2[index2--]; }// index1 <0
        while( i>=0 && index1>=0 ){ nums1[i--] = nums1[index1--]; }// index2 <0
    }
}