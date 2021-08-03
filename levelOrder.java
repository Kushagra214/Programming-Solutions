import java.io.*;
import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	Node(int key){
		data = key;
		left=right=null;
	}
}

public class levelOrder{


	public static void traversal(Node root){
		if(root==null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(q.isEmpty()==false){
			Node temp = q.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}


	public static void main(String[] args) {
		
		Node node = new Node(10);
		node.left = new Node(30);
		node.right = new Node(50);
		node.left.left = new Node(70);
		node.left.right = new Node(90);	
		node.right.left = new Node(110);
		node.right.right = new Node(130);

		traversal(node);
	}
	
}