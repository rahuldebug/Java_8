
package com.rahul.lmbda;

import java.util.function.Predicate;

public class PredicateTest {
	

	 static boolean checkEligibility(Person person, Predicate<Person> predicate) {
		// Person person= new  Person("rahul", 33);
		return predicate.test(person);
		
	}
	public static void main(String[] args) {

		Person person= new  Person("rahul", 33);
		Predicate<Person> predicate= p->p.age>18;
		System.out.println(checkEligibility(person, predicate));
	}

}
