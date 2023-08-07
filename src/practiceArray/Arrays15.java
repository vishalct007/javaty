package practiceArray;

import java.util.Scanner;

public class Arrays15 {

	public static void main(String[] args) {
		
   //wap to add two arrays of different sizes
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();

		int a[]=new int[size-1];
		int b[]=new int[size];
		System.out.println("enter the values of first array");

		for(int i=0 ; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the values of second array");

		for(int i=0 ; i<b.length; i++) {
			b[i]=sc.nextInt();
		}
		int length=a.length;
		if(a.length<b.length) {
			length=b.length;
		}
		
		for(int i=0 ; i<length ; i++) {
			try {
				System.out.print(a[i] + b[i] + " ");
			}
			catch(Exception e) {
				if(a.length>b.length) {
					System.out.println(a[i] + " ");
				}
				else {
					System.out.println(b[i] + " ");
				}
			}
		}
		
		
	}

}
