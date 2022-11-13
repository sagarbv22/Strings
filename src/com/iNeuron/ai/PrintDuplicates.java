package com.iNeuron.ai;

import java.util.Arrays;

public class PrintDuplicates {

	static void duplicates(char[] str, int n) {

		int count;

		for (int i = 0; i < str.length; i++) {
			count = 1;
			for (int j = i + 1; j < str.length; j++) {

				if (str[i] == str[j] && str[i] != ' ') {

					count++;
					str[j] = '0';

				}
			}

			if (str[i] != '0' && count > 1) {
				System.out.println(str[i]);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I am sagar from Bangalore";
		int n = s.length();

		char[] ch = s.toCharArray();

		duplicates(ch, n);

	}

}
