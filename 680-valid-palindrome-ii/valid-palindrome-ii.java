class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right = s.length()-1;
        while(left<right){
            char a = s.charAt(left);
            char b = s.charAt(right);
            if(a!=b){
                return isvalid(s,left+1,right) || isvalid(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isvalid(String s, int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}