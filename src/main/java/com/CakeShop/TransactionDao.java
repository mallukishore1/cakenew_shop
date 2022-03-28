package com.CakeShop;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class TransactionDao {
	public static void insertion(int id) throws Exception
	{
		Connection connection=Connectionjdbc.con();
		PreparedStatement statement=null;
		Date date=Date.valueOf(LocalDate.now());
		String query="insert into Cake_transaction(user_id,Cake_id,purchased_on,payment_mode)values(?,?,?,?)";
		statement =connection.prepareStatement(query);
		statement.setInt(1,1);
		statement.setInt(2,2);
		statement.setDate(3,date);
		statement.setString(4,"upi");
		int rows=statement.executeUpdate();
		System.out.println(rows);
	}

}
