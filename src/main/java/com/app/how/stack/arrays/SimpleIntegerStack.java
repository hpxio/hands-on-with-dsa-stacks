package com.app.how.stack.arrays;

import com.app.how.stack.Stacks;

/* Chapter-1 Part-B */
public class SimpleIntegerStack implements Stacks<Integer> {

	public static final int _MAX_ = 5;

	private final Integer[] integerArray = new Integer[_MAX_];
	private int top = -1;


	public void push(Integer element) {
		if (top >= (_MAX_ - 1)) {
			System.out.println("Stack is Overflowing!!");
		} else {
			integerArray[++top] = element;
			System.out.println("PUSHED -> " + element);
		}
	}

	public void pop() {
		if (top < 0) {
			System.out.println("Stack is Underflowing!!");
		} else {
			System.out.println("POPPED -> " + integerArray[top--]);
		}
	}

	public void peek() {
		if (top < 0) {
			System.out.println("Stack is Underflowing!!");
		} else {
			System.out.println("PEEKED -> " + integerArray[top]);
		}
	}

	public void display() {
		System.out.println("======Display Stack======");
		for (Integer i : integerArray) {
			System.out.println(i);
		}
	}
}