class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0;
        int b=0;
        while(a<s.length() && b<t.length()){
            char a1 = s.charAt(a);
            char a2 = t.charAt(b);
            if(a1==a2){
                a++;
                b++;
            }
            else{
                b++;
            }
        }
        return a==s.length();
    }
}