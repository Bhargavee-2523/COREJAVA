package com.tnsif.Practice;

import com.tnsif.Practice.Inter1.MyInnerInterface;

public class Imp implements Inter1.MyInnerInterface{

	@Override
	public void print() {
	System.out.println("welcome");
		
	}
	public static void main(String[] args) {
		Imp i=new Imp();
		i.print();
	}
	
	}


