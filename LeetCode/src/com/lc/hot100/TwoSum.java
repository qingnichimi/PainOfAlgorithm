package com.lc.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author taoweishu
 * @Date 2023/03/23 16:29
 **/
public class TwoSum {

	/**
	 * https://leetcode.cn/problems/two-sum/
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] res = new int[2];
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				res[0] = i;
				res[1] = map.get(target - nums[i]);
				return res;
			}
			map.put(nums[i], i);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{2,7,11,15};
		int target = 9;
		int[] res = twoSum(nums, target);
		System.out.println("[" + res[0] + "," + res[1] + "]");
	}

}
