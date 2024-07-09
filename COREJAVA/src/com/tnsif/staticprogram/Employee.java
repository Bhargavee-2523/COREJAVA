package com.tnsif.staticprogram;

public class Employee {
	int eid;//non static
	String name;//non static
	static String company="TNS";
    Employee(int r,String n){
    	eid=1;
    	name=n;
    }
    void display() {
    	System.out.println(eid+" "+name+" "+company);
    }
}
