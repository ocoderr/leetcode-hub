package com.ocoder.leetcode.linkedlist.p206_reverse_linked_list;

import com.ocoder.leetcode.linkedlist.ListNode;

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
 * <p>
 * https://leetcode.com/problems/reverse-linked-list/discuss/140916/Python-Iterative-and-Recursive-(206)
 */
public class Solution {


    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }


    public ListNode reverseListRecurs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        return reverseListRecursOne(null, head);
    }

    public ListNode reverseListRecursOne(ListNode head, ListNode tail) {
        if (tail == null) {
            return head;
        }

        ListNode next = tail.next;
        tail.next = head;
        return reverseListRecursOne(tail, next);

    }


}
