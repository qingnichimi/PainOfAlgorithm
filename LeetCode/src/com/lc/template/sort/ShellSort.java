package com.lc.template.sort;

import com.lc.utils.Utils;

/**
 * @Author taoweishu
 * @Date 2023/03/31 09:39
 **/
public class ShellSort {
	public static void shellSort(int[] nums) {
		for(int gap = nums.length / 2; gap > 0; gap = gap / 2) {
			for (int i = gap; i < nums.length; i++) {
				int j = i;
				while(j - gap >= 0 && nums[j] < nums[j - gap]) {
					Utils.swap(nums, j, j - gap);
					j -= gap;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] nums = new int[]{2,3,1,6,3,4,5,7,9,5};
		shellSort(nums);
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}
}
