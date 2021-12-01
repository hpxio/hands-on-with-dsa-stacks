package com.app.how.stack.examples;

import com.app.how.stack.linkedlist.SimpleStackUsingLinkedList;

public class SimpleStackUsingLinkedListExample {

	public static void simpleStackUsingLinkedListExample() {
		SimpleStackUsingLinkedList stackUsingLinkedList = new SimpleStackUsingLinkedList();

		stackUsingLinkedList.push("First Element");
		stackUsingLinkedList.push("Second Element");
		stackUsingLinkedList.push("Third Element");
		stackUsingLinkedList.push("Fourth Element");
		stackUsingLinkedList.push("Fifth Element");
		stackUsingLinkedList.push("Sixth Element");

		stackUsingLinkedList.display();

		stackUsingLinkedList.peek();
		stackUsingLinkedList.display();

		/* Removing 6 times */
		for (int i = 0; i <= 6; i++) {
			stackUsingLinkedList.pop();
		}
		stackUsingLinkedList.display();
	}
}
