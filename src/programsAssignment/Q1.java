package programsAssignment;

public class Q1 {

	public static void main(String[] args) {
		// i/p= "welcome to expleo" o/p="expleo to welcome"
		
		String s="welcome to expleo";
		String[] str = s.split(" ");
		   String rev="";
		    for(int i=str.length-1 ; i>=0 ; i--) {
		    	rev=rev+ " "+str[i]; 
		    }
		    System.out.println(rev);

	}

}
