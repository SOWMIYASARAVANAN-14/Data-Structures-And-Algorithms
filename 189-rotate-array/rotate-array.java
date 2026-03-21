class Solution {
    public void rotate(int[] nums, int k) {
       int a = nums.length;
       if(k>=a){
            k=k%a;
       }

        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
    }
    private static void reverseArray(int[] nums,int start,int stop){
        while(start < stop){
            int temp = nums[start];
            nums[start] = nums[stop];
            nums[stop] = temp;
            start++;
            stop--;
        }
    }
       

}