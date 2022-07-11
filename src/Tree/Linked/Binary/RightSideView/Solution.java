package Tree.Linked.Binary.RightSideView;

import java.util.ArrayList;
import java.util.List;

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
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return result;
        }

        

        return result;

    }
}
