import java.io.*;
import java.util.*;
public class nineteen{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l;
		double i,n,e,t;
		List<Character> list = new ArrayList<>();
		String s = sc.nextLine();
		s=s.toLowerCase();
		for(l=0;l<s.length();l++){
			list.add(s.charAt(l));
		}
		i=Collections.frequency(list,'i');
		e=Math.floor(Collections.frequency(list,'e')/3);
		t=Collections.frequency(list,'t');
		double v = Math.min(i,Math.min(e,t));
		n=Collections.frequency(list,'n');
		System.out.print((int)Math.min((n-3)/2+1,v));
	}
}