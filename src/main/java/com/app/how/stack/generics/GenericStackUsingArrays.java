package com.app.how.stack.generics;

import com.app.how.stack.Stacks;

import java.util.Stack;

public class GenericStackUsingArrays<T> implements Stacks<T> {

	/* Max Array size for Stack */
	public static final int _MAX_ = 3;

	/* Pointer to last-in element in Stack */
	private int top;

	/* Generic Array that work as Stack for this example */
	private final Object[] dataArray = new Object[_MAX_];

	/* Initial state of the Stack */
	public GenericStackUsingArrays() {
		top = -1;
	}

	/**
	 * PUSH Operation will insert new element to the Stack, only if
	 * 1. Stack is either empty
	 * 2. Stack is not full
	 * <p>
	 * Everytime an element is inserted, top will increment by 1.
	 *
	 * @param data Value to store in Stack
	 */
	@Override
	public void push(T data) {
		if (top >= (_MAX_ - 1)) {
			System.out.println("Stack is Overflowing!!");
		} else {
			dataArray[++top] = data;
			System.out.println("PUSHED -> " + data);
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
			System.out.println("Stack is Underflowing!!");
		} else {
			Object o = dataArray[top--];
			System.out.println("POPPED -> " + o);
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
			System.out.println("Stack is Underflowing!!");
		} else {
			System.out.println("PEEKED -> " + dataArray[top]);
		}
	}

	@Override
	public void display() {
		System.out.println("======Display Stack=======");
		for (Object value : dataArray) {
			System.out.println(value);
		}
	}
}