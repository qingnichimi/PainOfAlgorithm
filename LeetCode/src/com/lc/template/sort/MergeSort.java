package com.lc.template.sort;

/**
 * @Author taoweishu
 * @Date 2023/04/03 14:57
 **/
public class MergeSort {
	public static void mergeSort(int[] nums, int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(nums, left, mid);
			mergeSort(nums, mid + 1, right);
			merge(nums, left, mid, right);
		}
	}
	public static void merge(int[] nums, int left, int mid, int right) {
		int[] temp = new int[nums.length];
		int i = left;
		int j = mid + 1;
		int k = left;
		while(i <= mid && j <= right) {
			if(nums[i] > nums[j]) {
				temp[k++] = nums[j++];
			} else {
				temp[k++] = nums[i++];
			}
		}
		while(i <= mid) {
			temp[k++] = nums[i++];
		}
		while(j <= right) {
			temp[k++] = nums[j++];
		}
		for(int m = left; m <= right; m++) {
			nums[m] = temp[m];
		}
	}
	public static void main(String[] args) {
		int[] nums = new int[]{8,4,6,3,7,4,2,5,2,1};
		mergeSort(nums, 0, nums.length - 1);
		for(int n : nums) {
			System.out.print(n + " ");
		}
	}
}
