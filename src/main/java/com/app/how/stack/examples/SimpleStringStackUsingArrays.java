package com.app.how.stack.examples;

import com.app.how.stack.arrays.SimpleStringStack;

public class SimpleStringStackUsingArrays {

	public static void simpleStringStackExample() {
		final SimpleStringStack simpleStringStack = new SimpleStringStack();

		/* PUSH Operation */
		simpleStringStack.push("First Element");
		simpleStringStack.push("Second Element");
		simpleStringStack.push("Third Element");
		simpleStringStack.push("Fourth Element");
		simpleStringStack.push("Fifth Element");

		/* Display Stack */
		simpleStringStack.display();

		/* POP & PEEK Operation */
		simpleStringStack.pop();
		simpleStringStack.peek();

		/* <======= Edge Cases =======> */
		simpleStringStack.push("Sixth Element");
		simpleStringStack.display();

		/* Adding this should over-flow stack */
		simpleStringStack.push("Seventh Element");

		/* Pop all elements & under-flow */
		for (int i = 0; i < SimpleStringStack._MAX_ + 1; i++) {
			simpleStringStack.peek();
			simpleStringStack.pop();
		}
	}
}
