package com.tnsif.staticprogram;

public class Demo1 {
	public static void main(String[] args) {
		Student.change();
		Student s1=new Student(1,"rashmi");
		Student s2=new Student(1,"divya");
		Student s3=new Student(1,"navya");
		s1.display();
		s2.display();
		s3.display();
		
		
	}

}
