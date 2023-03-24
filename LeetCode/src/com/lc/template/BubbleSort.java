package com.lc.template;

import com.lc.utils.Utils;

/**
 * @Author taoweishu
 * @Date 2023/03/24 10:50
 **/
public class BubbleSort {
	public static void bubbleSort(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					Utils.swap(nums, i, j);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] nums = new int[]{2,3,1,6,3,4,8,5,6};
		bubbleSort(nums);
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}
}
