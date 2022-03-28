package com.CakeShop;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Connectionjdbc {
	public static Connection con() throws Exception {
		// TODO Auto-generated method stub
		// Drivermanager
		// 1Class.forName("com.mysql.jdbc.Driver");
		// get connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		//System.out.println("connection geted =" + connection);
		// Execute query
		
	 return connection;
	}

}
