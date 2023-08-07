package arrays;

public class FirstMinNumWithoutSort {

	public static void main(String[] args) {
		int [] a= {7,2,0,1,5};
		int fmin=a[0];
		for(int i=0;i<a.length;i++) {
			if(fmin>a[i]) {
				fmin=a[i];
			}
		}
		System.out.println(fmin);

	}

}
