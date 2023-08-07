package practiceString;

public class S07 {

	public static void main(String[] args) {
		// wap to print string in rev order w.r.t sentence
		
		String s= "bangalore is famous for traffic";
		   String[] str = s.split(" ");
		   String rev="";
		   for(int i=str.length-1; i>=0 ; i--) {
			   rev=rev + " "+str[i];
		   }
		   System.out.println(rev);

	}

}
