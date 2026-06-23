class Solution {
    public String reverseWords(String s) {
       StringBuilder res = new StringBuilder();
       int i=s.length()-1;
       int end=0,start=0;
       while(i>=0){
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        if(i<0){
            break;
        }
            end = i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            start = i+1;
            if(res.length()!=0){
                res.append(' ');
            }
            for(int j=start;j<=end;j++){
                res.append(s.charAt(j));
            }
        
       
       }
       return res.toString();
    }
}