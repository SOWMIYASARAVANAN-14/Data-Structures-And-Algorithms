class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='#'){
                if(!st1.empty()){
                    st1.pop();
                }
            }
            else{
                st1.push(i);
            }
        }
        for(char i:t.toCharArray()){
            if(i=='#'){
                if(!st2.empty()){
                    st2.pop();
                }
            }
            else{
                st2.push(i);
            }
        }
        if(st1.size() != st2.size()){
            return false;
        }
        
        while(!st1.empty()){
                char val1 = st1.pop();
                char val2 = st2.pop();
                if(val1!=val2){
                   return false;
                }
            }
        return true;


        
    }
}