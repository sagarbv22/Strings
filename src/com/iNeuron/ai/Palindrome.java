package com.iNeuron.ai;

public class Palindrome {

	static void checkPalindrome(int n) {

		int copy = n;
		int reverse = 0;
		int lastDigit;

		while (n > 0) {

			lastDigit = n % 10;
			reverse = reverse * 10 + lastDigit;
			n = n / 10;

		}
		if (copy == reverse) {
			System.out.println("It is a Palindrome.");
		} else {
			System.out.println("Not a Palindrome.");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2552;
		checkPalindrome(num);

	}

}
