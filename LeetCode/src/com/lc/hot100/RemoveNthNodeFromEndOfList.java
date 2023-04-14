package com.lc.hot100;

/**
 * @Author taoweishu
 * @Date 2023/04/14 14:56
 **/
public class RemoveNthNodeFromEndOfList {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(-1, head);
		ListNode fast = head;
		ListNode slow = dummy;
		while(n > 0) {
			fast = fast.next;
			n--;
		}
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return dummy.next;
	}
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		int n = 1;
		ListNode listNode = removeNthFromEnd(head, n);
		System.out.println(listNode);
	}
}
