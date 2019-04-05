
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Driver;


public class AddressDAO 
{
	public static Connection getConnection() throws SQLException
	{
		Connection cN = null;
		
		com.mysql.jdbc.Driver driver = new Driver();
		
		cN = DriverManager.getConnection("jdbc:mysql://localhost:3306/olx","root","root");
		
		return cN;
	}
	
	public static int addAddress(Address a) throws SQLException
	{
		int status = 0;
		
		Connection CN = AddressDAO.getConnection();
		PreparedStatement pS = CN.prepareStatement("INSERT INTO ADDRESS VALUES (?,?,?,?,?,?,?)");
		
		pS.setString(1, a.getStreet());
		pS.setString(2, a.getSubLocation());
		pS.setString(3, a.getCity());
		pS.setInt(4, Integer.parseInt(a.getState()));
		pS.setString(5, a.getCountry());
		pS.setString(6, a.getPincode());
		pS.setString(7, a.getUserId());
		
		status =  pS.executeUpdate();
		
		return status;
		
		
	}
	

}
