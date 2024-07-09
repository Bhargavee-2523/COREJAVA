package com.tnsif.interfacedemo;

public class Demo implements Childinterface{//using Childinerface we can access method OF Interfaceone also

	@Override
	public void print() {
		System.out.println("methof of Interfaceone");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("method of Childinterface");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
	    d.print();
	    d.show();
	}
	

}
