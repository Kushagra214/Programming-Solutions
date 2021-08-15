import java.util.*;
import java.lang.*;
import java.io.*;

class FreqSort{
    
  public static <K, V extends Comparable<V> > TreeMap<K, V> valueSort(final TreeMap<K, V> map)
  {

      Comparator<K> valueComparator = new Comparator<K>() {
          
            public int compare(K k1, K k2)
            {
                int comp = map.get(k1).compareTo(map.get(k2));
                if (comp == 0)
                    return 1;
                else
                    return -1*comp;
            }
      };
      
      TreeMap<K, V> sorted = new TreeMap<K, V>(valueComparator);
      
      sorted.putAll(map);
      
      return sorted;
  }
    
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
            int i,j;
		    int n = sc.nextInt();
		    ArrayList<Integer> list = new ArrayList<>();
		    for(i=0;i<n;i++){
		        list.add(sc.nextInt());
		    }
		    
		    TreeMap<Integer,Integer> map = new TreeMap<>();
		    for(i=0;i<n;i++){
		        map.put(list.get(i),(map.getOrDefault(list.get(i),0)+1));
		    }
		    
		    TreeMap sortedMap = valueSort(map);
		    
		    map = sortedMap;
		    
		    int k,v;
		    for(Map.Entry<Integer, Integer> e: map.entrySet()){
		        k = e.getKey();
		        v = e.getValue();
		        for(i=0;i<v;i++){
		            System.out.print(k+" ");
		        }
		    }
		    System.out.println();
		    
		}
	}
}