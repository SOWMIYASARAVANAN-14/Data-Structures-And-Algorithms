class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current=0;
        int max = 0;
        for(int i:nums){
                if(i==1){
                    current++;
                }
                else{
                    current=0;
                }
             max=Math.max(max,current);
        }
        //max=Math.max(max,current);
        return max;
    }
}