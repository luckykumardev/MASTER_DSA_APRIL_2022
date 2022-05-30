package class_08;

/*
  https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1
*/
public class Stack_Implementation_using_LinkedList {
    
	public class Node {
		int data;
		Node prev;

		Node(int x) {
			data = x;
			prev = null;
		}
	}

    Node top;

    Stack_Implementation_using_LinkedList()
	{
      this.top = null;
	}
	
	void push(int a)
	{
        Node temp = new Node(a);
        temp.prev = top;
        top = temp;
	} 
    
    int pop()
	{
    	
   	  if(top== null) return -1;
      int ans = top.data;
      top = top.prev;
   	   return ans;
	}
	
}
