package practiceString;

public class S14 {

	public static void main(String[] args) {
		// 
		String s="aaaabbbcccdddeee"; //op=a3
		for(int i=0 ; i<s.length() ; i++) {
			   char ch = s.charAt(i);
			   int count=1;
			   for(int j=i+1 ; j<s.length() ; j++) {
				    char ch1 = s.charAt(j);
				    if(ch==ch1) {
				    	count++;
				    	i++;
				    }
				    else {
				    	break;
				    }
			   }
			   System.out.print(ch +""+count);
		}

	}

}
