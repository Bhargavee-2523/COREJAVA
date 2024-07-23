package com.tnsif.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println("size "+al.size());
		al.add(6);
		al.add("teacher");
		al.add(9.0);
		al.add('d');
		System.out.println("size "+al.size());
		System.out.println(al.contains(55));
		System.out.println(al.isEmpty());
		System.out.println(al.get(3));
		System.out.println(al.remove(0));
		
		
	}

}
