class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(!map.containsKey(a)){
                map.put(a,1);
            }
            else{
                map.put(a,map.get(a)+1);
            }
        }
       for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(map.get(ch)==1){
                return j;
            }
       }
       return -1;
    }
}