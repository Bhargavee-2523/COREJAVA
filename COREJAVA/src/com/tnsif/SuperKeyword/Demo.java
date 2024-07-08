package com.tnsif.SuperKeyword;

public class Demo extends SuperExample{
	int a=7;
	
	void display() {
		System.out.println(a);
		System.out.println(super.a);
		drinking();
		super.drinking();
		
		
	}
  public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
		
		
		
	}
}

