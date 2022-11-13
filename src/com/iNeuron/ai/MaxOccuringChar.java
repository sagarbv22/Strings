package com.iNeuron.ai;

public class MaxOccuringChar {

	static final int ASCII_SIZE = 256;

	static void checkMaxOccurChar(String str) {

		int[] count = new int[ASCII_SIZE];
		int maxCount = -1;
		char freqChar = ' ';

		for (int i = 0; i < str.length(); i++) {

			count[str.charAt(i)]++;

		}

		for (int j = 0; j < str.length(); j++) {

			if (maxCount < count[str.charAt(j)]) {
				maxCount = count[str.charAt(j)];
				freqChar = str.charAt(j);
			}
		}

		System.out.println("Max occurring character is " + freqChar + " :- " + maxCount);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sagar";
		checkMaxOccurChar(str);
	}

}
