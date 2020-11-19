package com.rahul.streams;

import java.util.ArrayList;
import java.util.List;

public class FilterExample1 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		
		
		l1.add("abc");
		l1.add("def");
		l1.add("ghi");
		l1.add("jkl");
		l1.add("mno");
		
		
		l1.stream().filter(p->p.length()>2).forEach(p->System.out.println(p));
		
		//filter uses predicate , takes in input and returns boolean 
		
	}

}
