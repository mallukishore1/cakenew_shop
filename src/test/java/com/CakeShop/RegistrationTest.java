package com.CakeShop;
import com.CakeShop.Validation;
import com.CakeShop.Registration;
import java.util.Scanner;

public class RegistrationTest {
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
			System.out.println("this email or password already exist");
		}
		else {
			DetailsRequired(email,password);
		}
	}
	static void DetailsRequired (String email,String passsword) throws Exception {
		
	
		System.out.println("1.Enter your name");
		String name = sc.next();
		System.out.println("Enter your phoneNumber");
		String phoneNumber = sc.next();
		Registration obj = new Registration(name,email,passsword,phoneNumber);
		int n= UserDAO.Datain(obj);
		if(n == 1) {
			System.out.println("registration successfull");
		}else {
			
				System.out.println("registration unsuccessfull");
			
		}
		
	}
}


