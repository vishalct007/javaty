package arrays;

public class FirstMinNum {
	public static void main(String[] args) {
		int []a= {7,2,0,1,5};
		for(int i=0 ; i<a.length;i++) {
			for(int j=i+1 ;j<a.length ;j++) {
				if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println("The first min number is ="+a[0]);
		}
}


