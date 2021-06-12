import java.io.*;
import java.util.*;
public class Friends_and_candies{
 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i,k;
		List<Integer> fl =new ArrayList<>();
		k = sc.nextInt();
		for(i=0;i<k;i++){
			List<Integer> l =new ArrayList<>();
			int n = sc.nextInt();
			int j,ct = 0,sum=0;
			for(j=0;j<n;j++){
				int e = sc.nextInt();
				l.add(e);
				sum+=e;
			}
			if(sum%n!=0)
				fl.add(-1);
			else{
				for(j=0;j<n;j++){
					if(l.get(j)>(sum/n))
						ct++;
				}
				fl.add(ct);
			}	
		}
		for(i=0;i<k;i++)
			System.out.println(fl.get(i));
	}
}
