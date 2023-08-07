package practiceArray;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays16 {

	public static void main(String[] args) {
		// wap to obtain 0's in the first and 1's in the last
		
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
		int start=0;
		int end=a.length-1;
		
		for(int i=0 ; i<a.length; i++) {
			if(a[i]==0) {
				b[start]=a[i];
				start++;
				
			}
			else {
				b[end]=a[i];
				end--;
			}
		}
		System.out.println(Arrays.toString(b));
		
		
		

	}

}
