package com.rahul.lmbda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {

	public static void main(String[] args) {
		//Supplier<Person>supplier= ()->new Person("rahul",33);
		/*
		 * void namePrinter(Consumer<Person>consumer,Supplier<Person>supplier) {
		 * consumer.accept(supplier.get()); }
		 */
		//Consumer<Person> consumer = (p) -> System.out.println(p.name);
		Person person= new Person("rahul",33);
		Consumer<Person> consumer = (p) -> System.out.println(p.name);
		consumer.accept(person);
	}

}
