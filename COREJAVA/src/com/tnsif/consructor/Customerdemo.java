package com.tnsif.consructor;

import java.util.Scanner;


public class Customerdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		String name=sc.nextLine();
		
		System.out.println("enter your cid");
		int id=sc.nextInt();
		
		System.out.println("enter yor address");
		String add=sc.next
				();
		
		Customer c=new Customer();
		c.setCname(name);
		c.setCid(id);;
		c.setCaddress(add);
		System.out.println(c);
		
	}
	

	
	

}