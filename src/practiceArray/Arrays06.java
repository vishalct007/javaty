package practiceArray;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays06 {

	public static void main(String[] args) {
		// wap to copy an array into another array

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		     int size = sc.nextInt();
		     
		      int a[]=new int[size];
		           System.out.println("enter the values");
		          //int values=sc.nextInt();
		           
		           for(int i=0 ; i<a.length; i++) {
		        	   a[i]=sc.nextInt();
		           }
		           
		           int []b=new int[a.length];
		               for(int i= 0 ;i<a.length ; i++) {
		            	   a[i]=b[i];
		               }
		               
		               System.out.println(Arrays.toString(a));
		               System.out.println(Arrays.toString(b));

	}

}
