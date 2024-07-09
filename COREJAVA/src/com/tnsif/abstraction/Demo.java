package com.tnsif.abstraction;

public class Demo {
	public static void main(String[] args) {
		Shape s=new Square(2.6f);//CREATING OBJECT FOR abstract class
		System.out.println(s);
		s.calarea();
		s.show();
	}

}
