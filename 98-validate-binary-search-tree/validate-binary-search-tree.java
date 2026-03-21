 public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isValidBST(TreeNode root){
        return validate(root, Long.MIN_VALUE , Long.MAX_VALUE);
    }
    private  boolean validate(TreeNode currentnode,long min,long max){
        if(currentnode==null){
            return true;
        }
        if((currentnode.val<=min)||(currentnode.val>=max)){
            return false;
        }
        return validate(currentnode.left,min,currentnode.val)&&validate(currentnode.right,currentnode.val,max);
        
    }
}