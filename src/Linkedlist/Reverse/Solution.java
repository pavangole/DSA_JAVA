package Linkedlist.Reverse;

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
    public ListNode reverseList(ListNode head) {
        // if (head == null) {
        //     return head;
        // }
        // ListNode tail = head;

        // while (tail.next != null && tail != null) {
        //     tail = tail.next;
        // }

        // while (head != null && head.next != null) {
        //     ListNode temp = head;
        //     ListNode prev = null;
        //     while (temp.next != null) {
        //         if (temp.next.next == null) {
        //             prev = temp;
        //         }
        //         temp = temp.next;
        //     }

        //     ListNode move = tail;
        //     while (move.next != null) {
        //         move = move.next;
        //     }
        //     move.next = prev;
        //     prev.next = null;
        // }

        // return tail;
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        new Solution().reverseList(l1);
    }
}
