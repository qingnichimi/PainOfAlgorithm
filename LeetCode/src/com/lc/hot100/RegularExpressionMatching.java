package com.lc.hot100;

/**
 * @Author taoweishu
 * @Date 2023/04/04 15:15
 **/
public class RegularExpressionMatching {
	public static boolean isMatch(String s, String p) {
		int n = s.length();
		int m = p.length();
		boolean[][] dp = new boolean[n + 1][m + 1];
		dp[0][0] = true;
		for(int j = 1; j <= m; j++) {
			if(p.charAt(j - 1) == '*') {
				dp[0][j] = dp[0][j - 2];
			}
		}
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
					dp[i][j] = dp[i - 1][j - 1];
				} else if(p.charAt(j - 1) == '*') {
					if(s.charAt(i - 1) != p.charAt(j - 2) && p.charAt(j - 2) != '.') {
						dp[i][j] = dp[i - 1][j -2];
					} else {
						dp[i][j] = dp[i][j - 2] || dp[i - 1][j];
					}
				}
			}
		}
		return dp[n][m];
	}
	public static void main(String[] args) {
		String s = "aa", p = "a*";
		boolean res = isMatch(s, p);
		System.out.println(res);
	}
}
