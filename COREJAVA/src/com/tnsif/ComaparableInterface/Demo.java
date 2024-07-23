package com.tnsif.ComaparableInterface;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		//al.add("rtttr");
		//user defined class
		ArrayList<String> al=new ArrayList<String>();
		Student s1=new Student(103,"rashmi","cse");
		Student s2=new Student(104,"rita","cse");
		Student s3=new Student(105,"gita","cse");
	 	al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);
		
		
		
	}

}
