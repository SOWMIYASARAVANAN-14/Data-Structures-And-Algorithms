class Solution {
    public int mySqrt(int x) {
      int left=1;
      int right=x;
      int a1=0;
      while(left<=right){
        int mid = left+(right-left)/2;
        long a =(long) mid * mid;
        if(a==x){
           return mid;
        } 
        else if(a<x){
            a1=mid;
            left=mid+1;
        }
        else{
            right=mid-1;
        }
      
      }
      return a1;
    }
}