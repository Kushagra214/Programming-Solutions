import java.io.*;
import java.util.*;
public class FairPlayoff{
 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
		List<String> list = new ArrayList<>();
		int i,s;
		s =sc.nextInt();
		for(i=0;i<s;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if(Math.max(a,b)<Math.min(c,d)||Math.max(c,d)<Math.min(a,b))
				list.add("NO");
			else
				list.add("YES");
		}
		for(i=0;i<s;i++){
			System.out.println(list.get(i));
		}
	}
}