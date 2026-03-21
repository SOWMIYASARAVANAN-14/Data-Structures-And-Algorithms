class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>l1 = new ArrayList<>();
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!h1.contains(nums[i])){
                    h1.add(nums[i]);
                }
                else if(!h2.contains(nums[i])){
                    l1.add(nums[i]);
                    h2.add(nums[i]);
                }
            }
        return l1;
    }
}