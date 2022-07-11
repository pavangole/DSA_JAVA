package Linkedlist.RemoveElement;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

public class Solution {

    public ListNode removeElements(ListNode head, int val, ListNode prev, ListNode next) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            head = removeElements(head.next, val, prev, next);
        }
        else if (next != null && next.next != null) {
            if (next.next.val == val) {
                prev.next = next.next.next;
                head = removeElements(head, val, prev, prev);

            }
            else { 
            head = removeElements(head, val, prev.next, next.next);
            }
        }
        // else if (next != null && next.val == val){
        //     prev.next = null;
        //     next = null;
        //     head = removeElements(head, val, prev, next);
        // }

        return head;
    }

    public static void main(String[] args) {
        ListNode l4 = new ListNode(3);
        ListNode l3 = new ListNode(2,l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        new Solution().removeElements(l1, 3, l1, l1);
    }
}
