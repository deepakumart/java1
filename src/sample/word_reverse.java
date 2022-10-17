package sample;

public class word_reverse {
	public static void main(String[] args) {
		String a="This Is Deepak";
//		String b="";
//		String[]split=a.split(" ");
//		for(int i=split.length-1;i>=0;i--) {
//			b=b+split[i]+" ";
//		
//		}
//		System.out.println(b);
		StringBuffer re=new StringBuffer();
		re.append(a);
		System.out.println(re.reverse());
				
	}

}
