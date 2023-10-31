package home_Practice;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
//		String s= "testyantra";
//		char[] ch= s.toCharArray();
//		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
//		
//		for(int i=0; i<ch.length;i++)
//		{
//			set.add(ch[i]);
//		}
//		for(Character c: set)
//		{
//			int count=0;
//			for(int i=0; i<ch.length; i++)
//			{
//				if(c==ch[i])
//				{
//					count++;
//				}
//			}
//		System.out.println(c+" repeting "+count+" times");
//		}
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the number");
		   int n = sc.nextInt();
		   
		   int temp=0;
		   for(int i=2; i<n ; i++) {
			   if(n%i==0) {
				   temp=temp+1;
			   }
		   }
		   
		   if(temp==0) {
			   System.out.println( n + "is a prime number");
		   }
		   

	}

}
