package com.CakeShop;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ListAllCakes {
	static Scanner sc=new Scanner(System.in);
	public static void listAll() throws Exception {
		List<Cakes> menu = new ArrayList<Cakes>();
		menu = ListAllCakesDAO.listAll();

		System.out.println("Cakeid        Cakes                  \t Price");
		for (Cakes i : menu) {
			System.out.println(i.getId()+"\t"+i.getCake() + "       \t" + i.getPrice());
		}	

				
		}
		
		
	}
	
	
	
	
	
	