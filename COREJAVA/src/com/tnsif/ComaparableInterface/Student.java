package com.tnsif.ComaparableInterface;

public class Student implements Comparable<Student>{
	int rollno;
	String name,branch;
	
	
	public Student(int rollno, String name, String branch) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.branch = branch;
	}
	


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", branch=" + branch + "]";
	}



	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.name.compareTo(s.name);
	}
	
	

}
