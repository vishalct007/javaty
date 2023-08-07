package classPractice;

import java.util.Arrays;
import java.util.Iterator;

public class P1 {

	public static void main(String[] args) {
		int []a= {4 , 5, 3, 2, 8};
		// max number in array
		//	int max=a[0];
		//	for(int i=0 ; i<a.length ; i++) {
		//		if(a[i]>max) {
		//			max=a[i];
		//		}
		//	}
		//	System.out.println(max);


		//	//sorting in ascending order using bubble sort
		//	for(int i=0 ; i<a.length ; i++) {
		//		for(int j=i+1 ; j<a.length ; j++) {
		//			if(a[i]>a[j]) {
		//				int temp=a[i];
		//				a[i]=a[j];
		//				a[j]=temp;
		//			}
		//		}
		//	}
		//	System.out.println(Arrays.toString(a));
		//	System.out.println((a[a.length-2]));


		//


		// to reverse string
		//	String s="vijay";
		//	    for(int i=s.length()-1 ; i>=0 ; i--) {
		//	    	System.out.print(s.charAt(i)+" ");
		//	    }

		//to reverse sentence
		
		String s="My name is guldu vishal";
		String str[]=s.split(" ");
		for (int i = 0; i < str.length; i++) 
		{
			String st=str[i];
			for (int j = st.length()-1; j >=0; j--) 
			{
				System.out.print(st.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
