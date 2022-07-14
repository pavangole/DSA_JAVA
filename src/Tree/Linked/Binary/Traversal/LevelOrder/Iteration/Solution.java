package Tree.Linked.Binary.Traversal.LevelOrder.Iteration;

import java.util.ArrayList;
import java.util.Deque;
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null) {
            return ans;
        }
        
       
        
        Deque<TreeNode> store = new LinkedList<TreeNode>();
        store.add(root);
        int n = store.size();
    
        while (store.size() != 0) {
            
            List<Integer> result = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                TreeNode node = store.poll();
                result.add(node.val);
                if (node != null && node.left != null)
                    store.add(node.left);
                    
                if (node != null && node.right != null)
                    store.add(node.right);
            }
            n = store.size();
            ans.add(result);

        }
        return ans;
        
    }

    public static void main(String[] args) {
        
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode root = new TreeNode(1, node2, node3);

        new Solution().levelOrder(root);
    }
}
