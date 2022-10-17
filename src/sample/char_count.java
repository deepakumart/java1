package sample;

public class char_count {
	public static void main(String[] args) {
		String a="Deepaakumar";
		char tofind='a';
		int present =0;
		for(int i=0;i<a.length()-1;i++) {
			if(a.charAt(i)==tofind) {
				present =present+1;
				
			}
		}
		System.out.println(present);
	}

}
