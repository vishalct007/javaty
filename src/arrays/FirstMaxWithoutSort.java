package arrays;

public class FirstMaxWithoutSort {

	public static void main(String[] args) {
		int [] a= {7,2,0,1,5};
		int fmax=a[0];
		for(int i=0;i<a.length;i++) {
			if(fmax<a[i]) {
				fmax=a[i];
			}
		}
		System.out.println(fmax);

	}

}
