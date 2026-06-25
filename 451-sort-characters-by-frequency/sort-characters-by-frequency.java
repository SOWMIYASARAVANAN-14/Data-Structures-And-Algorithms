class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        ArrayList<Character>list = new ArrayList<>();
        list.addAll(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        StringBuilder sb = new StringBuilder();
        for(char ch:list){
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}