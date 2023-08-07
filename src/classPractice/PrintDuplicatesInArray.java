package classPractice;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int a[]= {20 , 30 ,40 ,50};
		int b[]= {15 , 20 , 30 , 25};
		
		
		for(int i=0 ; i<a.length; i++) {
			for(int j=i+1 ; j<b.length ; j++) {
				  if(a[i]==a[j]) {
					  System.out.println(a[i]);
				  }
			}
		}

	}

}
