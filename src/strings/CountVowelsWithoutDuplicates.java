package strings;

import java.util.LinkedHashSet;

public class CountVowelsWithoutDuplicates {

	public static void main(String[] args) {
		String st="India";
		 String str=st.toLowerCase();
		  char[] s=str.toCharArray();
		  LinkedHashSet<Character> set=new LinkedHashSet<>();
		  for(int i=0 ; i<s.length;i++) {
			  set.add(s[i]);
		  }
		  int count=0;
		  for(Character ch:set) {
			  if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
				  count++;
				  System.out.println(ch);
			  }
		  }
		 
System.out.println(count);
	}

}
