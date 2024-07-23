package com.tnsif.stringp;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("welcome");
		b.append("to java");
		System.out.println(b);
		
		b.insert(1,"hi");
		System.out.println(b);
		b.delete(1,4);
		b.reverse();
		System.out.println(b);
	}

}
