package com.capg.Array;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		ArrayList<Integer> m =new ArrayList<>();
		m.add(10);
		m.add(20);
		m.add(30);
		
		m.add(1,10);
		System.out.println(m);
		m.remove(2);
		System.out.println(m);
		m.clear();
		System.out.println(m);
		
		// advance for loop
		for(Integer num : m) {
			System.out.println(num);
			
		}
		
	}

}
