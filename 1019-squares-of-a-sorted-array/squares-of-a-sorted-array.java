class Solution {
    public int[] sortedSquares(int[] nums) {
        //Arrays.sort(nums);
        int[] a = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i]*nums[i];
        }
        Arrays.sort(a);
        return a;
    }
}