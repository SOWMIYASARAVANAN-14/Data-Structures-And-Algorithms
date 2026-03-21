import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        long  f = Long.MIN_VALUE;
        long s =  Long.MIN_VALUE;
        long t = Long.MIN_VALUE;
        for(int num:nums){
            if(num>f){
                t = s;
                s = f;
                f = num;
                
            }
            else if(num > s && num!= f){
                t = s;
                s = num;
                
            }
            else if(num>t && num!=s && num!=f ){
                t = num;
                
            }
            
        }
        return t != Long.MIN_VALUE ? (int)t : (int)f;
        
    }
}