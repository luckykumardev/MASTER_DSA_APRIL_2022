package class_15;

public class DFS {
	
	public static void printHelper(int adj_mat[][], int sv,  boolean visited[]) {
		System.out.println(sv);
		visited[sv] = true;
		int v = adj_mat.length;
		for(int i =0; i <v; i++) {
			if(adj_mat[sv][i] == 1 && visited[i] == false)
				printHelper(adj_mat, i, visited);		 
		}
	}
    
	private static void print(int[][] adj_mat) {
	    int v = adj_mat.length;
	    boolean visited[] = new boolean[v];
	    for(int i =0; i<v; i++){
	    	if(visited[i] == false){
	    		printHelper(adj_mat, i, visited);
	    	}
	    }
	}
     
	
	public static void main(String[] args) {
	  int adj_mat[][] = { 
			             {0, 1, 0, 1, 0},
			             {1, 0, 1, 0, 0},
			             {0, 1, 0, 1, 0},
			             {1, 0, 1, 0, 0},
			             {0, 0, 0, 0, 0}
			            };
	  print(adj_mat);
	}
	
		
}
