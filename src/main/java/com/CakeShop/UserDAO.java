package com.CakeShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	public static int Datain(Registration obj) throws Exception {
		String query = "insert into Cake_Shop (NAME,email,PASSWORD,NUMBER) values" + "('" + obj.name + "','" + obj.email
				+ "','" + obj.password + "','" + obj.number + "')";
		System.out.println(query);
		Connection con = Connectionjdbc.con();
		Statement statement = con.createStatement();
		int rs = statement.executeUpdate(query);
		return rs;
		
	}

	@SuppressWarnings("finally")
	public static int checkValidaton(String email, String password)throws Exception {
		
		String query = null;
		int result = 0;
		StringBuilder querystr = new StringBuilder();
		Connection connection = Connectionjdbc.con();
		Statement statement = connection.createStatement();
		try {

			querystr.append("select  email,password from Cake_Shop where email = ('").append(email).append("') or password = ('").append(password).append("')");
			query = querystr.toString();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				result++;
			}
		} catch (Exception e) {
			connection.close();
			e.printStackTrace();
		} finally {

			return result;
		}

	}
	
	
	public  static ResultSet orderCake(String query) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		Statement run = connection.createStatement();
//		ResultSet
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
