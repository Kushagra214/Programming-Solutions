import java.io.*;
import java.util.*;

public class Kadane{


	static void fun(int[] a){

		int i,maxSum=Integer.MIN_VALUE,currSum=0;
		int n = a.length;

		for(i=0;i<n;i++){
			currSum+=a[i];
			if(currSum<0)
				currSum=0;
			maxSum = Math.max(maxSum,currSum);
		}

		System.out.println("Maximum subarray sum is "+maxSum);
	}

	public static void main(String[] args) {

		int arr[] = new int[]{1,-2,4,9,-10};
		System.out.println("Given array:");
		for(int i=0;i<5;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		fun(arr);
	}
	
}
