package com.lc.hot100;

import java.util.Stack;

/**
 * @Author taoweishu
 * @Date 2023/04/24 14:52
 **/
public class ValidParentheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(')');
			} else if (c == '[') {
				stack.push(']');
			} else if (c == '{') {
				stack.push('}');
			} else if (stack.isEmpty() || c != stack.pop()) {
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "()";
		System.out.println(isValid(s));
	}
}
