package practiceArray;

import java.util.Scanner;

public class Arrays02 {
	// print sum and average of array

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();

		int a[]=new int[size];
		System.out.println("enter the values");
		//int values=sc.nextInt();

		for(int i=0 ; i<a.length; i++) {
			a[i]=sc.nextInt();
		}

		int sum=0;
		for(int i=0 ; i<a.length ; i++) {
			sum=sum+a[i];
		}

		double average=sum/a.length;
		System.out.println(sum);
		System.out.println(average);


	}

}
