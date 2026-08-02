class Solution {
    public int maxDepth(String s) {
        int count =0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='('){
                count++;
                max = Math.max(max,count);
            }
            else if(a==')'){
                count--;
            }
        }
        return max;
    }
}