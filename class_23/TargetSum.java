package class_23;

/*
 https://leetcode.com/problems/target-sum/
*/
public class TargetSum {

	public int findTargetSumWays(int[] nums, int target) {
		int count = rec(nums, target, 0, 0);
		return count;
	}

	private int rec(int nums[], int target, int i, int sum) {
		if (i == nums.length) {

			if (sum == target)
				return 1;
			else
				return 0;
		}

		int op1 = rec(nums, target, i + 1, sum + nums[i]);
		int op2 = rec(nums, target, i + 1, sum - nums[i]);

		return op1 + op2;
	}
}
