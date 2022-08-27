package class_29;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

public class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance {

	class Edge {
	    int to;
	    int weight;
	    
	    public Edge(int to, int weight){
	        this.to = to;
	        this.weight = weight;
	    }
	    
	}
	class Solution {
	    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
	        
	        LinkedList<Edge>[] graph = new LinkedList[n];
	        
	        for(int i = 0; i < graph.length; i++){
	            graph[i] = new LinkedList<>();
	        }
	        for(int[] edge : edges){
	            graph[edge[0]].add(new Edge(edge[1],edge[2]));
	            graph[edge[1]].add(new Edge(edge[0],edge[2]));
	        }
	        
	        int maxVertex = -1;
	        int maxNodes = n+1;
	        for(int i = 0; i < n; i++){
	            int visits = bfs(graph,i,distanceThreshold);
	            if(visits <= maxNodes){
	                maxVertex = i;
	                maxNodes = Math.min(maxNodes,visits);
	            }
	        }
	        
	        return maxVertex;
	    }
	    
	    public int bfs(LinkedList<Edge>[] graph, int vertex, int thresh){
	        Map<Integer,Integer> map = new HashMap<>(); 
	        
	        PriorityQueue<Edge> pq = new PriorityQueue<>((Edge a, Edge b) -> (a.weight - b.weight));
	        pq.offer(new Edge(vertex,0));
	       
	        while(!pq.isEmpty()){
	            Edge edge = pq.remove();
	            if(map.containsKey(edge.to) && edge.weight > map.get(edge.to)) continue;
	            map.put(edge.to,edge.weight);
	            
	            for(Edge e : graph[edge.to]){
	                int dist = e.weight + edge.weight;
	                if(dist  > thresh) continue;
	                if(!map.containsKey(e.to) || (map.get(e.to) > dist)){
	                    map.put(e.to,dist);
	                    pq.offer(new Edge(e.to,dist));
	                }
	            }
	        }
	        
	        return map.size() - 1;
	    }

	}
	
}
