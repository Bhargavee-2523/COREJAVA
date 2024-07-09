package com.tnsif.interfacedemo;

public class NestedInterface implements MyInterface.MyInnerInterface{

	@Override
	public void print() {
		System.out.println("inner interface ");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		NestedInterface n=new NestedInterface();
		n.print();
		System.out.println(NestedInterface.id);//We need to access static variable using classname only even though wehave created abject "n"
	}

}
