import java.io.*;
import java.util.*;
public class Cows_and_primitive_roots{
 
	static int fun(int p){
		int c=0,n,i,f,x;
		for(i=1;i<p;i++){
			f=0;x=1;
			boolean res = false; 
			for(n=1;n<=p-1;n++){
				x=x*i;
				if((x-1)%p==0){
					f++;
					if(f==2)
						break;
					else if(n==p-1&&f==1){
						res = true;
						break;
					}
				}
				x=x%p;
			}
			if(res)
				c++;
		}
		return c;
	}
 
	public static void main(String args[]){
		int p;
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		System.out.print(fun(p));
	}
}