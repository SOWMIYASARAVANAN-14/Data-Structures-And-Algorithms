class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int level=0;
        for(char a : s.toCharArray()){
            if(a=='('){
                if(level>0){
                    res.append(a);
                }
                level++;
            }
            else{
                level--;
                if(level>0){
                    res.append(a);
                }
            }
        }
        return res.toString();

    }
}