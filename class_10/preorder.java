package class_10;

import java.util.ArrayList;
import java.util.List;

import class_16.Node;

public class preorder {
	 public List<Integer> preOrderTraversal(TreeNode root) {
	        List<Integer> ans = new ArrayList();
	        helper(root, ans);
	        return ans;
	    }
	    
	    private void helper(TreeNode root, List<Integer> ans){
	        if(root == null){
	            return;
	        }
	        ans.add(root.data); 
	        helper(root.left, ans);
	        helper(root.right, ans);
	    }

}
