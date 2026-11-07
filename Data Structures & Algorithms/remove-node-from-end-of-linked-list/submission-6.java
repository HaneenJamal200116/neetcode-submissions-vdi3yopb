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
        int size = getSize(head);
        int pos = size - n + 1;
        ListNode curr = head;
        int count = 1;
        if (head == null && head.next == null)
            return null;
        if(pos==1){
            return head.next;
        }
        while (curr != null) {
            if (count == pos - 1) {
                curr.next = curr.next.next;
            }

            curr = curr.next;
            count++;
        }
        return head;
    }
    // find the linked list size
    public int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size += 1;
            head = head.next;
        }
        return size;
    }
}
