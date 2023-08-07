package classPractice;

import java.util.Arrays;

public class SecondMaxNumUsingBubbleSort {

	public static void main(String[] args) {
		int a[]= {10 , 5 , 30 , 40 , 25 , 32};
		     
		for(int i=0 ; i<a.length ; i++) {
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[i]>a[j]) {
				int temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
				}
			}
		}
    System.out.println(Arrays.toString(a));
       System.out.println(a[a.length-2]);
	}

}
