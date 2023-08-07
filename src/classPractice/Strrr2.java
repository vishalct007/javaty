package classPractice;

import java.util.LinkedHashSet;

public class Strrr2 {

	public static void main(String[] args) {
		String st="i am am from sdet44 batch a a batch";
		String[] s=st.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
		}
		int duplicatewords=0;
		for (String str : set) {
			int count=0;
			for (int i = 0; i < s.length; i++) {
				if (str.equals(s[i])) {
					count++;
				}
			}
			if (count>1) {
				duplicatewords++;
				System.out.println("duplicate words in a string is "+str );
			}
		}
		System.out.println("count of duplicate words is: "+duplicatewords);


	}

}
