package class_06;

/*
 https://leetcode.com/problems/linked-list-cycle/	
*/
public class LinkedListCycle {
	public boolean hasCycle(Node head) {
		if (head == null)
			return false;
	    Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			if (fast.next == slow)
				return true;
			slow = slow.next;
			fast = fast.next.next;
		}

		return false;
	}
}
