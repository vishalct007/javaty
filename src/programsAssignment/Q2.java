package programsAssignment;

import java.util.LinkedHashSet;

public class Q2 {

	public static void main(String[] args) {
		// i/p="vishaal kummar" o/p=remove duplicates
		
		String s="vishaal kummar";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0 ; i<s.length() ; i++) {
			         set.add(s.charAt(i));
			        
		}
		
		for(Character data:set) {
			System.out.print(data + "");
			
		}
		

	}

}
