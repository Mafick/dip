package com.mafick.nodes;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mafick.util.Node;

public class ReverseDirectGraphTestData {

	/**
	 * Input:
	 * A -> B, B -> C, A ->C
	 * <p>
	 * Output:
	 * B->A, C -> B, C -> A
	 */


	public static Node[] creteTestData() {

		Node node_a = new Node("a");
		Node node_b = new Node("b");
		Node node_c = new Node("c");

		node_a.setAdjacent(Stream.of(node_b, node_c).collect(Collectors.toList()));
		node_b.setAdjacent(Stream.of(node_c).collect(Collectors.toList()));

		Node[] testData = {node_a, node_b, node_c};

		System.out.println("Input:     " + Arrays.toString(testData));
		return testData;
	}
}
