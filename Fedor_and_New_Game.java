import java.io.*;
import java.util.*;
import java.lang.*;
public class Fedor_and_New_Game{

	static boolean check(String s, String p, int k){
		int i,ct=0;
		char ch1, ch2;
		for(i=0;i<p.length();i++){
			ch1 = p.charAt(i);
			if(s.length()>i){
				ch2 = s.charAt(i);
				if(ch1!=ch2)
					ct++;
			}else{
				if(ch1=='1')
					ct++;
			}
		}
		if(s.length()>p.length()){
			for(i=p.length();i<s.length();i++){
				if(s.charAt(i)=='1')
					ct++;
			}
		}
		if(ct>k)
			return false;
		return true;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i,j,n,m,k,ct=0;
		List<String> l = new ArrayList<>();
		n=sc.nextInt(); 
		m=sc.nextInt(); 
		k=sc.nextInt();
		for(i=0;i<=m;i++){
			l.add(Integer.toBinaryString(sc.nextInt()));
		}
		String last = l.get(m);
		l.remove(m);
		for(i=0;i<m;i++){
			StringBuilder input1 = new StringBuilder();
			StringBuilder input2 = new StringBuilder();
			input1.append(l.get(i));
			input2.append(last);
		    boolean res=check(input1.reverse().toString(),input2.reverse().toString(),k);
		    if(res)
		    	ct++;
		}
		System.out.print(ct);
	}
}