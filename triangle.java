import java.io.*;
import java.util.*;
public class triangle{
 
	static Integer fun(int x1, int y1, int x2, int y2,int x3, int y3){
		double x,y,z;
		x = (Math.pow(Math.abs((x2-x1)),2)+Math.pow(Math.abs((y2-y1)),2));
		y = (Math.pow(Math.abs((x2-x3)),2)+Math.pow(Math.abs((y2-y3)),2));
		z = (Math.pow(Math.abs((x3-x1)),2)+Math.pow(Math.abs((y3-y1)),2));
		if(x==0||y==0||z==0){
			return 0;
		}
		if(x==y+z){
			return 1;
		}else if(y==x+z){
			return 1;
		}else if(z==x+y){
			return 1;
		}
		return 0;
	}
 
	public static void main(String args[])throws IOException{
		int i,n,x1,x2,x3,y1,y2,y3;
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		if(fun(x1,y1,x2,y2,x3,y3)==1){
			System.out.print("RIGHT");
		}else{
			list.add(fun(x1+1,y1,x2,y2,x3,y3));
			list.add(fun(x1-1,y1,x2,y2,x3,y3));
			list.add(fun(x1,y1+1,x2,y2,x3,y3));
			list.add(fun(x1,y1-1,x2,y2,x3,y3));
			list.add(fun(x1,y1,x2+1,y2,x3,y3));
			list.add(fun(x1,y1,x2-1,y2,x3,y3));
			list.add(fun(x1,y1,x2,y2+1,x3,y3));
			list.add(fun(x1,y1,x2,y2-1,x3,y3));
			list.add(fun(x1,y1,x2,y2,x3+1,y3));
			list.add(fun(x1,y1,x2,y2,x3-1,y3));
			list.add(fun(x1,y1,x2,y2,x3,y3+1));
			list.add(fun(x1,y1,x2,y2,x3,y3-1));
 
			if(list.contains(1)){
				System.out.print("ALMOST");
			}else
				System.out.print("NEITHER");
		}
	}
}
