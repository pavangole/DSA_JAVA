package Tree.Linked.Binary.Right;

import java.util.LinkedList;
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
    List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new LinkedList<Integer>();
        printRightView(root, ans, 0);

        return ans;
    }

    void printRightView(TreeNode root, List<Integer> list, int level) {
        if (root == null) {
            return;
        }

        if (list.size() == level) {
            list.add(root.val);
        }

        printRightView(root.right, list, level + 1);
        printRightView(root.left, list, level + 1);
    }

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode root = new TreeNode(1, node2, node3);

        new Solution().rightSideView(root);
    }
}
