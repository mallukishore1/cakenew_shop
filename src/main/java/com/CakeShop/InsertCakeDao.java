package com.CakeShop;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertCakeDao {
	public static void cakeInsertion(String name,int price) throws Exception
	{
		Connection connection=Connectionjdbc.con();
		PreparedStatement statement=null;
		String query="insert into Cake_list(Cake_name,price)values(?,?)";
		statement =connection.prepareStatement(query);
		statement.setString(1,name);
		statement.setInt(2,price);
		int rows=statement.executeUpdate();
		System.out.println(rows);
	}

}
