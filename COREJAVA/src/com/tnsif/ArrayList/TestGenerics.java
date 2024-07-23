package com.tnsif.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("rashmi");
		al.add("gita");
		//al.add(6);// we cannot store an integer value as type is <String>

		System.out.println(al);//prints values in a single line
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());//iterartor prints values in new line
		}
	}
	

}
