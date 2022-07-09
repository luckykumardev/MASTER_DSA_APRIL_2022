package class_19;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
	  class Land{
	        int x;
	        int y;
	        Land(int x, int y){
	            this.x = x;
	            this.y = y;
	        }
	    }
	    
	    public int shortestBridge(int[][] grid) {
	        int r = grid.length;
	        int c = grid[0].length;
	        boolean visited[][] = new boolean[r][c];
	        Queue<Land> q = new LinkedList<>();
	        boolean firstIslandVisited = false;
	        for(int i =0; i <r; i++){
	            for(int j =0;j <c; j++){
	                if(grid[i][j] == 1){
	                    visitIslandAndAddInQueue(i, j, grid, visited, q);                   
	                    firstIslandVisited = true;
	                    break;
	                }
	            }
	            
	            if(firstIslandVisited)
	                 break;
	        }
	        int dir[][] = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	        
	        int bridgelength = 0;
	        while(!q.isEmpty()){
	            int size = q.size();
	            for(int i =0; i <size; i++){
	                Land temp = q.poll();
	                for(int j =0; j <4; j++){
	                  int X = temp.x + dir[j][0];
	                  int Y = temp.y + dir[j][1];
	                
	                    if(X <0 || X >=r || Y<0 || Y >=c ||  visited[X][Y])
	                        continue;
	                    
	                    visited[X][Y] = true;
	                    if(grid[X][Y] == 1)
	                       return bridgelength;
	               
	                    grid[X][Y] = 1;
	                    q.add(new Land(X, Y));
	                }
	                
	            }
	            
	                bridgelength++;
	        
	        }
	        
	        return bridgelength;
	        
	    }
	    
	    private void visitIslandAndAddInQueue(int i, int j, int grid[][], boolean visited[][], Queue<Land> q){
	        int r = visited.length;
	        int c = visited[0].length;
	        
	        if(i <0 ||  i >=r || j <0 || j >= c || grid[i][j] == 0 || visited[i][j])
	            return;
	        
	        visited[i][j] = true;
	        q.add(new Land(i, j));
	        visitIslandAndAddInQueue(i+1, j, grid, visited, q);                   
	        visitIslandAndAddInQueue(i, j+1, grid, visited, q);                   
	        visitIslandAndAddInQueue(i-1, j, grid, visited, q);                   
	        visitIslandAndAddInQueue(i, j-1, grid, visited, q);                   
	    }
}
