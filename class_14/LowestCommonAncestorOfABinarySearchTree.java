package class_14;

/*
 https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
*/
public class LowestCommonAncestorOfABinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		int min = Math.min(p.val, q.val);
		int max = Math.max(p.val, q.val);
		while (root != null) {
			if (root.val < min)
				root = root.right;
			else if (root.val > max)
				root = root.left;
			else
				return root;
		}
		return root;
	}
}
