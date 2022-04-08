package com.capg.Day4;
import java.util.Stack;

public class Pet {
public static void main(String[] args)
{
	Stack<String>animals= new Stack<>();
	 animals.push("lion");
	 animals.push("dog");
	 animals.add("horse");
	 animals.add("cat");
	 System.out.println(animals);
	 System.out.println(animals.peek());
	 animals.pop();
	 System.out.println(animals);
	 
	
}
}
