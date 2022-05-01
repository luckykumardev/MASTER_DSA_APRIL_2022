package class_03;

/*
 https://leetcode.com/problems/search-insert-position/
*/
public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (nums[m] == target)
				return m;
			else if (nums[m] > target) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return l;
	}
}
