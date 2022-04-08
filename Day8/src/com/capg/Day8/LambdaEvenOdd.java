package com.capg.Day8;
@FunctionalInterface

interface EvenOdd{
	void check(int a);
	
	
}
public class LambdaEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 EvenOdd evenOdd = (int a)->{
				// TODO Auto-generated method stub
			
				if(a%2==0) {
					System.out.println("NUMBER:" + a + " IS EVEN");
					
				}
				else {
					System.out.println("NUMBER:" + a + " IS ODD");
				}
		 };
	
		 evenOdd.check(10);
	}
}	


