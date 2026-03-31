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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Find Middle node
        ListNode midNode = slow;

        // Reverse 2nd half
        ListNode prev = null;
        ListNode next;
        while(midNode != null){
            next = midNode.next;
            midNode.next = prev;
            prev = midNode;
            midNode = next;
        }

        // Check left and right half
        ListNode left = head;
        ListNode right = prev;

        while(right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
}
