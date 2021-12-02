package com.app.how.stack.questions.strings;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReverseAStringUsingStack {
	private static final StringReverseStack SRS = new StringReverseStack();

	public static void main(String[] args) {

		/* Happy-path case */
		String reversedString = SRS.reversedString("This is a sample String".toCharArray());
		log.info("Reversed String -> {}", reversedString);

		/* Edge condition */
		String reversedString1 = SRS.reversedString(("Based on your input, get a random alpha numeric string. The random string generator creates a" +
				" series of numbers and letters that have no pattern. These can be helpful for creating security codes.").toCharArray());
		log.info("Reversed String -> {}", reversedString1);
	}
}

@Slf4j
class StringReverseStack {
	private static final int _MAX_ = 256;
	private char[] input = new char[_MAX_];

	private int top;

	/* Initially stack is empty */
	public StringReverseStack() {
		top = -1;
	}

	private void push(char c) {
		if (top >= (_MAX_ - 1)) {
			log.error("Stack is over flowing!");
		} else {
			input[++top] = c;
		}
	}

	private char pop() {
		if (top < 0) {
			log.error("Stack is under flowing!!");
		} else {
			return input[top--];
		}
		return '\0';
	}

	private char peek() {
		if (top < 0) {
			log.error("Stack is under flowing!!");
			return '\0';
		} else {
			return input[top];
		}
	}

	private void display() {
		log.info("Stack Elements");
		for (int i = 0; i < input.length && input[i] != '\0'; i++) {
			log.info("Element {} -> {}", i, input[i]);
		}
	}

	String reversedString(char[] str) {
		if (str.length > _MAX_) {
			log.error("String input is too large!!");
			return null;
		}

		/* Feed input to the Stack */
		for (char c : str) {
			this.push(c);
		}

		/* Show stack elements */
		this.display();

		/* Read from stack */
		final StringBuilder sbr = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			sbr.append(this.pop());
		}

		return sbr.toString();
	}
}