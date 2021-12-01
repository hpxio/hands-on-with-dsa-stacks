package com.app.how.stack.examples;

import com.app.how.stack.arrays.SimpleIntegerStack;

public class SimpleIntegerStackUsingArrays {
	public static void simpleIntegerStackExample() {
		final SimpleIntegerStack simpleIntegerStack = new SimpleIntegerStack();

		simpleIntegerStack.push(20);
		simpleIntegerStack.push(8);
		simpleIntegerStack.push(-1);
		simpleIntegerStack.push(67);
		simpleIntegerStack.push(-9);

		simpleIntegerStack.peek();

		for (int i = 0; i < SimpleIntegerStack._MAX_; i++) {
			simpleIntegerStack.pop();
		}
	}
}