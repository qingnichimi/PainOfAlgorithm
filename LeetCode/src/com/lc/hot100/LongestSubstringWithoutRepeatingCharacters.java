package com.lc.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author taoweishu
 * @Date 2023/03/26 08:33
 **/
public class LongestSubstringWithoutRepeatingCharacters {

	/**
	 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/
	 * @param s
	 * @return
	 */
	public static int longestSubstringWithoutRepeatingCharacters(String s) {
		int res = 0;
		Map<Character, Integer> map = new HashMap<>();
		int start = 0, end = 0;
		while(end < s.length()- 1) {
			char cur = s.charAt(end);
			if(map.containsKey(cur)) {
				start = Math.max(start, map.get(cur) + 1);
			}
			map.put(cur, end);
			res = Math.max(res, end - start + 1);
			end++;
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "abcabcbb";
		int res = longestSubstringWithoutRepeatingCharacters(s);
		System.out.println(res);

	}
}
