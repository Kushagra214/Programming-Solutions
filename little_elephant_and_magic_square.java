import java.io.*;
import java.util.*;
import java.lang.*;
public class little_elephant_and_magic_square{
 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
        int[][] a = new int[3][3];
        int i,j,sum=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                int x = sc.nextInt();
                a[i][j] = x;
                sum+=x;
            }
        }
        sum/=2;
        a[0][0]=sum-a[0][1]-a[0][2];
        a[1][1]=sum-a[1][0]-a[1][2];
        a[2][2]=sum-a[2][0]-a[2][1];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
	}
}