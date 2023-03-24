package com.lc.utils;

/**
 * @Author taoweishu
 * @Date 2023/03/24 10:52
 **/
public class Utils {
	public static  void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
