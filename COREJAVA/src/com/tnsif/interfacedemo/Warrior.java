package com.tnsif.interfacedemo;

public class Warrior implements Character,Weapon  {//CHILD CLASS IMPLEMENTS 2 NTERFACES

	@Override
	public void use() {
		System.out.println("welcome");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		System.out.println("attack");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Warrior w=new Warrior();
		w.attack();
		w.use();
		
		
	}
	

}
