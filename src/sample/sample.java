package sample;

public class sample {
	private  void name() {
		String a="The sky is blue";
		String b="";
		String[]split=a.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			b=b+split[i]+" ";
		}
		System.out.println(b);
	}
		
	
	  public static void main(String[] args) {
		 sample f=new sample();
		 f.name();
		

}
}
