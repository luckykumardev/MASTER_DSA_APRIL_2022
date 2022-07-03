package class_18;
/*
 https://leetcode.com/problems/is-graph-bipartite/
*/
public class IsBipartite {
	public boolean isBipartite(int[][] graph) {
		int v = graph.length;
		int color[] = new int[v];
		for (int i = 0; i < v; i++) {
			if (color[i] == 0) {
				boolean ans = DFS(graph, i, color, 1);
				if (ans == false)
					return false;
			}
		}
		return true;
	}

	private static boolean DFS(int[][] graph, int i, int color[], int c) {
		color[i] = c;
		int len = graph[i].length;
		for (int k = 0; k < len; k++) {
			int curr = graph[i][k];
			if (color[curr] == 0) {
				boolean ans = DFS(graph, curr, color, -1 * c);
				if (ans == false)
					return false;
			} else if (color[curr] == color[i])
				return false;

		}

		return true;
	}
}
