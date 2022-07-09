package class_20;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int vertex;
    int weight;
    Pair(int vertex, int weight){
        this.vertex = vertex;
        this.weight = weight;
    }
    public int compareTo(Pair o){
        return this.weight-o.weight;
    }
}

class PrimsAlgo

{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        int minCost=0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));
        boolean[] visited = new boolean[V];
        
        while(pq.size()>0){
           
        	Pair removed = pq.remove();
            
            if(visited[removed.vertex] == true){
                continue;
            }
            visited[removed.vertex]=true;
            
            minCost += removed.weight;
            
            for(ArrayList<Integer> e: adj.get(removed.vertex)){
                if(visited[e.get(0)] == false){
                    pq.add(new Pair(e.get(0),e.get(1)));
                }
            }
            
        }
        return minCost;
    }
}