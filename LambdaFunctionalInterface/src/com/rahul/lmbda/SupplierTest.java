package com.rahul.lmbda;

import java.util.function.Supplier;
import java.util.function.Predicate;

public class SupplierTest {

	static boolean checkEligibility(Supplier<Person> supplier, Predicate<Person> predicate) {
		return predicate.test((supplier.get()));
	}

	public static void main(String[] args) {
		Supplier<Person> supplier = () -> new Person("rahul", 33);
		Predicate<Person>predicate=(p)->p.age>18;
		System.out.println(checkEligibility(supplier, predicate));
	}

}
