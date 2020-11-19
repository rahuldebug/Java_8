package com.rahul.streams;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
List<String> l1 = new ArrayList<>();
		
		
		l1.add("abc");
		l1.add("def");
		l1.add("ghi");
		l1.add("jkl");
		l1.add("mno");
		
		
		l1.stream().map(p->p.length()).forEach(p->System.out.println(p));
		
		//map uses function , it takes in an input and returns the differen o/p
		
	}

}
