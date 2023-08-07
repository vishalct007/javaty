package arrays;

import java.util.Scanner;

public class NthMinNoinArray {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,7,8};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter nth min");
		int n=sc.nextInt();
		nthMinimum(n, a);
		
	}
	
	public static void nthMinimum(int n , int []a) {
		for(int i=0 ; i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j])
					count++;
			}
			if(count==n-1)
				System.out.println(a[i]);
		}
	}

	}


