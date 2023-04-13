package com.lc.hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author taoweishu
 * @Date 2023/04/13 11:33
 **/
public class LetterCombinationsOfAPhoneNumber {
	public static List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<>();
		if (digits.length() == 0) {
			return res;
		}
		Map<Character, String> map =  new HashMap<Character, String>(){
			{
				put('2',"abc");
				put('3',"def");
				put('4',"ghi");
				put('5',"jkl");
				put('6',"mno");
				put('7',"pqrs");
				put('8',"tuv");
				put('9',"wxyz");
			}
		};
		backTrack(res, digits, map, 0, new StringBuilder());
		return res;
	}
	public static void backTrack(List<String> res, String digits, Map<Character, String> map, int index, StringBuilder sb) {
		if (index == digits.length()) {
			res.add(sb.toString());
		} else {
			String s = map.get(digits.charAt(index));
			for(int i = 0; i < s.length(); i++) {
				sb.append(s.charAt(i));
				backTrack(res, digits, map, index + 1, sb);
				sb.deleteCharAt(index);
			}
		}
	}
	public static void main(String[] args) {
		String digits = "23";
		List<String> res = letterCombinations(digits);
		res.forEach(item -> System.out.print(item + " "));
	}
}
