package class_10;

import java.util.ArrayList;
import java.util.List;

import class_16.Node;

public class postorder {
	 public List<Integer> postOrderTraversal(TreeNode root) {
	        List<Integer> ans = new ArrayList();
	        helper(root, ans);
	        return ans;
	    }
	    
	    private void helper(TreeNode root, List<Integer> ans){
	        if(root == null){
	            return;
	        }
	        helper(root.left, ans);
	        helper(root.right, ans);
	        ans.add(root.data); 
	    }

}
