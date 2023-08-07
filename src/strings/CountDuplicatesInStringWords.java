package strings;

import java.util.LinkedHashSet;

public class CountDuplicatesInStringWords {

	public static void main(String[] args) {
		String st= " my name is is vishal";
		    String[] s = st.split(" ");
		    
		    LinkedHashSet<String>set=new LinkedHashSet<>();
		         for(int i=0 ; i<s.length ; i++) {
		        	 set.add(s[i]);
		         }
		         
		         for(String str:set) {
		        	 int count=0;
		        	 for(int i=0 ; i<s.length ; i++) {
		        		 if(str.equals(s[i])) {
		        			 count++;
		        		 }
		        	 }
		        	 
		        	 if(count>1) {
		        		 System.out.println(str + " repating " + count + " times ");
		        	 }
		         }

	}

}
