package class_31;

import java.util.ArrayList;
import java.util.List;

import class_14.TreeNode;

/*
 https://leetcode.com/problems/binary-tree-paths/
*/
public class BinaryTreePaths {	
	  public List<String> binaryTreePaths(TreeNode root) {
	        List<String> res = new ArrayList<>();    
	        if(root == null) return res;
	        findPath(root, res, "");
	        
	        return res;
	    }
	    
	    private static void findPath(TreeNode root, List<String> res, String s){
	        if(root == null) return;
	        if(root.left == null && root.right == null){
	            res.add(s+root.val);
	            return;
	        }
	        s = s + root.val+"->";
	        findPath(root.left,  res, s);
	        findPath(root.right, res, s);
	    }
}