package com.tnsif.exceptionhandling;

public class NetsedTryCatch {
	public static void check() {
		String str="tns";
		int slength=str.length();
		System.out.println("string length"+slength);
		String anotherstring=null;
		int y=6;
		try {
			try {//nested try
				System.out.println(str.charAt(y));//y=6 so it checks char at 6th index of str,but there is no index=6 so it is an exception
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("inex out of bounds exception"+ex);

			}
			System.out.println("string length"+anotherstring.length());
		
		}
		catch(NullPointerException npe) {
			System.out.println("exception is thrown"+npe.getMessage());
		}
		
		
	}

}
