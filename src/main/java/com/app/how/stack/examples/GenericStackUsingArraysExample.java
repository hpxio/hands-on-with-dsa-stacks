package com.app.how.stack.examples;

import com.app.how.stack.generics.GenericStackUsingArrays;

public class GenericStackUsingArraysExample {
	public static void genericStackExample() {
		final GenericStackUsingArrays<String> genStack = new GenericStackUsingArrays<>();

		/* PUSH Operation */
		genStack.push("First Data");
		genStack.push("Second Data");
		genStack.push("Third Data");

		/* PUSH Overflow Operation */
		genStack.push("Fourth Data");

		/* Display Stack */
		genStack.display();

		/* POP Operation */
		genStack.pop();

		/* PEEK Operation */
		genStack.peek();

		/*POP Underflow Operation*/
		for (int i = 0; i < GenericStackUsingArrays._MAX_; i++) {
			genStack.pop();
		}
	}
}