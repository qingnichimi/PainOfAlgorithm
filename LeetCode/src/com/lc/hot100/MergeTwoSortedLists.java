package com.lc.hot100;

/**
 * @Author taoweishu
 * @Date 2023/04/24 15:17
 **/
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		while (list1 != null && list2 != null) {
			if (list1.val > list2.val) {
				head.next = list2;
				list2 = list2.next;
			} else {
				head.next = list1;
				list1 = list1.next;
			}
			head = head.next;
		}
		if (list1 == null) {
			head.next = list2;
		}
		if (list2 == null) {
			head.next = list1;
		}
		return dummy.next;
	}
}
