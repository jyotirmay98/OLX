package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.mysql.jdbc.Driver;

public class UserDAO 
{
	public static Connection getConnection() throws SQLException
	{
		Connection cN = null;
		com.mysql.jdbc.Driver driver = new Driver();
		cN = DriverManager.getConnection("jdbc:mysql://localhost:3306/olx","root","root");
		return cN;
	}

	public static int addUser(User u) throws SQLException, ParseException 
	{
		int status = 0;
		
		Connection cN = UserDAO.getConnection();
		
		PreparedStatement pS = cN.prepareStatement("INSERT INTO USER VALUES(?,?,?,?,?,?,?,?,?)");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dT = sdf.parse(u.getDateOfBirth());
		GregorianCalendar cD = new GregorianCalendar();
		
		cD.setTime(dT);
		LocalDate date = LocalDate.now();

		LocalDate dOB = LocalDate.of(cD.get(Calendar.YEAR), cD.get(Calendar.MONTH)+1 , cD.get(Calendar.DAY_OF_MONTH));
		Period p = Period.between(dOB, date);
		
		
		
		pS.setString(1, u.getFirstName());
		pS.setString(2, u.getLastName());
		pS.setInt(3, p.getYears());
		pS.setString(4, u.getGender());
		pS.setString(5, u.getContactNumber());
		pS.setString(6, u.getUserId());
		pS.setString(7, u.getPassword());
		pS.setString(8, u.getEmail());
		pS.setString(9, u.getAddress());
		
		status = pS.executeUpdate();
		return status;
		
		
		
	}
	
	public static User checkUser(String phoneNumber , String email) throws SQLException
	{
		
		
		Connection cN = UserDAO.getConnection();
		PreparedStatement pS = cN.prepareStatement("SELECT * FROM USER WHERE ContactNumber = ? AND Email = ?");
		
		pS.setLong(1, Long.parseLong(phoneNumber));
		pS.setString(2, email);
		
		ResultSet rS = pS.executeQuery();
		
		User user=null;
		
		if(rS.next())
		{
			user=new User(rS.getString(1), rS.getString(2), rS.getString(3), rS.getString(4), rS.getString(5), rS.getString(6), rS.getString(7), rS.getString(8), rS.getString(9));
		}
	
		
	    return user;
		
		
	}
	

}
