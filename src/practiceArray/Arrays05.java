package practiceArray;

import java.util.Scanner;

public class Arrays05 {

	public static void main(String[] args) {
		//wap to reverse the array
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		     int size = sc.nextInt();
		     
		      int a[]=new int[size];
		           System.out.println("enter the values");
		          //int values=sc.nextInt();
		           
		           for(int i=0 ; i<a.length; i++) {
		        	   a[i]=sc.nextInt();
		           }
		           
		           int start=0;
		           int end=a.length-1;
		           for(int i=0 ; i<a.length ; i++) {
		        	   if(start<end) {
		        		   int temp=a[start];
		        		   a[start]=a[end];
		        		   a[end]=temp;
		        		   start++;
		        		   end--;
		        		   
		        	   }
		           }
		           for(int i=0 ; i<a.length ; i++) {
		        	   System.out.print(a[i] + " ");
		           }
//		           
//		           for(int i= a.length-1 ; i>=0 ; i--) {
//		        	   System.out.print(a[i] + "" );
//		           }

	}

}
