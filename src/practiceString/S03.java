package practiceString;

public class S03 {

	public static void main(String[] args) {
		// WAP TO reverse a string by using temporary variable
		String s="Testyantra";
		String rev="";
		for(int i=s.length()-1 ; i>=0 ; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		

	}

}
