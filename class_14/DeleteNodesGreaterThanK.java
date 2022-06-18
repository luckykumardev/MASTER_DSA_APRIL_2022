package class_14;
/*
 https://practice.geeksforgeeks.org/problems/delete-nodes-greater-than-k/1/
*/
public class DeleteNodesGreaterThanK {
	 public TreeNode deleteNode(TreeNode root,int k)
     {
         if(root == null)
           return null;
        
        if(root.val >=k){
            return deleteNode(root.left, k);
        }
        else{
            root.right =  deleteNode(root.right, k);
        }
        
        return root;
     }

}
