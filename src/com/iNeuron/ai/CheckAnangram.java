package com.iNeuron.ai;

import java.util.Arrays;

public class CheckAnangram {

	static void anagramOrNot(String str1, String str2) {

		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");

		String str3 = "";

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') {

				str3 = str3 + (char) (str1.charAt(i) + 32);

			}
		}

		char[] ch1 = str3.toCharArray();
		char[] ch2 = str2.toCharArray();

		for (int j = 0; j < ch1.length; j++) {
			for (int k = 1; k < ch1.length - j; k++) {

				if (ch1[k] < ch1[k - 1]) {
					char temp = ch1[k];
					ch1[k] = ch1[k - 1];
					ch1[k - 1] = temp;
				}

			}
		}

		for (int m = 0; m < ch2.length; m++) {
			for (int n = 1; n < ch2.length - m; n++) {

				if (ch2[n] < ch2[n - 1]) {
					char temp = ch2[n];
					ch2[n] = ch2[n - 1];
					ch2[n - 1] = temp;
				}
			}
		}

		if (Arrays.equals(ch2, ch1)) {
			System.out.println("Anangram");
		} else {
			System.out.println("Not an Anangram");
		}

	}

	public static void main(String[] args) {

		String a = "DEBIT CARD";
		String b = "bad credit";

		anagramOrNot(a, b);
	}

}
