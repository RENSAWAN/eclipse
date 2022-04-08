package com.capg.Day8;
@FunctionalInterface
 interface PosivitNegetive{
	void check (double a);
}
public class LambdaPN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 PosivitNegetive number= (double a) ->
		 {
			 if(a < 0.0) {
				 System.out.println(a +  " number is nigative");
			 }
		 
			 else {
				 System.out.println(a +  " number is positive");
				 
			 }
		 
		 };
	
	number.check(912);
	}
	
}
