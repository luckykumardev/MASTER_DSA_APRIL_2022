package class_14;
/*
 https://leetcode.com/problems/kth-smallest-element-in-a-bst/	
*/

import java.util.LinkedList;
import java.util.Queue;

public class kthSmallestInBST {
	public int kthSmallest(TreeNode root, int k) {
	     Queue<TreeNode> q = new LinkedList<>();
	     inorder(root, q);
	      while(k-- > 1) q.poll();
	        
	        return q.peek().val;
	    }
	    
	    private static void inorder(TreeNode root, Queue<TreeNode> q){
	        if(root == null) return;
	        
	        inorder(root.left, q);
	        q.add(root);
	        inorder(root.right, q);
	        
	    }
	    
	    
/*	    public int kthSmallest(TreeNode root, int k) {
	        LinkedList<TreeNode> stack = new LinkedList<>();

	        while (true) {
	          while (root != null) {
	            stack.push(root);
	            root = root.left;
	          }
	          root = stack.pop();
	          if (--k == 0) return root.val;
	          root = root.right;
	        }
	      }*/
}
