package com.rahul.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		
		
		l1.add("abc");
		l1.add("def");
		l1.add("ghi");
		l1.add("jkl");
		l1.add("mno");
		//Stream should be considered as conveyer belt , once gone cannot be reversed 
		//n number of stream of same list can be created 
		////
		
		
		
		Stream<String> stream1=l1.stream();
		stream1.forEach(p->System.out.println(p));
	}

}
