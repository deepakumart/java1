package sample;

import java.util.ArrayList;

public class Array_List {
	
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(20);
		a.add(30);
		a.add("tdee");
		a.add("dee");
		System.out.println(a.size());
		System.out.println(a.add("deepak"));
		System.out.println(a);
		System.out.println(a.contains("deepak"));
		System.out.println(a.get(1));
		System.err.println(a.set(3, "deee"));
		System.out.println(a.remove(0));
		System.out.println(a);
	}

}
