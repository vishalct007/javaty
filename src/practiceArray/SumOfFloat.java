package practiceArray;

public class SumOfFloat {
	public static void main(String[] args) {
		float [] f= {10.5f , 20,5f , 30.5f , 40.5f , 50.5f};
		 float sum=0;
		 
		 for(int i=0 ; i<f.length ; i++) {
			 sum=sum+f[i];
		 }
		 System.out.println(sum);
	}

}
