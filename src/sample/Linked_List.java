package sample;

import java.util.LinkedList;

public class Linked_List {
	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.add(20);
		a.add(30);
		a.add("tdee");
		a.add("dee");
		a.addFirst(100);
		System.out.println(a);
		System.out.println(a.pollFirst());
		System.out.println(a);
		
		
	}

}
