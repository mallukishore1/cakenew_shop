package com.CakeShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ListTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		listcakes();

	}

	public static void listcakes() throws Exception {
		ListAllCakes.listAll();
		System.out.println("Select cake");
		int cakeorder = sc.nextInt();
		while (cakeorder >= 8 || cakeorder <= 0) {
			System.out.println("Enter a valid key");
			cakeorder = sc.nextInt();
		}
		orderCake(cakeorder);
	}

	public static void orderCake(int cakeOrder) throws Exception {
		String cake_name = null;
		int price = 0;
		String query = "select * from Cake_list where Cake_id='" + cakeOrder + "'";
		// Statement statement=connect.createStatement();
		ResultSet details = Displaycall(query);
		while (details.next()) {
			cake_name = details.getString("Cake_name");
			price = details.getInt("price");
		}
		System.out.println("Your selected cake is- " + cake_name);
		System.out.println("Your Bill- " + price);
		System.out.println("Your order placed successfully");
		System.out.println("Enter 1 to order another cake");
		System.out.println("Enter 2 to Exit from app");
		int opt = sc.nextInt();
		while (opt >= 3) {
			System.out.println("Enter a valid key");
			opt = sc.nextInt();
		}
		if (opt == 1) {
			listcakes();
		}

		if (opt == 2) {
			System.exit(0);
		}

	}

	public static ResultSet Displaycall(String query) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		Statement run = connection.createStatement();
		ResultSet get = run.executeQuery(query);
		return get;
	}

}
