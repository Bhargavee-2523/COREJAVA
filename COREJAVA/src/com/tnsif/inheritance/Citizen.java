package com.tnsif.inheritance;

public class Citizen {
	
	private String name;
	private long adharno;
	private String addres;
	private long phno;
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Citizen(String name, long adharno, String addres, long phno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.addres = addres;
		this.phno = phno;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", addres=" + addres + ", phno=" + phno + "]";
	}
	

}
