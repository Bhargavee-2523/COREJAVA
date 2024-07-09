package com.tnsif.abstraction;

public abstract class Shape {
	protected float area;
	abstract void calarea();//ABATRACT METHOD

		void show() {//CONCRETE METHOD
			System.out.println("area of shape"+area);
		}
	}


