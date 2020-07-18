package com.mafick.util;

import java.util.ArrayList;
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

	//

	public void addAdjacentNode(Node node) {
		if (this.adjacent == null) {
			this.adjacent = new ArrayList<>();
		}
		this.adjacent.add(node);
	}

	//

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


	//

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
}
