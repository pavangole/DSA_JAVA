package Linkedlist.Cycle;


class  ListNode{
    int val;
    ListNode next;
    ListNode(int x ) {
        val = x;
        next = null;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        System.out.println(new Solution().hasCycle(list));
    }

}

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return  true;
            }
        }
        return  false;
    }
}
