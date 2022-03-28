package com.CakeShop;

import java.util.Scanner;

public class InsertCakeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cake name to insert");
		String name=sc.next();
		System.out.println("Enter price");
		int price=sc.nextInt();
		InsertCakeDao.cakeInsertion(name, price);

	}

}
