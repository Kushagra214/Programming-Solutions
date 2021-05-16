import java.io.*;
import java.util.*;
public class guess_a_number{
 
	public static void main(String args[]){
		int i=0,n,min=-1998638045,max=1998638045;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		while(i<n){
			String x = sc.nextLine();
			int ans = Math.max(x.indexOf('Y'), x.indexOf('N'));
			
			char ch = x.charAt(ans);
			
			int sp = x.indexOf(' ');
			
			String sym = x.substring(0,sp);
			
			int num = Integer.parseInt(x.substring(sp+1,ans-1));
 
			if(sym.equals(">=")){
				if(ch=='Y')
					min=Math.max(num,min);
				else
					max=Math.min(num-1,max);
			}
 
			else if(sym.equals("<")){
				if(ch=='Y')
					max=Math.min(num-1,max);
				else
					min=Math.max(num,min);
			}
 
			else if(sym.equals("<=")){
				if(ch=='Y')
					max=Math.min(num,max);
				else
					min=Math.max(num+1,min);
			}
			
			else if(sym.equals(">")){
				if(ch=='Y')
					min=Math.max(num+1,min);
				else
					max=Math.min(num,max);
			}
 
			i++;
		}
		
		if(max>=min){
			System.out.print(min);
		}else{
			System.out.print("Impossible");
		}
	}
}