package com.tnsif.Multithreading;

public class ImplementingRunnable implements Runnable {
	public static void main(String[] args) {
		ImplementingRunnable i=new ImplementingRunnable(); //new state
		
		Thread t1=new Thread(i);
		t1.start();
		
		
		
	}

	@Override
	public void run() {
		System.out.println("implemeting runnable inetrface");
		// TODO Auto-generated method stub
		
	}

}
