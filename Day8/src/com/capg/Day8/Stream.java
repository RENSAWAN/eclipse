package com.capg.Day8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String>name=new ArrayList <>();
 name.add("sima");
 name.add("gita"); 
 name.add("sunita");
 name.add("renu");
 
 List<String>sortedList=name.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
 System.out.println(sortedList);


	}}
