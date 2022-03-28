package com.CakeShop;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CakeUpdationDao {
	public static void updateByName(int price,String name) throws Exception
	{
		Connection connection=Connectionjdbc.con();
		PreparedStatement statement=null;
		String query="update Cake_list set price=? where Cake_name=?";
		statement =connection.prepareStatement(query);
		statement.setInt(1, price);
		statement.setString(2, name);
		int rows=statement.executeUpdate();
		System.out.println(rows);
	}

}
