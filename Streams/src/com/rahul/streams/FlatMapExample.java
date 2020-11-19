package com.rahul.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
		List<List<String>> list1 = new ArrayList();
		list1.add(Arrays.asList("a","b","c"));
		list1.add(Arrays.asList("a","b","c"));
		list1.add(Arrays.asList("a","b","c"));
		list1.add(Arrays.asList("a","b","c"));
		list1.add(Arrays.asList("a","b","c"));
		
		
		
		Stream<List<String>> stream1=list1.stream();
		Stream<String> stream2=stream1.flatMap(s->s.stream());
		
		//method refrence also 
		//more on flatmap and foreach 
	//	Stream<String> stream3=stream2.filter(s->s.equals("a")).forEach(s->System.out.println(s)));
	}

}
