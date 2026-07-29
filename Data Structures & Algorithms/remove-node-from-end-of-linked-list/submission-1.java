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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        int x = 0;
        ListNode curr = head;
        while(curr!=null){
            x++;
            curr = curr.next;
        }
        if(x==n){
            head=head.next;
            return head;
        }
        int i = 0;
        int y = x-n-1;
        curr = head;
        while(curr != null){
            if(i==y){
                curr.next = curr.next.next;
            }else{
            curr = curr.next;
            }
            i++;
        }
        return head;
    }
}
