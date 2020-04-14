package com.mafick.blocks;

import java.util.List;

public class FindBlocks {

	int numberAmazonGoStores(int rows, int column, List<List<Integer>> grid) {
		int storeCounter = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				if (grid.get(i).get(j) == 1) {
					boolean isNew = checkPreviuosBlock(i, j, grid);
					if (isNew) {
						storeCounter++;
					}
				}
			}
		}
		return storeCounter;
	}

	//

	private boolean checkPreviuosBlock(int i, int j, List<List<Integer>> grid) {
		if (i == 0) {
			return false;
		}
		if (grid.get(i - 1).get(j) == 0) {
			return false;
		}
		return true;
	}
}
