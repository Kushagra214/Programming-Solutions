import java.io.*;
import java.util.*;

public class CyclicPermutation{

	static int countDigits(int n){
		int i,ct=0;
		while(n>0){
			ct++;
			n=n/10;
		}
		return ct;
	}

	static void permute(int n,int d){
		int num = n;

		while(true){

			int r = num%10;
			int div = num/10;
			num = (int)Math.pow(10,(d-1))*r+div;
			System.out.println(num);

			if(num==n)
				break;
		
		}

	}

	public static void main(String[] args) {

		int n = 1234;
		int num = countDigits(n);
		permute(n,num);
	}
	
}