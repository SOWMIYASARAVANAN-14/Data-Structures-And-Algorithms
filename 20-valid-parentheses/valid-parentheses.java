import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character>st1 = new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='('||i=='{'||i=='['){
                st1.push(i);
            }
            else {
                if(st1.empty()){
                    return false;
                }
                char top = st1.pop();
                if(i==')'&& top!='('){
                    return false;
                }
                if(i=='}'&& top!='{'){
                    return false;
                }
                if(i==']'&& top!='['){
                    return false;
                }
            }
        }
        return st1.empty();
    }
}