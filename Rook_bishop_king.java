import java.io.*;
import java.util.*;
public class Rook_bishop_king{
 
	static int fun(int x1, int y1, int x2, int y2){
		int move2=0,t=y1;
		if(x1>x2){
			if(y1>y2)
				t-=Math.abs(x2-x1);
			else
				t+=Math.abs(x2-x1);
		}
		else{
			if(y1>y2)
				t-=Math.abs(x2-x1);
			else
				t+=Math.abs(x2-x1);
		}
		move2+=Math.abs(x2-x1);
		x1=x2;
		y1=t;
		if(y1!=y2){
			move2+=Math.abs(y2-y1);
		}
		return move2;
	}
 
 
	public static void main(String args[]){
		int i=1,n,r1,c1,r2,c2,x1,x2,y1,y2;
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		while(i<=3){
			switch(i){
				case 1:{
					//Rook
					r1=x1;r2=x2;c1=y1;c2=y2;
					int a,b,move=0;
					while(r1!=r2||c1!=c2){
						if(r1!=r2){
							r1=r2;
						}else if(c1!=c2){
							c1=c2;
						}
						move++;
					}
					System.out.print(move+" ");
					break;
				}
				case 2:{
					//bishop
					r1=x1;r2=x2;c1=y1;c2=y2;
					int move=0;
					if((r1+c1==r2+c2)||(r1==c1&&r2==c2)||(Math.abs(r2-r1)==Math.abs(c2-c1))){
						r1=r2;
						c1=c2;
						move=1;
					}else if((((r1%2==0&&r2%2==0)||(r1%2!=0&&r2%2!=0))&&((c1%2!=0&&c2%2==0)||(c1%2==0&&c2%2!=0)))||(((c1%2==0&&c2%2==0)||(c1%2!=0&&c2%2!=0))&&((r1%2!=0&&r2%2==0)||(r1%2==0&&r2%2!=0)))){
						move=0;
					}else{
						move=2;
					}
					System.out.print(move+" ");
					break;
				}
				case 3:{
					//king
					r1=x1;r2=x2;c1=y1;c2=y2;
					int move;
					if((Math.abs(r2-r1)==Math.abs(c2-c1))){
						move = Math.abs(r2-r1);
					}else{
						int move1=0,move2;
						if(r1!=r2){
							move1+=Math.abs(r2-r1);
						}
						if(c1!=c2){
							move1+=Math.abs(c2-c1);
						}
 
						if(Math.abs(x1-x2)<Math.abs(y1-y2))
							move2=fun(x1,y1,x2,y2);
						else
							move2=fun(y1,x1,y2,x2);
 
						move = Math.min(move1,move2);
					}
					System.out.print(move);
					break;
				}
			}
			i++;
		}
		
	}
}