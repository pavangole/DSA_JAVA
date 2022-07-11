package Linkedlist.mergesorted;

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return list1;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode smaller;
        ListNode bigger;
        if (list1.val <= list2.val) {
            smaller = list1;
            bigger = list2;
        }
        else {
            smaller = list2;
            bigger = list1;
        }
        
        ListNode merge = new ListNode(smaller.val);
        ListNode head = merge;
        smaller = smaller.next;
        while((smaller != null) && (bigger != null)) {
            ListNode temp = new ListNode();
            if(smaller.val <= bigger.val) {
               
                temp.val = smaller.val;
                smaller = smaller.next;
            }
            else {
                
                temp.val = bigger.val;
                bigger = bigger.next;
            }
        ListNode last = head; 
        while (last.next != null)
            last = last.next;
        last.next = temp;
           
        }
        if (bigger != null) {
            ListNode last = merge; 
            while (last.next != null)
                last = last.next;
            last.next = bigger;
        }

        if (smaller != null) {
            ListNode last = merge; 
            while (last.next != null)
                last = last.next;
            last.next = smaller;
        }

        

        return merge;

    }

    public static void main(String[] args) {
        // ListNode l3 = new ListNode(4);
        // ListNode l2 = new ListNode(2,l3);
        // ListNode l1 = new ListNode(1,l2);

        // ListNode v3 = new ListNode(4);
        // ListNode v2 = new ListNode(3,v3);
        // ListNode v1 = new ListNode(1,v2);
        ListNode v1 = new ListNode();
        ListNode v2 = new ListNode();

        new Solution().mergeTwoLists(v1,v2);
    }
}
