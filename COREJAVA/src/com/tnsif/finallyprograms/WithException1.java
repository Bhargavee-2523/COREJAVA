package com.tnsif.finallyprograms;
//exception is present but for try block there is no matching catch block
public class WithException1 {
	public static void main(String[] args) {
    	try {
    		System.out.println(100/0);
    	}
    	catch(NullPointerException e) {
    		System.out.println("exception caught"+e.getMessage());
    	}
    	finally {
    		System.out.println("finally");
    	}
System.out.println("end of program");
}
}



