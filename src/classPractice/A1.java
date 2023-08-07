package classPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class A1 {

	public static void main(String[] args) {
//	     int a[]= {2 , 4, 3, 2 , 4, 6 , 8};
	     
//	     int max=a[0];
//	     for(int i=0 ; i<a.length ; i++) {
//	    	 if(a[i]>max) {
//	    		 max=a[i];
//	    	 }
//	     }
//  System.out.println(max);
	     
//	        int temp=0;
//	     for(int i=0 ; i<a.length ; i++) {
//	    	 for(int j=i+1 ; j<a.length ; j++) {
//	    		 if(a[i]>a[j]) {
//	    			 temp=a[i];
//	    			 a[i]=a[j];
//	    			 a[j]=temp;
//	    		 }
//	    	 }
//	     }
//	     System.out.println(Arrays.toString(a));
//	     System.out.println(a[a.length-2]);
	     
//	     LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
//	        for( int i=0 ; i<a.length ; i++) {
//	        	set.add(a[i]);
//	        }
//	        
//	        
//	        for(Integer data:set) {
//	        	int count=0;
//	        	for(int i=0 ; i<a.length ; i++) {
//	        	if(data==a[i]){
//	        		count++;
//	        	}
//	        	
//	        	
//	        }
//	        	if(count>1) {
//	        		System.out.println(data + "is repeating " + count + "times");
//	        	}
//	        }
	     
	     
	     
	     String s="vishal is a good boy";
	         String[] st= s.split(" ");
	     for(int i=st.length-1 ; i>=0 ; i--) {
	    	    System.out.print(st[i] + " ");
	     }
	    
	     
	     
	}

}
