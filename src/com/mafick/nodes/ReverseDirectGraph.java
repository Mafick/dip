package com.mafick.nodes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mafick.util.Node;

public class ReverseDirectGraph {

	public Node[] result(Node[] input) {

		Map<String, Node> nodeMap = new HashMap<>();

		for (Node currentNode : input) {
			List<Node> adjacents = currentNode.getAdjacent();
			if (adjacents != null) {
				for (Node adjacentNode : adjacents) {
					adjacentNode.addAdjacentNode(currentNode);

					Node node = getOrCreateNewNode(nodeMap, adjacentNode.getValue());
					adjacentNode.addAdjacentNode(node);

				}
				currentNode.setAdjacent(null);
			}


		}


		return input;
	}

	//

	private Node getOrCreateNewNode(Map<String, Node> nodeMap, String nodeValue) {
		if (nodeMap.containsKey(nodeValue)) {
			return nodeMap.get(nodeValue);
		} else {
			Node newNode = new Node(nodeValue);
			nodeMap.put(nodeValue, newNode);
			return newNode;
		}
	}
}
