package practiceArray;

import java.util.Scanner;

public class Arrays18 {

	public static void main(String[] args) {
		
     //wap to print the duplicate from array
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();

		int a[]=new int[size];
		System.out.println("enter the values");
		//int values=sc.nextInt();

		for(int i=0 ; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0 ; i<a.length ; i++) {
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
