package practiceArray;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays17 {

	public static void main(String[] args) {
		// wap to rotate an array by passing key
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();

		int a[]=new int[size];
		int b[]=new int[a.length];
		System.out.println("enter the values");
		//int values=sc.nextInt();

		for(int i=0 ; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		int key=3;
		for(int i=1 ; i<key ; i++) {
			int temp=a[0];
			for(int j=1 ; j<a.length ; j++) {
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		
	//	System.out.println(Arrays.toString(a));
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
