package com.app.how.stack.linkedlist;

import com.app.how.stack.Stacks;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenericStackUsingLinkedList<R> implements Stacks<R> {

	static class Node<R> {
		private R data;
		private Node<R> next;

		Node() {
			next = null;
		}

		public R getData() {
			return data;
		}

		public void setData(R data) {
			this.data = data;
		}

		public Node<R> getNext() {
			return next;
		}

		public void setNext(Node<R> next) {
			this.next = next;
		}
	}

	private Node<R> top;

	public GenericStackUsingLinkedList() {
		top = null;
	}

	@Override
	public void push(R element) {
		final Node<R> newNode = new Node<>();
		newNode.setData(element);
		newNode.setNext(top);

		top = newNode;
	}

	@Override
	public void pop() {
		if (top == null) {
			log.info("Stacks is Under Flowing!!");
		} else {
			log.info("POPPED -> {}", top.getData());
			top = top.getNext();
		}
	}

	@Override
	public void peek() {
		if (top == null) {
			log.info("Stack is Under Flowing!!");
		} else {
			log.info("PEEKED -> {}", top.getData());
		}
	}

	@Override
	public void display() {
		if (top == null) {
			log.info("Stacks is Under Flowing!!");
		} else {
			Node<R> currentNode = this.top;
			while (currentNode != null) {
				log.info("NODE -> {}", currentNode.getData());
				currentNode = currentNode.getNext();
			}
		}
	}
}