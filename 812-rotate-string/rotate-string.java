class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
           // char c1 = s.charAt(i);
            // char c2 = goal.charAt(i);
            if(s.equals(goal)){
                return true;
            }
            s=s.substring(1)+s.charAt(0);
        }
        return false;
    }
}