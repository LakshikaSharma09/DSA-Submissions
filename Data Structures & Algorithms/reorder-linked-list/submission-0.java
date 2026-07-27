/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverse(ListNode node){
        ListNode curr = node;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        if(head.next==null){
            return;
        }

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;

        ListNode rev = reverse(mid);
        ListNode curr = head;

        while(curr!=null && rev!=null){
            ListNode n1 = curr.next;
            ListNode n2 = rev.next;

            curr.next = rev;
            rev.next = n1;

            curr = n1;
            rev = n2;
        }
    }
}
