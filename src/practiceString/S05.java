package practiceString;

import java.util.Arrays;

public class S05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//wap to print string in reverese order without using length method and length variable
		  String s="Testyantra";
		  
		  char[] ch = s.toCharArray();
		  System.out.println(Arrays.toString(ch));
		  int count=0;
		      for(char  charArray:ch) {
		    	  count++;
		      }
		      
		      for(int i=count-1 ; i>=0 ; i--) {
		    	  System.out.println(s.charAt(i));
		      }
		
	}

}
