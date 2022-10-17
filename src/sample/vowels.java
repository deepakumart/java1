package sample;

public class vowels {
	public static void main(String[] args) {
	char e=0; 
	String a="deepak";
	for(int i=0;i<a.length()-1;i++) {
		if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
			e=a.charAt(i);
			System.out.println(e);
		}
		
	}
	}

}
