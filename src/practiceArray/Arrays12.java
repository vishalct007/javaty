package practiceArray;

import java.util.Scanner;

public class Arrays12 {

	public static void main(String[] args) {
		// wap to print 2 max number from array withoiut using bubblesort


		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();

		int a[]=new int[size];
		System.out.println("enter the values");
		//int values=sc.nextInt();

		for(int i=0 ; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		int fmax=a[0];
		int smax=a[0];
		for(int i=0 ; i<a.length ;i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax) {
				smax=a[i];
			}
		}
		System.out.println("first max number is "  + fmax);
		System.out.println("second max number is " + smax);

	}

}
