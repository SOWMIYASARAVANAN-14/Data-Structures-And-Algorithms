class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder a = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            a.append((char)('A'+ (columnNumber%26)));
            columnNumber/=26;
        }
        return a.reverse().toString();
    }
}