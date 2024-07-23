package com.tnsif.Collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer>ob=new Stack<Integer>();
		ob.push(1);
		ob.push(7);
		ob.push(5);
		ob.push(3);
		System.out.println("Stack elements"+ob);
		System.out.println(ob.peek());
		if(ob.isEmpty())
		{
			System.out.println("stack is empty");
			
		}
		else {
			System.out.println("stack is not empty");
		}
		System.out.println(ob.search(66));//if element is not present the returns -1 value
		System.out.println(ob.search(5));//if element is not present the returns index value
	}

}