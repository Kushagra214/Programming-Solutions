import java.io.*;
import java.util.*;
public class Sleuth{
 
	public static void main(String args[]){
		int i,l;
		String s;
		char ch;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		s=s.toLowerCase();
		ArrayList<String> list = new ArrayList<>();
		String a[] = s.split(" ");
		for(i=0;i<a.length;i++){
			list.add(a[i]);
		}
		l = list.size()-1;
		while(list.get(l).equals(" ")||list.get(l).equals("?")||list.get(l).equals("")){
			l--;
		}
		String p = list.get(l);
 
		ch = p.charAt(p.length()-1);
 
		if(ch=='?'){
			ch=p.charAt(p.length()-2);
		}
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y'){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}