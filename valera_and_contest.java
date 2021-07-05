import java.io.*;
import java.util.*;
import java.lang.*;
public class valera_and_contest{
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,j,n,k,l,r,sa,sk,ct=0;
        n = sc.nextInt();
        k = sc.nextInt();
        l = sc.nextInt();
        r = sc.nextInt();
        sa = sc.nextInt();
        sk = sc.nextInt();
        int[] a = new int[n];
        for(i=0;i<k;i++){
            a[i] = sk/k;
        }
        i=1;
        int t = sk%k;
        while(t>0){
            a[i]++;
            t--;
            i++;
        }
        if(k!=n){
            for(i=k;i<n;i++){
                a[i]=(sa-sk)/(n-k);
            }
            t = (sa-sk)%(n-k);
            i=k+1;
            while(t>0){
                a[i]++;
                i++;
                t--;
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}