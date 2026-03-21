class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int r = n*(n+1);
       int d = r/2;
       int sum=0;
       for(int i=0;i<nums.length;i++){
            sum+=nums[i];
       }
       int ans= d-sum;
       return ans;
    }
}