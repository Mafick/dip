package com.mafick.util;

import java.util.List;

public class Node {

	private String value;
	private List<Node> adjacent;

	public Node(String value, List<Node> adjacent) {
		this.value = value;
		this.adjacent = adjacent;
	}

	public Node(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<Node> getAdjacent() {
		return adjacent;
	}

	public void setAdjacent(List<Node> adjacent) {
		this.adjacent = adjacent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		if (adjacent != null) {
			for (Node node : adjacent) {
				builder.append(value)
						.append("->")
						.append(node.getValue())
						.append(" ");
			}
		} else {
			builder.append(value)
					.append("->");
		}

		return builder.toString();
	}
}
