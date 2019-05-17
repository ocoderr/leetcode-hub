package com.ocoder.leetcode.linkedlist.p206_reverse_linked_list;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 * Reverse a singly linked list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * <p>
 * Follow up:
 * <p>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
