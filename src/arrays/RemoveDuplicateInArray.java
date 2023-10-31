package arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		
//		int []a= {2,4,4,6,5,6};     // o/p :- 2 , 4 , 6 , 5
//		LinkedHashSet<Integer> set=new LinkedHashSet<>();
//		for(int i=0;i<a.length;i++) {
//			set.add(a[i]);
//		}
//		for(Integer inte:set) {
//			System.out.println(inte+ " ");
//			
//		}
		
		
		
		String st="vishaaal";
		         char[] s = st.toCharArray();
		     LinkedHashSet<Character> set= new LinkedHashSet<>();
		          
		     
		     for(int i=0 ; i<s.length ; i++) {
		    	       set.add(s[i]);
		     }
		     
		     for( Character ss:set) {
		    	 System.out.println(ss);
		    	 
		     }

	}

}
