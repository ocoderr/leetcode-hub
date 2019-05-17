package com.ocoder.leetcode.linkedlist.p203_remove_linked_list_element;

import com.ocoder.leetcode.linkedlist.ListNode;

/**
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example:
 * <p>
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode h = new ListNode(-1);
        h.next = head;
        ListNode prev = h;
        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }
        return h.next;
    }

}
