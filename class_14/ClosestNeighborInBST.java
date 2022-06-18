package class_14;

/*
 https://practice.geeksforgeeks.org/problems/closest-neighbor-in-bst/1/
*/
public class ClosestNeighborInBST {
	public static int findMaxForN(TreeNode node, int v) {

		if (node == null)
			return -1;
		int ans = -1;
		while (node != null) {
			if (node.val <= v) {
				ans = node.val;
				node = node.right;
			} else {
				node = node.left;
			}
		}

		return ans;
	}
}