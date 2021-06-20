import java.io.*;
import java.util.*;
import java.lang.*;
public class SuffixStructures{
 
    static int check(List<Character> list_min, List<Character> list_max){
        for(int i=0;i<list_min.size();i++){
            if(Collections.frequency(list_max,list_min.get(i))<Collections.frequency(list_min,list_min.get(i)))
                return 0;
        }
        return 1;
    }
 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
        List<Character> list_min = new ArrayList<>();
        List<Character> list_max =  new ArrayList<>();
		int i,n,t;
		String s = sc.next();
        String p = sc.next();
        char[] small= p.toCharArray();
        char[] large= s.toCharArray();
        for(int j=0;j<small.length;j++){
            list_min.add(small[j]);
        }
        for(int j=0;j<large.length;j++){
            list_max.add(large[j]);
        }
        if(check(list_min,list_max)==1){
            Collections.sort(list_min);
            Collections.sort(list_max);
                if(list_min.equals(list_max)){
                    System.out.println("array"); 
                }else{
                    n=0;
                    for(i=0;i<large.length&&n<small.length;i++)
                        if(small[n]==large[i])
                            n++;
                    if(n==small.length)
                        System.out.println("automaton");
                    else
                        System.out.println("both");
                }
        }else
            System.out.println("need tree");
	}
}