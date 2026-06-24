class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
       HashMap<Character,Integer>map = new HashMap<>();
       for(int i=0;i<s.length();i++){
        char c1 = s.charAt(i);
        if(!map.containsKey(c1)){
            map.put(c1,1);
        }
        else{
            map.put(c1,map.get(c1)+1);
        }
       }
       for(int j=0;j<t.length();j++){
        char c2 = t.charAt(j);
        if(!map.containsKey(c2)){
            return false;
        }
        map.put(c2,map.get(c2)-1);
       }
       for(int count:map.values()){
        if(count!=0){
            return false;
       }
       }
       return true;
    }
}