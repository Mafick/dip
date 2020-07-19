package com.mafick.string;

import java.util.LinkedList;
import java.util.List;

public class CompareVersionNumber {


	public int result(String version1string, String version2string) {

		Version version_1 = new Version(version1string);
		Version version_2 = new Version(version2string);

		int result = version_1.compareTo(version_2);

		return result;
	}

	public static class Version implements Comparable<Version> {

		private final List<Integer> versionParts = new LinkedList<>();

		public Version(String originalString) {

			String[] version_splits = originalString.split("\\.");

			for (String version_split : version_splits) {
				int intValue = Integer.parseInt(version_split);
				this.versionParts.add(intValue);
			}

		}

		@Override
		public int compareTo(Version otherVersion) {
			for (int i = 0; i < this.versionParts.size(); i++) {
				if (i >= otherVersion.versionParts.size()) {
					if (this.versionParts.get(i) > 0) {
						return 1;
					}
				} else {
					if (this.versionParts.get(i) > otherVersion.versionParts.get(i)) {
						return 1;
					}

					if (this.versionParts.get(i) < otherVersion.versionParts.get(i)) {
						return -1;
					}
				}
			}
			return 0;
		}

	}
}
