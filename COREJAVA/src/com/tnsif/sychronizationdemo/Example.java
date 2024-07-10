package com.tnsif.sychronizationdemo;

public class Example {
	synchronized static void display() {
		Thread g= Thread.currentThread();
		//synchronized static void display() {
			
		
         for(int i=0;i<=3;i++)
			try {
				Thread.sleep(1000);
				System.out.println(g.getName()+" "+i);
				
			}
         catch(Exception e) {
        	 
         }
		}

}
