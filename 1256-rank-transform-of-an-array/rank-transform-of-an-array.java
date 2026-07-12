class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] c1 = arr.clone();
        Arrays.sort(c1);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i:c1){
            if(!map.containsKey(i)){
                map.put(i,rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;

    }
}