package class_18;
/*
 https://www.lintcode.com/problem/663/
*/
import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {
	class Pair {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public void wallsAndGates(int[][] rooms) {

		Queue<Pair> q = new LinkedList<>();
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[0].length; j++) {
				int cell = rooms[i][j];
				if (cell == 0) {
					q.add(new Pair(i, j));
				}
			}
		}

		int dir[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		while (!q.isEmpty()) {
			Pair temp = q.poll();
			for (int i = 0; i < 4; i++) {
				int X = temp.x + dir[i][0];
				int Y = temp.y + dir[i][1];

				if (X < 0 || X >= rooms.length || Y < 0 || Y >= rooms[0].length || rooms[X][Y] != Integer.MAX_VALUE)
					continue;

				rooms[X][Y] = rooms[temp.x][temp.y] + 1;
				q.add(new Pair(X, Y));
			}
		}
	}

	// private void DFS(int rooms[][], int i, int j, int dis){
	// int r = rooms.length;
	// int c = rooms[0].length;
	// if(i < 0 || i >=r || j <0 || j >=c || rooms[i][j] == -1 || rooms[i][j] <
	// dis)
	// return;

	// rooms[i][j] = dis;
	// DFS(rooms, i, j+1, dis+1);
	// DFS(rooms, i+1, j, dis+1);
	// DFS(rooms, i-1, j, dis+1);
	// DFS(rooms, i, j-1, dis+1);
	// }
}
