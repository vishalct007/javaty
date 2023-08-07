package programsAssignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Q3 {

	public static void main(String[] args) {
		// i/p="welcome to to india"; o/p="welcome to india"

		String st="welcome to to india";
		String[] s = st.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		ArrayList<String> list=new ArrayList<>();

		for(int i=0 ; i<s.length ; i++) 
		{
			set.add(s[i]);
		}

//		for(String data:set) 
//		{
//			int c=1;
//
//			for(int j=0; j<s.length; j++) {
//
//				if(data.equals(s[j]))
//				{
//					c++;
//
//				}
//			}
//			if(c==2)System.out.println(data);
//		}
		
		for (String data : list) 
		{
		if(!set.add(data))	
		{
			list.add(data);
		}
		}

		    System.out.println(list);

	}

}
