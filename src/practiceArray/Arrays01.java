package practiceArray;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		int a[]= {10 , 20 ,30,25 ,60};// declaring using literal
		int s[]=new int[5];// declaring by creating object of array
		   s[0]= 0;
		   s[1]=1;
		   s[2]=2;
		   s[3]=3;
		   s[4]=4;
		 //  s[5]=5;// array index out of bound exception
		   
		 // System.out.println(Arrays.toString(s)); // printing values as array
		   
		   for(int i=0 ; i<s.length ; i++) {
		   System.out.println(s[i]);
	   }
		   
		   
		    

	}

}
