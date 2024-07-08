package com.tnsif.consructor;

public class Conexample {
	Conexample(){
		System.out.println("default const");
	}
	Conexample(int i){
		System.out.println("welcome");
	}
	Conexample(int i,int j){
		System.out.println("hello world");
	}
	Conexample(int i, String n){
		System.out.println("different type");

	}
	public static void main(String[] args) {
		Conexample c1=new Conexample();
		Conexample c2=new Conexample(6);
		Conexample c1=new Conexample(8,t);
		
	}
	}

}
