package com.CakeShop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListAllCakesDAO {
	
	public static List<Cakes> listAll() throws Exception{
		List<Cakes> menu=new ArrayList<Cakes>();
		String cake=null;
		Integer price=0;
		Integer cake_id;
		Integer id=0;
		Connection connect=Connectionjdbc.con();
		String query="Select * from Cake_list";
		Statement statement=connect.createStatement();
		ResultSet data=statement.executeQuery(query);
		
		while(data.next()) {
			cake=data.getString("cake_name");
			price=data.getInt("price");
			cake_id=data.getInt("Cake_id");
			Cakes list=new Cakes();
			list.setId(cake_id);
			list.setPrice(price);
			list.setCake(cake);
			menu.add(list);
		}
		return menu;
		
	}

}
