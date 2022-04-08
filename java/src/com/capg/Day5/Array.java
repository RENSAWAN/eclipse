package com.capg.Day5;

class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		arr = new int[5];
		arr[0] =20;
		
		arr[1] = 30;
		arr[2] = 60;
		arr[3] = 50;
		arr[4] = 20;
		
		for(int i = 0; i < arr.length; i++)
			
			System.out.println("print the value" + i + ":" + arr[i] );
	}

}
