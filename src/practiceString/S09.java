package practiceString;

public class S09 {

	public static void main(String[] args) {
		// wap for palindrome string
		
		String s="table";
		String rev=" ";
		
		for(int i=0 ; i<s.length() ; i++) {
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println(s + " is palindrome");
		}
		else {
			System.out.println(" string is not palindrome");
		}

	}

}
