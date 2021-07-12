import java.util.*;
import java.io.*;
public class word{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,m,n,p,r,t,k,u;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        if (b>(m*a)){
            t=a*n;
        }else{
            p=n/m;
            r=n%m;
            if(r==0){
                t=p*b;
            }else{
                u=p*b+r*a;
                k=(p+1)*b;
                t= (u>k) ? k : u;
            }
        }
        System.out.print(t);
    }
}