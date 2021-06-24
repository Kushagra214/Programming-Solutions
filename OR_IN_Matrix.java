import java.io.*;
import java.util.*;
import java.lang.*;
public class OR_IN_Matrix{
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        int i,j,m,n,t;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                b[i][j] = sc.nextInt();
                a[i][j]=1;
                c[i][j]=0;
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(b[i][j]==0){
                    for(t=0;t<m;t++){
                        a[t][j]=0;
                    }
                    for(t=0;t<n;t++){
                        a[i][t]=0;
                    }
                }
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                for(t=0;t<m;t++){
                    c[i][j] = c[i][j] | a[t][j];
                }
                for(t=0;t<n;t++){
                    c[i][j] = c[i][j] | a[i][t];
                }
                if(c[i][j]!=b[i][j]){
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        System.out.println("YES");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}