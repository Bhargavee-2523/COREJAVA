package com.tnsif.abstraction;

public class Square extends Shape {
	private float side;
	public Square()
	{
		side=2.0f;
	
	}
	public Square(float side) {
		this.side=side;
	}
	@Override
	void calarea() {
		super.area=side*side;
	}

}
