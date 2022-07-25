package class_24;

public class ClimbingStairs {
	public int climbStairs(int n) {
		int ans = rec(n);
		return ans;
	}

	private static int rec(int n) {
		if (n <= 1)
			return 1;
		int op1 = rec(n - 1);
		int op2 = rec(n - 2);
		return op1 + op2;
	}
}
