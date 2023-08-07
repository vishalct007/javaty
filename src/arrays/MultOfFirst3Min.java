package arrays;

public class MultOfFirst3Min {
	public static void main(String[] args) {
		int []a= {7,2,3,1,5};
		for(int i=0 ; i<a.length;i++) {
			for(int j=i+1 ;j<a.length ;j++) {
				if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		int mul=1;
		for(int i=0;i<3 ; i++) {
		mul=mul*a[i];
		}
		System.out.println("multiplication of first three min number  is " + mul);
	}

}
