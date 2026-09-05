

class Solution {
    int maxd = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        hight(root);
        return maxd;
    }
    public int hight(TreeNode root){
        if(root == null) return 0;


        int left = hight(root.left);
        int right = hight(root.right);


        maxd = Math.max(left+right,maxd);
        return  1 + Math.max(left , right);
        
    }
    
}
