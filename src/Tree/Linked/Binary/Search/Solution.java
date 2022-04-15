

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {

    

    TreeNode searchBST(TreeNode root, int val) {
        
        while (root != null ) {
            
            if (root.val == val) {
                return root;
            }
            
            if (root.val > val) {
                root = root.left;
            }
            if (root == null ) {
                return root;
            }
            if (root.val < val ) {
                root = root.right;
            }

            
        }
        return root;

    }

    public static void main(String[] args) {
        TreeNode frist = new TreeNode(4);
        TreeNode sec = new TreeNode(2);
        TreeNode third = new TreeNode(7);
        frist.left = sec;
        frist.right = third;
        
        TreeNode fourth = new TreeNode(1);
        TreeNode fifth = new TreeNode(3);

        sec.left = fourth;
        sec.right = fifth;
        int val = 5;
        Solution soln = new Solution();
        soln.searchBST(frist, val);
    }
}