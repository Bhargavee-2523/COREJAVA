package com.tnsif.exceptionhandling;

import java.util.InputMismatchException;

public class Division {
	public static void divide() {
		int a=6,b=0,c;
		
		try {
			c=a/b;
			System.out.println("dividion"+c);
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught"+e.getMessage());
	    }
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("xception caught"+e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("exception caught"+e.getMessage());
		}	
			catch(Exception e) {
				System.out.println("exception caught");
			}
		}
		
	}


