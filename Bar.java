import java.io.*;
import java.util.*;
public class Bar{
 
	static boolean fun(String s){
		List<String> alcohol = Arrays.asList("ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE");
		if(alcohol.contains(s)){
			return true;
		}else{
			try{
				int num = Integer.parseInt(s);
				if(num>=18)
					return false;
				else
					return true;
			}catch(NumberFormatException e){
				return false;
			}
		}
	}
 
 
	public static void main(String args[]){
		int n,i,c=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		for(i=0;i<n;i++){
			String s = sc.nextLine();
			boolean res = fun(s);
			if(res)
				c++;
		}
		System.out.print(c);
	}
}