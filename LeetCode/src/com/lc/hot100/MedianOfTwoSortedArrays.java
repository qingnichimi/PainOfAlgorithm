package com.lc.hot100;

/**
 * @Author taoweishu
 * @Date 2023/03/30 16:32
 **/
public class MedianOfTwoSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		int left = (n + m + 1) / 2;
		int right = (n + m + 2) / 2;
		return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left) + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) / 2.0;
	}

	public static int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
		int len1 = end1 - start1 + 1;
		int len2 = end2 - start2 + 1;
		if (len1 > len2) {
			return getKth(nums2, start2, end2, nums1, start1, end1, k);
		}
		if (len1 == 0) {
			return nums2[start2 + k - 1];
		}
		if (k == 1) {
			return Math.min(nums1[start1], nums2[start2]);
		}
		int i = start1 + Math.min(end1, k / 2) - 1;
		int j = start2 + Math.min(end2, k / 2) - 1;

		if (nums1[i] > nums2[j]) {
			return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
		} else {
			return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
		}

	}

	public static void main(String[] args) {
		int[] nums1 = new int[]{1,4,5,7,9};
		int[] nums2 = new int[]{2,5,7,8,11,13};
		double res = findMedianSortedArrays(nums1, nums2);
		System.out.println(res);
	}
}
