package com.capg.Day8;

@FunctionalInterface
interface Lambda{
	public void print();
}
 interface sumInterface {
	 public void sum(int a, int b);
 }
public class MyLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa = 10;
		Lambda result=()->
		
		System.out.println("Hello Java lambda");
        result.print();

	sumInterface SumInterface = (int a,int b)->{
		int c=a+b;
		System.out.println(c);
	};
	SumInterface.sum(1033,10);

	}
public static void print() {
	System.out.println("HELLO JAVA");
}
public static void addingNumber(int a,int b) {
	int c = a + b;
	System.out.println(c);
	
	
}


}

