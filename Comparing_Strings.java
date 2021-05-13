import java.io.*;
import java.util.*;
public class Comparing_Strings{
 
	static void exec(String a, String b, ArrayList<Integer> list, int l1){
		int x=list.get(0);
		int y=list.get(1);
		char ch1,ch2;
		String str="";
		ch1=a.charAt(x);
		ch2=a.charAt(y);
		str = a.substring(0,x)+ch2+a.substring(x+1,y)+ch1+a.substring(y+1);
		if(str.equals(b)){
			System.out.print("YES");
		}else{
			System.out.print("NO");
		}
	}
 
	public static void main(String args[]){
		int i,l1,l2;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		String a,b,str="";
		char cha,chb,ch;
		a = sc.nextLine();
		b = sc.nextLine();
		l1 = a.length();
		l2 = b.length();
		if(l1==l2){
			for(i=0;i<l1;i++){
				cha=a.charAt(i);
				chb=b.charAt(i);
				if(cha!=chb){
					list.add(i);
				}
			}
			if(list.size()==2){
				exec(a,b,list,l1);
			}else{
				System.out.print("NO");
				System.exit(0);
			}
 
		}else{
			System.out.print("NO");
			System.exit(0);
		}
	}
}