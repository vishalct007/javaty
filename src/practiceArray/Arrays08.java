package practiceArray;

import java.util.Scanner;

public class Arrays08 {

	public static void main(String[] args) {
		// wap to find minimum number in array

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();

		int a[]=new int[size];
		System.out.println("enter the values");
		//int values=sc.nextInt();

		for(int i=0 ; i<a.length; i++) {
			a[i]=sc.nextInt();
		}

		int min=a[0];
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] <min) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
