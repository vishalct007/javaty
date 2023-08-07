package practiceArray;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		for(int i=0 ; i<a.length-1 ; i++) {
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
