package com.CakeShop;
import java.util.Scanner;

public class LoginTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

			Validation get = new Validation();
			int option = 0;
			String email = null;
			String password = null;
			System.out.println("Enter your email");
			email = sc.next();
			System.out.println("Enter your password");
			password = sc.next();
			option = get.checkEmailAndPassword(email,password);
			if (option == 1) {
				System.out.println("Login Successful");
			}
			else {
				System.out.println("Login Unsuccessful");
			}
		

	}

}
