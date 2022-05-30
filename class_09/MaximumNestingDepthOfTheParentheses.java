package class_09;

import java.util.Stack;

/*
 https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
*/
public class MaximumNestingDepthOfTheParentheses {
	public int maxDepth(String st) {
		Stack<Character> s = new Stack<>();
		int n = st.length();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			char c = st.charAt(i);
			ans = Math.max(ans, s.size());
			if (c == '(') {
				s.push(c);
			} else if (c == ')') {
				s.pop();
			}
		}
		return ans;
	}
}
