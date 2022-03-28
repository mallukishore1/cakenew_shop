package com.CakeShop;

import java.util.Scanner;

public class CakeUpdateTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cake name to update");
		String name=sc.next();
		System.out.println("Enter price");
		int price=sc.nextInt();
		CakeUpdationDao.updateByName(price, name);
				

	}

}
