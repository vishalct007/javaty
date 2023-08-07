package strings;

import java.util.LinkedHashSet;

public class Int {

	public static void main(String[] args) {
		String s="Vishaal";
		   String st = s.toLowerCase();
		  LinkedHashSet<Character> set=new LinkedHashSet<>(); 
		   for(int i=0 ; i<st.length() ; i++) {
			   set.add(st.charAt(i));
		   }
		   
		   for(Character str:set) {
			   int count=0;
			     for(int i=0 ; i<st.length(); i++) {
			    	 if(str==st.charAt(i)) {
			    		 count++;
			    	 }
			     }
			     
			     if(count>1) {
			    	 System.out.println(str+" is repeating " + count + " times ");
			     }
		   }

	}

}
