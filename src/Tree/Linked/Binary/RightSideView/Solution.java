package Tree.Linked.Binary.RightSideView;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public List<Integer> rightSideView(TreeNode root) {
        // Using Level Order Traversal
        
        List<Integer> result = new ArrayList<Integer>();
        Deque<TreeNode> store = new LinkedList<TreeNode>();
        store.add(root);
        result.add(root.val);
        int n = store.size();
        while (store.size() != 0) {
            for (int i = 0; i < n; i++) {
                TreeNode node = store.poll();
                System.out.println(node.val);
                if (node != null && node.left != null)
                    store.add(node.left);
                if (node != null && node.right != null)
                    store.add(node.right);
            }
            n = store.size();
            if (store.size() != 0) {
                TreeNode last = store.getLast();
                result.add(last.val);
            }

        }

        return result;

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
