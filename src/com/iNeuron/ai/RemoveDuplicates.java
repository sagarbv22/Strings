package com.iNeuron.ai;

import java.util.Arrays;

public class RemoveDuplicates {

	static String duplicates(char[] str, int n) {

		int index = 0;

		for (int i = 0; i < n; i++) {

			int j;
			for (j = 0; j < i; j++) {

				if (str[i] == str[j]) {
					break;
				}

			}

			if (j == i) {

				str[index++] = str[i];

			}

		}

		return String.valueOf(Arrays.copyOf(str, index));

	}

	public static void main(String[] args) {

		String s = "fullstackjavadeveloper";
		int n = s.length();

		char[] str = s.toCharArray();

		System.out.println(duplicates(str, n));

	}

}
