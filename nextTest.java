import java.io.*;
import java.util.*;
public class nextTest{
 
	public static void main(String args[]){
		int i,n,f=0;
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		for(i=0;i<n;i++){
			if(list.get(i)!=i+1){
				System.out.print(i+1);
				f=1;
				System.exit(0);
			}
		}
		if(f==0){
			System.out.print(n+1);
		}
	}
}