package sample;

public class number_reverse {
	public static void main(String[] args) {
		int a=12345;
		int b=0;
		while(a>0) {
			int n=a%10;
			b=(b*10)+n;
		  a/=10;
		}
		System.out.println(b);
	}

}
