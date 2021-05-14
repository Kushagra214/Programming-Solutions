import java.io.*;
import java.util.*;
public class Point_on_spiral{

	public static void main(String args[]){
		int i,x,y,j=0,k=0,t=1,f=0,ct=0,u=0,v=0,count=0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();

		while(true){
			if(ct%2==0){
				if(f==0){
					u = j+t;
				}else{
					u=j-t;
				}
				ct++;
				count++;
			}else{
				if(f==0){
					v = k+t;
				}else{
					v=k-t;
				}
				ct++;
				count++;
			}
			if(ct==2){
				t++;
				ct=0;
				if(f==0){
					f=1;
				}else{
					f=0;
				}
			}

			if(j==u && u==x){
				if((k>=y&&v<=y)||(v>=y&&k<=y)){
					System.out.print(count-1);
					break;
				}
			}else if(k==v && v==y){
				if((j>=x&&u<=x)||(j<=x&&u>=x)){
					System.out.print(count-1);
					break;
				}
			}
			j=u;
			k=v;
		}
	}
}