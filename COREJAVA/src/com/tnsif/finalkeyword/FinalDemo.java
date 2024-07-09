package com.tnsif.finalkeyword;
//demo for final
public class FinalDemo {
	final int x=10;
	static final int y;
	
	  final void change() {// final method
		System.out.println("default");
	}
	static {
		y=9;//if we did not initialize a var,we van initialize it in the static block
	}

}
