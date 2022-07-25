package class_21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class ConnectingCitiesWithMinimumCost {

//	{parent, cv, weight}
	public int minimumCost(int N, int[][] connections) {
		List<List<int[]>> adjList = new ArrayList<>();
		PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[2] - b[2]);
		Set<Integer> visited = new HashSet<>();
		int costs = 0;

		for (int i = 0; i < N + 1; i++)
			adjList.add(new ArrayList<>());

		for (int[] conn : connections) {
			int n1 = conn[0], n2 = conn[1], cost = conn[2];
			adjList.get(n1).add(new int[] { n2, cost });
			adjList.get(n2).add(new int[] { n1, cost });
		}

		int parent[] = new int[N + 1];

		heap.add(new int[] { -1, 1, 0 });
		while (!heap.isEmpty()) {
			int[] conn = heap.poll();
			int par= conn[0], n = conn[1], cost = conn[2];

			if (!visited.contains(n)) {
				costs += cost;   
				visited.add(n); 
				parent[n] = par;
				for (int[] next : adjList.get(n)) {
					heap.add(new int[] { n, next[0], next[1] });
				}
			}
		}

		for (int i = 1; i <= N; i++) {
			System.out.println(i + " <----> " + parent[i]);
		}
		return visited.size() == N ? costs : -1;
	}
}
