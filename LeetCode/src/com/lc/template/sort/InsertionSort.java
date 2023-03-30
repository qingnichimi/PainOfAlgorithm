package com.lc.template.sort;

/**
 * @Author taoweishu
 * @Date 2023/03/30 10:06
 **/
public class InsertionSort {
	public static void insertionSort(int[] nums) {
		for(int i = 1; i < nums.length; i++) {
			int key = nums[i];
			int j = i - 1;
			while(j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = key;
		}
	}
	public static void main(String[] args) {
		int[] nums = new int[]{4,1,2,3,4,6,7,3,7,10};
		insertionSort(nums);
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}
}
