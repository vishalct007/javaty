package home_Practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		String st="my name is vishal vishal";
		    String[] s = st.split(" ");
		    LinkedHashSet<String> set=new LinkedHashSet<>();
		    
		    for(int i=0 ; i<s.length ;i++) {
		    	  set.add(s[i]);
		    }
		    for(String ss:set) {
		    	int count=0;
		    	for(int i=0 ; i<s.length ; i++) {
		    		if(ss.equals(s[i])) {
		    			count++;
		    		}
		    	}
		    	//System.out.print( ss + " is repeating " + count + " times ");
		    
		    if(count>1) {
		    System.out.println(ss+ " is repating " + count + " times ");
		    }
		    
		    
	}

}
}
