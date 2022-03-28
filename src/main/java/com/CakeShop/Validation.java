package com.CakeShop;

public class Validation {
	static int count = 0;

	public static int checkEmailAndPassword(String email, String password) throws Exception {
		int verify = 0;
		if (email.isEmpty() || email.isBlank()&& password.isEmpty() || password.isBlank()&& password.length() < 8) {
			throw new Exception("enter valid Email or password");

		} else {
			if (email.contains("@gmail.com")) {
				verify = UserDAO.checkValidaton(email,password);
			}	
		}
		return verify;
	}

	public static int Checknumber(String number) throws Exception {
		char count1 = 0;
		char[] Checknumber = number.toCharArray();
		if (number.length() < 10 || number.length() > 10) {
			throw new Exception("Enter only 10 Digits  ");

		} else {
			count1++;
		}
		for (char i : Checknumber) {
			if (Character.isAlphabetic(i)) {
				count1++;
				throw new Exception("only number");

			}
			if (count1 == 1) {
				break;

			}

		}
		return 1;

	}
}
