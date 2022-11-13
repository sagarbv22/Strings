package com.iNeuron.ai;

public class Pangram {

	static void checkPangram(String str) {

		str = str.replace(" ", "");

		int[] arr = new int[26];

		char[] ch = str.toCharArray();

		for (int j = 0; j < ch.length; j++) {

			int index = ch[j] - 65;
			arr[index]++;

		}

		boolean flag = false;
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] == 0) {

				flag = true;
			}
		}

		if (flag == true) {
			System.out.println("Not a Pangram");
		} else {
			System.out.println("Pangram");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "THE FIVE BOXING WIZARDS JUMP QUICKLY";

		checkPangram(s);
	}

}
