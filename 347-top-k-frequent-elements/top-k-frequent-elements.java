class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            
        }
        PriorityQueue<Integer>p = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int i:map.keySet()){
            p.add(i);
            if(p.size()>k){
                p.poll();
            }

        }
        int[] result = new int[k];
        for(int i=k-1;i>=0;i--){
            result[i] = p.poll();
        }
        return result;
    }
}