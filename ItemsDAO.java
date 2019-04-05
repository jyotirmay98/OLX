package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;

public class ItemsDAO 
{
	public static Connection getConnection() throws SQLException
	{
		Driver driver=new Driver();
		Connection cN = null;
		
		cN = DriverManager.getConnection("jdbc:mysql://localhost:3306/olx","root","root");
		
		return cN;
	}
	
	public static int addItem(Items i) throws SQLException 
	{
		int status = 0;
		
		Connection cN = ItemsDAO.getConnection();
		
		PreparedStatement pS = cN.prepareStatement("INSERT INTO ITEMS VALUES(?,?,?,?,?,?,?)");
		
		pS.setString(1, i.getItemName());
		pS.setString(2, i.getCategoryId());
		pS.setInt(3, Integer.parseInt(i.getYearsOfUsage()));
		pS.setInt(4 , Integer.parseInt(i.getItemId()));
		pS.setBytes(5 , i.getItemImage());
		pS.setString(6, i.getUserId());
		pS.setString(7, i.getPrice());
		
		status = pS.executeUpdate();
		cN.close();
		return status;
		
	}
	
	public static int showNoOfItems(String id) throws SQLException 
	{
		int n = 0;
		
		Connection cN = ItemsDAO.getConnection();
		
		PreparedStatement pS = cN.prepareStatement("SELECT DISTINCT COUNT(ItemID) FROM ITEMS WHERE UserID = ?");
		
		pS.setString(1, id);
		
		ResultSet rS = pS.executeQuery();
		
		if(rS.next())
		{
			n = rS.getInt(1);
		}
		cN.close();
		return n;
		
		
	}
	
	public static List<Items> searchItem(String keyword) throws SQLException
	{
		Items i = null;
		
		Connection cN = ItemsDAO.getConnection();
		keyword=keyword.trim();
		//keyword="Bike";
		PreparedStatement pS = cN.prepareStatement("SELECT * FROM ITEMS WHERE ItemName=?");
		
		pS.setString(1, keyword);
		List<Items> searchResult = new ArrayList<Items>();
		ResultSet rS = pS.executeQuery();
		
		while(rS.next())
		{
			i = new Items(rS.getString(1) , rS.getString(2) , rS.getString(3) , rS.getString(4) , rS.getBytes(5) , rS.getString(6) , rS.getString(7));
			searchResult.add(i);
		}
		cN.close();
		System.out.println(searchResult.size()+" items found for the keyword : "+keyword);
		return searchResult;
		
		
		
	}
	
	public static List<Items> showItemsOfUser(String id) throws SQLException
	{
		Connection cN = ItemsDAO.getConnection();
		PreparedStatement pS = cN.prepareStatement("SELECT * FROM ITEMS WHERE UserID = ?");
		pS.setString(1, id);
		ResultSet rS = pS.executeQuery();
		List<Items> UserItemList = new ArrayList<Items>(); 
		while(rS.next())
		{
			Items i = new Items(rS.getString(1) , rS.getString(2) , rS.getString(3) , rS.getString(4) , rS.getBytes(5) , rS.getString(6) , rS.getString(7));
			UserItemList.add(i);
			
		}
		
		return UserItemList;
		
	}
	
	public static List<Items> showEveryItem() throws SQLException 
	{
		Connection cN = ItemsDAO.getConnection();
		PreparedStatement pS = cN.prepareStatement("SELECT * FROM ITEMS");
		ResultSet rS = pS.executeQuery();
		List<Items> allItems = new ArrayList<Items>();
		while(rS.next())
		{
			Items i = new Items(rS.getString(1) , rS.getString(2) , rS.getString(3) , rS.getString(4) , rS.getBytes(5) , rS.getString(6) , rS.getString(7));
			allItems.add(i);
		}
		
		return allItems;
		
	}

}
