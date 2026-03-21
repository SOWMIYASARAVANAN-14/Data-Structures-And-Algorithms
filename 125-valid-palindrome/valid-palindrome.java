class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String a = sb.toString();
        a = a.toLowerCase();
        if(a.length()<=1){
            return true;
        }
        int left = 0;
        int right = a.length()-1;
        while(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}