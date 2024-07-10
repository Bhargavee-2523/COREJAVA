package com.tnsif.finallyprograms;
//exception does not occur in this programs
public class WithoutException {
	public static void main(String[] args) {
		try {
			System.out.println("welcome");
			
		}
		catch(Exception E) {
			System.out.println("exception");
		}
		finally {
			System.out.println("end of program");
		}
	}

}
