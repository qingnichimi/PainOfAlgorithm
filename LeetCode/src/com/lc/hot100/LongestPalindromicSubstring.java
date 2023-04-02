package com.lc.hot100;

/**
 * @Author taoweishu
 * @Date 2023/04/02 08:24
 **/
public class LongestPalindromicSubstring {
	public static String longestPalindrome(String s) {
		String res = "";
		for(int i = 0; i < s.length(); i++) {
			String res1 = palindrome(s, i, i);
			String res2 = palindrome(s, i, i + 1);
			res = res.length() > res1.length()? res : res1;
			res = res.length() > res2.length()? res : res2;
		}
		return res;
	}

	public static String palindrome(String s, int left, int right) {
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

	public static void main(String[] args) {
		String s = "babad";
		String res = longestPalindrome(s);
		System.out.println(res);
	}
}
