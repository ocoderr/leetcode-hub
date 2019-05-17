package com.ocoder.leetcode.linkedlist.p206_reverse_linked_list;

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
        if(head == null){
            return null;
        }
        ListNode prev = null;
        return reverseListRecursOne(prev,head);
    }

    public ListNode reverseListRecursOne(ListNode head,ListNode tail) {
        if(tail.next == null){
            tail.next = head;
            return tail;
        }

        ListNode next = tail.next;

        tail.next = head;

        return reverseListRecursOne(tail,next);

    }


}
