package com.tnsif.scanner;

public class Taxcalculation {
	public static void main(String[] args) {
		public void calculatetax(Person p)
		if(p.getIncome()<=1600) {
			
		
			p.setTax(0);
		}
	    else if(p.getIncome()>1600 &&p.getIncome()<30000) {
		p.setTax(5);
	}	
	else {
		p.setTax(10);
	}

	}	


}