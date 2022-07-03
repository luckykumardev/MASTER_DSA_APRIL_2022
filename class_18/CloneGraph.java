package class_18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}



public class CloneGraph {
	public Node cloneGraph(Node node) {
		if (node == null)
			return null;
		HashMap<Node, Node> hm = new HashMap<>();
		Queue<Node> q = new LinkedList<>();
		hm.put(node, new Node(node.val));
		q.add(node);
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				Node temp = q.poll();
				List<Node> children = temp.neighbors;
				for (int k = 0; k < children.size(); k++) {
					if (hm.containsKey(children.get(k)) == false) {
						q.add(children.get(k));
						hm.put(children.get(k), new Node(children.get(k).val));
					}
					hm.get(temp).neighbors.add(hm.get(children.get(k)));

				}
			}
		}

		return hm.get(node);
	}
}
