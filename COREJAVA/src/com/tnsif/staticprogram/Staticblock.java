package com.tnsif.staticprogram;
//prog for static block
public class Staticblock {
	static {//static block,it is ececuted at the time of class loading
		System.out.println("static block");
		
	}
public static void main(String[] args) {
	System.out.println("hello");
}
}
