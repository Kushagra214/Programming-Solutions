import java.io.*;
import java.util.*;
public class Worms_evolution{
 
	public static void main(String args[]){
		int n,i,j,k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(i=0;i<n-2;i++){
			for(j=i+1;j<n-1;j++){
				for(k=j+1;k<n;k++){
					if(a[k]==a[i]+a[j]){
						System.out.print(++k+" "+(++i)+" "+(++j));
						System.exit(0);
					}else if(a[i]==a[j]+a[k]){
						System.out.print(++i+" "+(++j)+" "+(++k));
						System.exit(0);
					}
					else if(a[j]==a[i]+a[k]){
						System.out.print(++j+" "+(++i)+" "+(++k));
						System.exit(0);
					}
				}
			}
		}
		System.out.print("-1");
	}
}