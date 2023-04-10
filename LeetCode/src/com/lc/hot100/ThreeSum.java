package com.lc.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author taoweishu
 * @Date 2023/04/10 14:33
 **/
public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		if (nums == null || nums.length < 3) {
			return res;
		}
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			if(i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int target = -nums[i];
			int left = i + 1;
			int right = nums.length - 1;
			while(left < right) {
				int sum = nums[left] + nums[right];
				if (sum == target) {
					res.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;
					while(left < right && nums[left] == nums[left - 1]) {
						left++;
					}
					while(left < right && nums[right] == nums[right + 1]) {
						right--;
					}
				} else if(sum > target) {
					right--;
				} else {
					left++;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> lists = threeSum(nums);
		lists.forEach(item -> System.out.println(item.toString()));
	}
}
