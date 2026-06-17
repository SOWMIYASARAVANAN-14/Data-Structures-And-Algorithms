class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length/2;
        int[] a = new int[n];
        int[] b = new int[n];
        int ai=0;
        int bi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                a[ai++]=nums[i];
            }
            else{
                b[bi++]=nums[i];
            }
        }
        int[] res = new int[nums.length];
        for(int i=0;i<n;i++){
            res[2*i]=b[i];
            res[2*i+1]=a[i];
        }
        return res;
    }
}