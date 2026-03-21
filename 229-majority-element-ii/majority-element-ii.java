class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>m = new HashMap<>();
        int n = nums.length/3;
        for(int n1:nums){
            m.put(n1,m.getOrDefault(n1,0)+1);
        }
        List<Integer> l = new ArrayList<>();
        for(int a:m.keySet()){
            if(m.get(a)>n){
                l.add(a);
            }
        }
        return l;
    }
}