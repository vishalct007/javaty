package home_Practice;

public class ReverseString {

	public static void main(String[] args) {
		String st="vishal is my name";
		    
//		for(int i=s.length()-1 ; i>=0 ; i--) {
//			System.out.print(s.charAt(i));
//		}
//		
               String[] s = st.split(" ");
               for(int i=s.length-1 ; i>=0 ; i--) {
            	        System.out.print(s[i]);
               }
	}

}
