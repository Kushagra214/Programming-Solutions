import java.io.*;
import java.util.*;

public class shortestPath{

	public static void addEdge(ArrayList<ArrayList<Integer>> adj,int v, int u){
		adj.get(u).add(v);
		adj.get(v).add(u);
	}


	static void sPath(ArrayList<ArrayList<Integer>> adj,int v, int s, boolean[] visited, int[] sDistance){
		
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		sDistance[s]=0;
		visited[s]=true;
		while(q.isEmpty()==false){
			
			int x=q.poll();

			for(int u:adj.get(x)){
				if(visited[u]==false){
					sDistance[u]=sDistance[x]+1;
					visited[u]=true;
					q.add(u);
				}
			}
		}

		for(int i=0;i<v;i++){
			System.out.print(sDistance[i]+" ");
		} 
	}


	static void path(ArrayList<ArrayList<Integer>> adj,int v, int s){
		boolean[] visited = new boolean[v];
		int[] distance = new int[v];
		Arrays.fill(distance,Integer.MAX_VALUE);
		sPath(adj,v,s,visited,distance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,v,s;
		v=4;
		s=0;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(i=0;i<v;i++)
			adj.add(new ArrayList<Integer>());

		addEdge(adj,0,1); 
    	addEdge(adj,1,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,3);

    	path(adj,v,s);
	}
}