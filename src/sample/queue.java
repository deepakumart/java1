package sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
		Queue<Integer> a=new LinkedList<>();
		
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		System.out.println(a.poll());
	}

}
