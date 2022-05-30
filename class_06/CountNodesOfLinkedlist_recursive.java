package class_06;

/*
 * https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1
 *
 */

public class CountNodesOfLinkedlist_recursive {
	
	public static int getCount(Node head) {
		int ans = count(head);
		return ans;
	}

	private static int count(Node head) {
		if (head == null)
			return 0;
		return 1 + count(head.next);
	}
}
