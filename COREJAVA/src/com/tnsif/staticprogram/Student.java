package com.tnsif.staticprogram;

public class Student {
	int rollno;
	String name;//non static members
	static String college="sriindu";//static member
  static void change() {
	  college="III";
	  
  }
  Student(int r,String n){
	  rollno=r;
	  name=n;
	  
  }
  void display() {
	  System.out.println(rollno+" "+name+" "+college);
  }
  }
	  
  
