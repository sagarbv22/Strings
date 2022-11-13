package com.iNeuron.ai;

public class UniqueChar {

	static boolean checkUniqueChar(char[] ch) {

		boolean flag = false;

		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					flag = true;
					break;
				}

			}
			if (flag == true) {
				break;
			}

		}

		return flag;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ABCDE!789";
		char[] ch = s.toCharArray();

		boolean unique = checkUniqueChar(ch);

		if (unique == true) {
			System.out.println("Not all char are unique");
		} else {
			System.out.println("All are Unique");
		}

	}

}
