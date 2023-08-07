package practiceArray;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays20 {

	public static void main(String[] args) {
		// swapping and removing duplicate

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();

		int a[]=new int[size];
		System.out.println("enter the values");
		//int values=sc.nextInt();

		for(int i=0 ; i<a.length; i++) {
			a[i]=sc.nextInt();
		}

		for(int i=0 ; i<a.length ; i++ ) {
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int start=0;
		for(int i=0; i<a.length-1 ; i++) {
			if(a[i]!=a[i+1]) {
				a[start]=a[i];
				start++;
			}

		}
		a[start]=a[a.length-1];

		for(int i=0 ; i<start+1 ; i++) {
			System.out.println(a[i]);
		}
	}

}


