package com.iNeuron.ai;

public class Alpha {

	static void checkAlpha(String str) {

		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int specialChar = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {

				ch = Character.toLowerCase(ch);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

					vowels++;

				} else {

					consonants++;
				}

			} else if (ch >= '0' && ch <= '9') {

				digits++;
			} else {
				specialChar++;

			}

		}

		System.out.println("vowels     : " + vowels);
		System.out.println("consonants : " + consonants);
		System.out.println("digits     : " + digits);
		System.out.println("specialChar: " + specialChar);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "@Sagar17";

		checkAlpha(s);
	}

}
