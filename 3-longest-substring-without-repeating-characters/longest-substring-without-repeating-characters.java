class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char a = s.charAt(right);
            if(map.containsKey(a) && map.get(a)>=left){
                left = map.get(a)+1;
            }
            map.put(a,right);
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}