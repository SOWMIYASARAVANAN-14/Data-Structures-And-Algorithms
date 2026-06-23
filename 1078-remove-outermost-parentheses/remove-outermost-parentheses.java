class Solution {
    public String removeOuterParentheses(String s) {
        String res = "";
        int level=0;
        for(char a : s.toCharArray()){
            if(a=='('){
                if(level>0){
                    res+=a;
                }
                level++;
            }
            else{
                level--;
                if(level>0){
                    res+=a;
                }
            }
        }
        return res;

    }
}