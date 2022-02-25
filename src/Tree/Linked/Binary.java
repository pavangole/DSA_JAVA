package Tree.Linked;



import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    List<Integer> Ofnodes = new ArrayList<>();

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        

    }

    List<Integer> inOrder(TreeNode root) {

        if (root == null) {
            return null;
        }

        inOrder(root.left);
        Ofnodes.add(root.val);

        inOrder(root.right);
        return Ofnodes;
    }

}

public class Binary {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,null,null);
        TreeNode left = new TreeNode(2 , null,null);
        TreeNode right = new TreeNode(3, null,null);
        root.left = left;
        root.right = right;

    }
}
