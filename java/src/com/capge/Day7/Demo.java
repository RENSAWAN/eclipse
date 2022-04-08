package com.capge.Day7;

public class Demo {

	private String colour;
	private String getcolour() {
		return colour;
		
	}
	public void sercolour(String c) {
		this.colour = c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo D1= new Demo();
		D1.sercolour("RED");
		System.out.println(D1.getcolour());
		
		
	}

}
