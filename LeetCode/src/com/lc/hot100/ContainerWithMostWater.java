package com.lc.hot100;

/**
 * @Author taoweishu
 * @Date 2023/04/07 10:56
 **/
public class ContainerWithMostWater {
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int res = 0;
		while(left < right) {
			res = Math.max(res, (right - left) * Math.min(height[left], height[right]));
			if (height[left] > height[right]) {
				right--;
			} else {
				left++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] height = new int[]{1,8,6,2,5,4,8,3,7};
		int res = maxArea(height);
		System.out.println(res);
	}
}
