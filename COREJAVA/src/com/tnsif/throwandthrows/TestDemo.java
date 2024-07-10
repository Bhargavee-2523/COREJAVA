package com.tnsif.throwandthrows;
import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rollno");
		int rollno=sc.nextInt();
		if(rollno<0) {
			throw new ArithmeticException("rollno cannot be less than zero");
		}
		else {
			System.out.println("valid rollno");
		}
	}

}
