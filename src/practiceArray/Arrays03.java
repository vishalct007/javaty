package practiceArray;

import java.util.Scanner;

public class Arrays03 {

	public static void main(String[] args) {
		// wap to print sum of even position numbers and odd position numbers
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		     int size = sc.nextInt();
		     
		      int a[]=new int[size];
		           System.out.println("enter the values");
		          //int values=sc.nextInt();
		           
		           for(int i=0 ; i<a.length; i++) {
		        	   a[i]=sc.nextInt();
		           }
		           
		           int evensum=0;
		           int oddsum=0;
		           for(int i=0 ; i<a.length ; i++) {
		        	   if(i%2==0) {
		        		   evensum=evensum+a[i];
		        		   }
		        	   else {
		        		   oddsum=oddsum+a[i];		        	 
		        		   }

	                         }
		           System.out.println(evensum);
		           System.out.println(oddsum);
	}
	

}
