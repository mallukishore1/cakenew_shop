package com.CakeShop;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class OrderCake {
	static List<Integer>list=null;
	static Scanner sc=new Scanner(System.in);
	public static void orderCake() throws Exception
	{
		List<Cakes> cakes=ListAllCakesDAO.listAll();
		for(Cakes cake:cakes)
		{
			System.out.println(cake.getId()+"  "+cake.getCake()+"   "+cake.getPrice());
		}
		list=new ArrayList<Integer>();
		purchaseCake();
	}
	public static void purchaseCake() throws Exception
	{
		int total =0;
		System.out.println("Select the cake you want by choosing the id");
		int id=sc.nextInt();
		list.add(id);
		int price = 0;
		for(Integer Cake_id:list);
		{
		price=PriceFinder.priceFinder(id);
		total = total+price;
		}
		
		System.out.println("Your total price is"+total);
		System.out.println(" 1)Continue to payment");
		System.out.println(" 2)Buy another cake");
		int option=sc.nextInt();
		if(option==1)
		{
			int payment=payment(price);
			if(payment==1)
			{
				TransactionDao.insertion(id);
				System.out.println("Order placed successfully");
			}
		}
		else
		{
			purchaseCake();
		}
		
	}
	public static int payment(int price)
	{
		System.out.println("Enter upi id");
		String upi=sc.next();
		if(upi.contains("@"))
		{
			System.out.println("your total price is"+price);
			System.out.println("Enter amout to pay");
			int amount=sc.nextInt();
			if(amount>price || amount<price)
			{
				System.out.println("please pay"+price);
				payment(price);
			}
			else if(amount==price)
			{
				return 1;
			}
			
		}
		else
		{
			payment(price);
		}
		return 1;
	}

}
