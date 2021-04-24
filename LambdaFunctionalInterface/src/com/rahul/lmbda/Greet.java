package com.rahul.lmbda;

public class Greet {
	//functional Interface
	//passing function  to other methods as parameters, therefore
	//not bound to any method refrence 
	public static void hindiGreet(Greetings greetings) {
		greetings.greet();
	}

	public static void main(String[] args) {

		hindiGreet(() -> System.out.println("namaste"));
	}

}


//functional interface is an interface with only one function 
//lambda is a way of providing function ,to be passed without Object invocation.
//earlier function needed to be part of object , and this object used to get passed 

