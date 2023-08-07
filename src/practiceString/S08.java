package practiceString;

import java.util.Arrays;

public class S08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //wap to print string in rev order in same position
		
		String s= "bangalore is famous for traffic"; //erolagnab si suomaf ciffart
		
		String[] str = s.split(" ");
		System.out.println(Arrays.toString(str));
		
		for(int i=0 ; i<str.length ; i++) {
			String string=str[i];
			String rev="";
			for(int j=string.length()-1 ; j>=0 ; j--) {
				rev=rev+string.charAt(j);
			}
			System.out.println(rev + " ");
		}
		
	}

}
