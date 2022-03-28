package com.CakeShop;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteCakeDao {
	public static void deleteByName(String name) throws Exception
	{
		Connection connection=Connectionjdbc.con();
		PreparedStatement statement=null;
		String query="delete from Cake_list where Cake_name=?";
		statement =connection.prepareStatement(query);
		statement.setString(1,name);
		int rows=statement.executeUpdate();
		System.out.println(rows);
	}

}
