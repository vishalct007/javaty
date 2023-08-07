package classPractice;

import java.util.LinkedHashSet;

public class PrintDuplicatesInString {

	public static void main(String[] args) {
		String st="i am am from sdet46 batch batch";
		    String[] s = st.split("");
		    LinkedHashSet<String> set= new LinkedHashSet<String>();
		    for(int i=0 ; i<s.length ; i++) {
		    	  set.add(s[i]);	
		    }
		    
		    int duplicateWords=0;
		    for(String ss:set) {
		    	int count=0;
		    	for(int i=0;i<s.length ; i++) {
		    		if(ss.equals(s[i]))
		    			count++;	
		    	}
		    	
		    	if(count>1) {
		    		duplicateWords++;
		    		//System.out.print("duplicate words in string are"+ ss);
		    	}
		    	
		    }
		    System.out.print("number of times it is repeated is"+ duplicateWords);
	}

}
