package com.tnsif.ArrayList;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("r");
		l.add(21);
        l.add("big");
        l.add(8.9);
        System.out.println("after invoking add() "+l);
        l.add(1, "apple");
        System.out.println("after adding" +l);
        LinkedList l1= new LinkedList();
        l1.add(1);
        l1.add("do");
        
        l1.add(l);
        System.out.println(l1);
        l1.addFirst(6);
        l1.addLast("bhage");
        System.out.println(l1);
	}

}