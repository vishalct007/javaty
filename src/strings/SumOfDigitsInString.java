package strings;

public class SumOfDigitsInString {
	public static void main(String[] args) {
		String s="a2b4f6";
		int sum=0;
		for(int i=0 ; i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				int n=ch-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}

}
