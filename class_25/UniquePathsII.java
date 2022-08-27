package class_25;
/*

*/	
public class UniquePathsII {
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int ans = rec(obstacleGrid, 0, 0);
		return ans;
	}

	private static int rec(int grid[][], int cr, int cc) {
		int dr = grid.length - 1;
		int dc = grid[0].length - 1;
		if (cr > dr || cc > dc || grid[cr][cc] == 1)
			return 0;
		if (cr == dr && cc == dc) {
			return 1;
		}

		int op1 = rec(grid, cr + 1, cc);
		int op2 = rec(grid, cr, cc + 1);

		return op1 + op2;
	}
}