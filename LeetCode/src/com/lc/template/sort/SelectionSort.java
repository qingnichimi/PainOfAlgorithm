package com.lc.template.sort;

import com.lc.utils.Utils;

/**
 * @Author taoweishu
 * @Date 2023/03/26 08:42
 **/
public class SelectionSort {
	public static void selectionSort(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			int min = nums[i];
			for(int j = i + 1; j < nums.length; j++) {
				if (nums[j] < min) {
					min = nums[j];
					Utils.swap(nums, i, j);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] nums = new int[]{2,3,1,6,3,4,5,7,9,5};
		selectionSort(nums);
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}
}
