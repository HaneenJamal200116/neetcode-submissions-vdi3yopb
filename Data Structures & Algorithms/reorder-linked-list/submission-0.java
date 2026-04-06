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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
       // Find the middle node;
       ListNode slow=head, fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       //reverse
       ListNode second=reverseList(slow.next);
       slow.next=null;
       // mearge
       ListNode first=head;
       while(second!=null){
        ListNode temp1=first.next;
        ListNode temp2=second.next;
        first.next=second;
        second.next=temp1;
        first=temp1;
        second=temp2;
       }

    }
    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
