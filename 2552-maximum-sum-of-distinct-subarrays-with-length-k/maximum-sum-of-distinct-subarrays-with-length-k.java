class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum=0;
        long res = 0;
        int dupcount = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==2){
                dupcount++;
            }
            if(i>=k){
                int left = nums[i-k];
                sum-=left;
                map.put(left,map.get(left) - 1 );
                if(map.get(left)==1){
                    dupcount--;
                }
                if(map.get(left)==0){
                    map.remove(left);
                }
            }
            if(i>=k-1){
                if(dupcount==0){
                    res = Math.max(res,sum);
                }
            }
        }
        return res;
    }
}