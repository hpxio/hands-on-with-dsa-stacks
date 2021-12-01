package com.app.how.stack;

public interface Stacks<T> {

	/**
	 * PUSH Operation will insert new element to the Stack, only if
	 * 1. Stack is either empty
	 * 2. Stack is not full
	 * Everytime an element is inserted, top will increment by 1.
	 *
	 * @param element Value to store in Stack
	 */
	void push(T element);

	/**
	 * POP operation will remove top element from Stack ,only if
	 * 1. Stack has at least one value
	 * Everytime an element is removed, top will decrement by 1.
	 */
	void pop();

	/**
	 * PEEK operation will display top element, only if
	 * 1. Stack is not empty
	 * Everytime an element is peeked, no change occur in stack or top
	 */
	void peek();

	void display();
}