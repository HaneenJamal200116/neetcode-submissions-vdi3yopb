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
        if (head == null || head.next == null) return null;
        ListNode reversed=reverse(head);
        if(n==1) reversed=reversed.next;
        else{
            ListNode curr=reversed;
            int pos=1;
            while(curr!=null && pos<n-1){
                curr=curr.next;
                pos++;
            }
            if(curr!=null && curr.next!=null){
                curr.next=curr.next.next;
            }
        }
    
        return reverse(reversed);
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
