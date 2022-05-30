package class_10;

import java.util.ArrayList;
import java.util.List;

import class_16.Node;

/*
 https://leetcode.com/problems/binary-tree-inorder-traversal/
*/
public class Inorder {

	 public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> ans = new ArrayList();
	        helper(root, ans);
	        return ans;
	    }
	    
	    private void helper(TreeNode root, List<Integer> ans){
	        if(root == null){
	            return;
	        }
	        helper(root.left, ans);
	        ans.add(root.data);
	        helper(root.right, ans);
	        
	    }

}
