import java.io.*;
import java.util.*;
import java.lang.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int k){
        data=k;
        left=null;
        right=null;
    }
}

public class BTreeHeight{
 
    public static int height(Node root){
        if(root==null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.left.right.left = new Node(80);

        System.out.println(height(root));
    }
}