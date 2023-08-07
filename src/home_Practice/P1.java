package home_Practice;

import java.util.LinkedHashSet;

public class P1 {

	public static void main(String[] args) {
		String s="my name is is vishal vishal";
////		  for(int i=s.length()-1 ; i>=0 ; i--) {
////			   System.out.print(s.charAt(i));
////		  }
////		  
//		  String[] sArr=s.split(" ");
//		     for(int i=sArr.length-1 ; i>=0 ; i--) {
//		    	 System.out.print(sArr[i]);
//		     }
		
		String[] sarr =s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0 ; i<sarr.length ; i++) {
			set.add(sarr[i]);
		}
		
		for(String st:sarr) {
			int count=0 ;
			
			for(int i=0 ; i<sarr.length ; i++) {
				if(st.equals(sarr[i])) {
					count++;
				}
			}
			
			if(count>1) {
				System.out.println(st + " repeated " + count + "times");
			}
		}
		  
		 
		  

	}

}
