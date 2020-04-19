package com.mafick.list;

import java.util.LinkedList;
import java.util.List;

public class ReverseList {


	public List<Integer> result_interative(List<Integer> input) {
		List<Integer> result = new LinkedList<>();

		for (int i = input.size() - 1; i >= 0; i--) {
			result.add(input.get(i));
		}

		return result;
	}

	public List<Integer> result_recursive(List<Integer> input) {
		List<Integer> result = new LinkedList<>();
		MyLinkedList myLinkedList = new MyLinkedList();

		for (int i = input.size() - 1; i >= 0; i--) {
			myLinkedList.insertNode(input.get(i));
		}

		Node reversedHeadNode = reverse(myLinkedList.head);

		while (reversedHeadNode != null) {
			result.add(reversedHeadNode.data);
			reversedHeadNode = reversedHeadNode.next;
		}

		return result;
	}

	//

	static Node reverse(Node head) {
		if (head == null) {
			return head;
		}

		if (head.next == null) {
			return head;
		}

		Node newHeadNode = reverse(head.next);

		head.next.next = head;
		head.next = null;

		return newHeadNode;
	}


	private static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private static class MyLinkedList {
		public Node head;

		public MyLinkedList() {
			this.head = null;
		}

		public void insertNode(int data) {
			Node node = new Node(data);

			if (this.head != null) {
				node.next = head;
			}
			this.head = node;
		}
	}
}
