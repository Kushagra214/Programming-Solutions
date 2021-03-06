import java.io.*;
import java.util.*;
public class BreathFirstSearch{

	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
 
	public static void exec_bfs(ArrayList<ArrayList<Integer>> adj,int v,boolean[] visited){
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		visited[v]=true;
		while(q.isEmpty()==false){
			System.out.print(q.poll()+" ");
			for(int u: adj.get(v)){
				if(visited[u]==false){
					visited[u]=true;
					q.add(u);
				}
			}

		}
	}

	public static void bfs(ArrayList<ArrayList<Integer>> adj, int v){
		boolean[] visited = new boolean[v];
		for(int i=0;i<v;i++){
			if(visited[i]==false)
				exec_bfs(adj, i , visited);
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i,v;
		v=5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(i=0;i<v;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,2);
    	addEdge(adj,3,4);

    	bfs(adj,v);
 		
	}
}