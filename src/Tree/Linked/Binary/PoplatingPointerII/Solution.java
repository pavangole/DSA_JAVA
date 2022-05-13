package src.Tree.Linked.Binary.PoplatingPointerII;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class Solution {
    public Node connect(Node root) {
        int i = 0;
        int k = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            i++;
            Node q = queue.poll();
            if (q != null) {
                queue.add(q.left);
                queue.add(q.right);
            }
            if (i % 2 != 0 && i == k) {
                if (q != null)
                    q.next = null;
                k = 1 + 2 * i;
                continue;
            }
            if (q != null)
                q.next = queue.peek();
                
        }



        return root;
        
    }

    public static void main(String[] args) {
        Node seven = new Node(7);
        Node six = new Node(6);
        Node five = new Node(5);
        Node four = new Node(4);
        Node two = new Node(3,six,seven,null);
        Node three = new Node(2,four,five,null);
        Node one = new Node(1,two,three,null);

        new Solution().connect(one);
    }
    
}
