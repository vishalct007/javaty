package strings;

import java.util.LinkedHashSet;

public class CountDuplicateINStringCharacter {

	public static void main(String[] args) {
		String s="Aishwarya";
		    String st = s.toLowerCase();
		    
		    LinkedHashSet<Character> set= new LinkedHashSet<>();
		    for(int i=0 ; i<st.length() ; i++) {
		    	   set.add(st.charAt(i));
		    }
		    
		    for(Character ch:set) {
		    	int count=0;
		    	for(int i=0 ; i<st.length();i++) {
		    		if(ch==st.charAt(i)) {
                         count++;		    			
		    		}
		    	}
		    	
		    	if(count>1) {
		    		System.out.println(ch +  "  is repeating " + count + "  times ") ;
		    	}
		    }

	}

}
