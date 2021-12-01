package com.app.how.stack.linkedlist;

import com.app.how.stack.Stacks;

public class SimpleStackUsingLinkedList implements Stacks<String> {

	/* Array that work as Stack for this example */
	class Node {

		private String data;
		private Node next;

		Node() {
			next = null;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	/* Pointer to last-in element in Stack */
	private Node top;


	public SimpleStackUsingLinkedList() {
		top = null;
	}

	@Override
	public void push(String element) {
		Node newNode = new Node();
		Node tempNode = top;

		newNode.setData(element);
		newNode.setNext(tempNode);
		top = newNode;

		System.out.println("PUSHED -> " + newNode.getData());
	}

	@Override
	public void pop() {
		if (top == null) {
			System.out.println("Stack is UnderFlowing!!");
		} else {
			Node nextNode = top.getNext();
			System.out.println("POPPED -> " + top.getData());

			top = nextNode;
		}
	}

	@Override
	public void peek() {
		if (top != null) {
			System.out.println("PEEKED -> " + top.getData());
		}
	}

	@Override
	public void display() {
		if (top == null) {
			System.out.println("Stack is UnderFlowing!!");
		} else {
			System.out.println("=======Display Stack======");

			Node currentNode = top;
			while (currentNode != null) {
				System.out.println("NODE -> " + currentNode.getData());
				currentNode = currentNode.getNext();
			}
		}

	}
}