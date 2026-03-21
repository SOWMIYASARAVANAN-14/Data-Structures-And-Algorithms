class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> p = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> r = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    r.add(1);
                }
                else{
                    List<Integer> a = p.get(i-1);
                    r.add(a.get(j)+a.get(j-1));
                }
            }
            p.add(r);
        }
        return p;
    }
}