package com.app.how.stack.examples;

import com.app.how.stack.linkedlist.GenericStackUsingLinkedList;

public class GenericStackUsingLinkedListsExample {
	public static void genericStackUsingLinkedListsExample() {
		GenericStackUsingLinkedList<String> genericStackUsingLinkedList = new GenericStackUsingLinkedList<>();

		genericStackUsingLinkedList.push("First Element");
		genericStackUsingLinkedList.push("Second Element");
		genericStackUsingLinkedList.push("Third Element");
		genericStackUsingLinkedList.push("Fourth Element");
		genericStackUsingLinkedList.push("Fifth Element");
		genericStackUsingLinkedList.push("Sixth Element");

		genericStackUsingLinkedList.display();

		genericStackUsingLinkedList.pop();
		genericStackUsingLinkedList.display();

		genericStackUsingLinkedList.peek();
	}
}