import java.io.*;
import java.util.*;

public class KadaneSubarrayIndex{


	static void fun(int[] a){

		int i,maxSum=Integer.MIN_VALUE,currSum=0,s=0,start=0,end=0;
		int n = a.length;

		for(i=0;i<n;i++){

			currSum+=a[i];

			if(maxSum<currSum){
				maxSum = currSum;
				start=s;
				end=i;
			}

			if(currSum<0){
				currSum=0;
				s=i+1;
			}
		}

		System.out.println("Maximum subarray sum is "+maxSum);
		System.out.println("Maximum Subarray Index is from "+start+" to "+end);
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