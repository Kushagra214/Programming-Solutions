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

public class BTreeLevelNodes{
 
    public static void traverse(Node root, int k){
        if(root==null)
            return;
        if(k==0)
            System.out.print(root.data+" ");
        else{
            traverse(root.left,k-1);
            traverse(root.right,k-1);
        }
    }

    public static void main(String args[]){

        //             10

        //     20             30

        // 40      50    60        70

        //     80

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.left.right.left = new Node(80);

        traverse(root,2);

    }
}