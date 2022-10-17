package sample;

public class split_char_num_splchar {
	static String a="abcd123@#$";
	public static void letter() {
		String b=a.replaceAll("[a-z0-9]", "");
		System.out.println(b);
	}
	public static void number() {
		String c=a.replaceAll("[^0-9]", "");
		System.out.println(c);
	}
	
	public static void main(String[] args) {
	   
	   letter();
	   number();
	   
		
		
	}
}
