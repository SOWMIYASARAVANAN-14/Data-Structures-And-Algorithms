class Solution {
    public int majorityElement(int[] nums) {
        int mx = nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==mx){
                c++;
            }
            else if(c==0){
                mx = nums[i];
            }
            else {
                c--;
            }
        }
        return mx;
    }
}