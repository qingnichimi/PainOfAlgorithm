package com.lc.template.sort;

import com.lc.utils.Utils;

/**
 * @Author taoweishu
 * @Date 2023/04/07 15:38
 **/
public class HeapSort {
	public static void heapSort(int[] nums) {
		int n = nums.length;
		// 构建最大堆
		for(int i = n / 2 - 1; i >= 0; i--) {
			heapify(nums, n, i);
		}

		for(int i = n - 1; i > 0; i--) {
			Utils.swap(nums, 0, i);
			heapify(nums, i, 0);
		}
	}

	public static void heapify(int[] nums, int n, int i) {
		// 根节点
		int largest = i;
		// 左节点
		int left = 2 * i + 1;
		// 右节点
		int right = 2 * i + 2;
		if(left < n && nums[left] > nums[largest]) {
			largest = left;
		}
		if(right < n && nums[right] > nums[largest]) {
			largest = right;
		}
		if(largest != i) {
			Utils.swap(nums, i, largest);
			heapify(nums, n, largest);
		}
	}
	public static void main(String[] args) {
		int[] nums = new int[]{2,1,3,4,6,7,5,10};
		heapSort(nums);
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}
}
