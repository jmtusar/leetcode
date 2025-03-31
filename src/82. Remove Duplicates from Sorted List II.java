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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null) {
            if(curr.next != null && curr.val == curr.next.val) {
                int temp = curr.val;
                while(curr != null && temp == curr.val){
                    curr = curr.next;
                }
                prev.next = curr;
                
            }
            else {
                curr = curr.next;
                prev = prev.next;
            }
            
        }
        return dummy.next;
    }
}
