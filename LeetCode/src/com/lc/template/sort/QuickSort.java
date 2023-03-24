package com.lc.template.sort;

import com.lc.utils.Utils;

/**
 * @Author taoweishu
 * @Date 2023/03/23 16:59
 **/
public class QuickSort {
	public static void quickSort(int[] nums, int left, int right){
		if (left > right) {
			return;
		}
		int l = left;
		int r = right;
		int p = nums[left];
		while(l < r) {
			while(nums[r] >= p && l < r) {
				r--;
			}
			while(nums[l] <= p && l < r) {
				l++;
			}
			Utils.swap(nums, l, r);
		}
		nums[left] = nums[l];
		nums[l] = p;
		quickSort(nums, left, l - 1);
		quickSort(nums, l + 1, right);
	}
	public static void main(String[] args) {
		int[] nums = new int[]{8,4,6,3,7,4,2,5,2,1};
		quickSort(nums, 0, nums.length - 1);
		for(int n : nums) {
			System.out.print(n + " ");
		}
	}
}
