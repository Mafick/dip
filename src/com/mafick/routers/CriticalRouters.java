package com.mafick.routers;

import java.util.ArrayList;
import java.util.List;

public class CriticalRouters {

	public List<Integer> result(int numRouters, int numLinks, ArrayList<ArrayList<Integer>> links) {

		List<Integer> resultList = new ArrayList<>();
		int routers[] = new int[numRouters];

		for (int i = 0; i < numLinks; i++) {
			Integer startRouter = links.get(i).get(0);
			Integer endRouter = links.get(i).get(1);

			routers[startRouter - 1]++;
			routers[endRouter - 1]++;
		}

		for (int j = 0; j < numRouters; j++) {
			if (routers[j] > 1) {
				resultList.add(j + 1);
			}
		}

		return resultList;
	}

}
