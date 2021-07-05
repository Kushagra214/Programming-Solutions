import java.io.*;
import java.util.*;
import java.lang.*;
public class valera_and_plates{
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,j,a,n,m,k,ct=0;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        for(i=0;i<n;i++){
            a = sc.nextInt();
            if(a==1){
                if(m!=0){
                    m--;
                }else{
                    ct++;
                }
            }else{
                if(k!=0){
                    k--;
                }else if(m!=0){
                    m--;
                }else{
                    ct++;
                }
            }
        }    
        System.out.println(ct);
    }
}