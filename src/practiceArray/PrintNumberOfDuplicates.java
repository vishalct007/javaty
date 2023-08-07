package practiceArray;

import java.util.LinkedHashSet;

public class PrintNumberOfDuplicates {
	public static void main(String[] args) {
		String s= "Tester";
		     String st = s.toLowerCase(); 
		     
		     LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
		     for(int i=0 ; i<st.length();i++) {
		    	 hs.add(st.charAt(i));
		     }
		     
		     for(Character ch:hs) {
		    	 int count=0;
		    	   for(int i= 0 ; i<st.length(); i++)
		    	   {
		    		   if(ch.equals(st.charAt(i)))
		    			   count++;
		    	   }
		     }
//		     
//		     if(count>1) {
//		    	 System.out.println();
//		     }
	}

}
