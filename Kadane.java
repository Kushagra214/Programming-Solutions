import java.io.*;
import java.util.*;

public class Kadane{


	

	public static void main(String[] args) {

		int arr[] = new int[]{1,-2,4,9,-10};
		System.out.println("Given array:");
		for(int i=0;i<5;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		fun(arr);
	}
	
}
