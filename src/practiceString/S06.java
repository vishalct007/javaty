package practiceString;

import java.util.Arrays;

public class S06 {

	public static void main(String[] args) {
	
		//wap to print string in reverese order without using length method but by using temporary variable
		
		 String s="Testyantra";
		  
		  char[] ch = s.toCharArray();
		  String rev="";
		  
		  int count=0;
		      for(char  charArray:ch) {
		    	  count++;
		      }
		      
		      for(int i=count-1 ; i>=0 ; i--) {
		    	  rev=rev+s.charAt(i);
		      }
		      System.out.println(rev);
	}

}
