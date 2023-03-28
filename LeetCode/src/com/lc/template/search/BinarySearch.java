package com.lc.template.search;

/**
 * @Author taoweishu
 * @Date 2023/03/28 10:35
 **/
public class BinarySearch {

	public static int binarySearch(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		while(left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) return mid;
			else if (nums[mid] > target) {
				right = mid - 1;
			} else if (nums[mid] < target){
				left = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = new int[]{1,3,4,6,7,11,13,15,16};
		int res = binarySearch(nums,13);
		System.out.println(res);

	}
}
