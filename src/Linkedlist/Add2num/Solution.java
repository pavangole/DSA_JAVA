package Linkedlist.Add2num;

import java.util.List;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        int borrow = 0;
        while (l1 != null) {
            ListNode head = sum;
            int addition = 0;

            if (l2 != null) {
                addition = l1.val + l2.val + borrow;
            } else {
                addition = l1.val + borrow;
            }
            if (addition > 9) {
                borrow = addition / 10;
                addition = addition % 10;
            }
            
            head.val = addition;
            if(l1.next != null)
                head.next = new ListNode();
            l1 = l1.next;
            l2 = l2.next;
        }

        return sum;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 2;
        l1.next = new ListNode();
        l1.next.val = 4;
        l1.next.next = new ListNode();
        l1.next.next.val = 3;
        l1.next.next = null;
    
        ListNode l2 = new ListNode();
        l2.val = 2;
        l2.next = new ListNode();
        l2.next.val = 4;
        l2.next.next = new ListNode();
        l2.next.next.val = 3;
        l2.next.next = null;
    
        System.out.println(new Solution().addTwoNumbers(l1, l2));
    }
    
}

