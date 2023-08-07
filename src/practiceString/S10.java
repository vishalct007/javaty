package practiceString;

public class S10 {

	public static void main(String[] args) {
//wap to print    o/p = "Welcome To India"
		  String s= " welcome to india";
		     String[] str = s.split(" ");
		     
		    
		     String firstLetter="";
		     String capitalisedString="";
		     for( String string:str) {
		    	 firstLetter =string.substring(0, 1).toUpperCase() +string.substring(1);
		    	 capitalisedString=capitalisedString+firstLetter;
		     }
		     System.out.println(capitalisedString.trim());
	}

}
