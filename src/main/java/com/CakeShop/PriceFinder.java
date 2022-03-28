package com.CakeShop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PriceFinder {
	public static int priceFinder(int id) throws Exception
	{
		Connection connection=Connectionjdbc.con();
		PreparedStatement statement=null;
		String query="select price from Cake_list where Cake_id=?";
		statement =connection.prepareStatement(query);
		statement.setInt(1, id);
		ResultSet result=statement.executeQuery();
		int price=0;
		while(result.next())
		{
			price=result.getInt("price");
		}
		return price;
	}

}
