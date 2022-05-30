package class_06;

public class SearchAnElementInALinkedList {

	public static boolean search(Node head, int x) {
		Node current = head;
		while (current != null) {
			if (current.data == x)
				return true;
			current = current.next;
		}
		return false;
	}

	public static void main(String args[]) {

		Node head = new Node(1);
		Node newNode = new Node(2);
		Node newNode2 = new Node(3);

		head.next = newNode;
		newNode.next = newNode2;

		if (search(head, 2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
