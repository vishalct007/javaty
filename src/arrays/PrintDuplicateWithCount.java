package arrays;

import java.util.LinkedHashSet;

public class PrintDuplicateWithCount {

	public static void main(String[] args) {
		int []a= {2,3,4,4,4,5,6};
		LinkedHashSet<Integer > set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(Integer n:set) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(n==a[i]) {
					count++;
					}
			}
				if(count==1) {
					System.out.println(n+ " is repeating " +count + " times");
				}
			}
		}

	}


