package com.app.how.stack.arrays;

import com.app.how.stack.Stacks;

/* Chapter-1 Part-A */
public class SimpleStringStack implements Stacks<String> {

	/* Max Array size for Stack */
	public static final int _MAX_ = 5;

	/* Array that work as Stack for this example */
	private final String[] stringArray = new String[_MAX_];

	/* Pointer to last-in element in Stack */
	private int top = -1;

	/**
	 * PUSH Operation will insert new element to the Stack, only if
	 * 1. Stack is either empty
	 * 2. Stack is not full
	 * <p>
	 * Everytime an element is inserted, top will increment by 1.
	 *
	 * @param element Value to store in Stack
	 */
	@Override
	public void push(String element) {
		if (top >= (_MAX_ - 1)) {
			System.out.println("Stack Overflowing!!");
		} else {
			stringArray[++top] = element;
			System.out.println("PUSHED -> " + element);
		}
	}

	/**
	 * POP operation will remove top element from Stack ,only if
	 * 1. Stack has at least one value
	 * <p>
	 * Everytime an element is removed, top will decrement by 1.
	 */
	@Override
	public void pop() {
		if (top < 0) {
			System.out.println("Stack Underflowing!!");
		} else {
			System.out.println("POPPED -> " + stringArray[top--]);
		}
	}

	/**
	 * PEEK operation will display top element, only if
	 * 1. Stack is not empty
	 * <p>
	 * Everytime an element is peeked, no change occur in stack or top
	 */
	@Override
	public void peek() {
		if (top < 0) {
			System.out.println("Stack Underflowing!!");
		} else {
			System.out.println("PEEKED -> " + stringArray[top]);
		}
	}

	/* Not a traversal method */
	@Override
	public void display() {
		System.out.println("====Display Stack====");
		for (String s : stringArray) {
			System.out.println(s);
		}
	}
}