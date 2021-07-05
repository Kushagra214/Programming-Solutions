import java.io.*;
import java.util.*;
import java.lang.*;
public class letters{
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        long[] a = new long[n];
        for(i=0;i<n;i++){
            a[i] = sc.nextLong();
        }
        int x=1;
        long suma=a[x-1];
        long sumb = 0;
        for(i=0;i<m;i++){
            long b = sc.nextLong();
            if(b<=suma){
                System.out.println(x+" "+(b-sumb));
            }else if(b>suma){
                while(b>suma){
                    x++;
                    suma+=a[x-1];
                    if((x-2)>=0)
                        sumb+=a[x-2];
                    else
                        sumb+=0;
                }
                System.out.println(x+" "+(b-sumb));
            }
        }       
    }
}