package com.CakeShop;

import java.util.Scanner;

public class DeleteCakeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter cake name to delete");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		DeleteCakeDao.deleteByName(name);
		

	}

}
