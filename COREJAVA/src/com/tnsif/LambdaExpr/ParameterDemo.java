package com.tnsif.LambdaExpr;

public class ParameterDemo {
	public static void main(String[] args) {
		Cube c=(a)-> (a*a*a);};
		System.out.println("cube of a num="+c.calculate(2));
	}

}
