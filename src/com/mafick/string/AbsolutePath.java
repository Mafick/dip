package com.mafick.string;

import java.util.ArrayList;
import java.util.List;

public class AbsolutePath {

	public String result(String input) {

		if (input == null) {
			return input;
		}
		String[] splitString = input.split("/");
		List<String> res = new ArrayList<>();
		for (String split : splitString) {
			if (split != null && split.length() > 0) {
				if (split.equals("..")) {
					if (res.size() > 0)
						res.remove(res.size() - 1);
				} else if (!split.equals(".")) {
					res.add(split);
				}
			}
		}
		StringBuilder result = new StringBuilder();
		for (String reslt : res) {
			result.append("/").append(reslt);
		}
		return result.length() == 0 ? "/" : result.toString();
	}
}
