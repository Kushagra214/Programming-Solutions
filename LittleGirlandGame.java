import java.io.*;
import java.util.*;
import java.lang.*;
public class LittleGirlandGame{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//ArrayList<Character> list = new ArrayList<>();
        int i,odd=0;
        int[] c = new int[26];
        String s = sc.nextLine();
        for(i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
        }

        for(i=0;i<26;i++)
            if((c[i]&1)==1)
                odd++;

        if(odd==0||(odd&1)==1)
            System.out.print("First");
        else
            System.out.print("Second");

	}
}