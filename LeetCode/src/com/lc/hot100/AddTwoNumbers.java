package com.lc.hot100;

/**
 * @Author taoweishu
 * @Date 2023/03/24 10:05
 **/
public class AddTwoNumbers {
	/**
	 * https://leetcode.cn/problems/add-two-numbers/
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode pre = new ListNode();
		ListNode cur = pre;
		int carry = 0;
		while(l1 != null || l2 != null) {
			int a = l1 == null? 0 : l1.val;
			int b = l2 == null? 0 : l2.val;
			cur.next = new ListNode((a + b + carry) % 10);
			carry = (a + b + carry) / 10;
			cur = cur.next;
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		if (carry != 0) {
			cur.next = new ListNode(carry);
		}
		return pre.next;
	}

}


