import java.io.*;
import java.util.*;

public class DepthFirstSearch{

	public static void addEdge(ArrayList<ArrayList<Integer>> adj,int v, int u){
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	static void exec_dfs(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visited){
		visited[v]=true;
		System.out.print(v+" ");
		for(int u: adj.get(v)){
			if(visited[u]==false){
				exec_dfs(adj,u,visited);
			}
		}
	}


	static void dfs(ArrayList<ArrayList<Integer>> adj, int v){
		boolean[] visited = new boolean[v];
		for(int i=0;i<v;i++){
			if(visited[i]==false)
				exec_dfs(adj,i,visited);
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,v;
		v=6;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(i=0;i<v;i++)
			adj.add(new ArrayList<Integer>());

		addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,3);
    	addEdge(adj,1,4);
    	addEdge(adj,3,2);
    	addEdge(adj,2,0);
    	addEdge(adj,4,5);

    	dfs(adj,v);

	}
}