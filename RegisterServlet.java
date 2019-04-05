package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Address;
import model.AddressDAO;
import model.User;
import model.UserDAO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String f = request.getParameter("fName");
		String l = request.getParameter("lName");
		String DOB = request.getParameter("dOB");
		String g = request.getParameter("Gender");
		String n = request.getParameter("pNumber");
		String id = request.getParameter("uid");
		String p = request.getParameter("password");
		String e = request.getParameter("eMail");
		String s = request.getParameter("street");
		String sub = request.getParameter("sLocation");
		String c = request.getParameter("city");
		String state = request.getParameter("stateslist");
		String country = request.getParameter("country");
		String pincode = request.getParameter("pCode");
		
		User u = new User(f , l , DOB , g , n , id , p , e , c);
		Address a = new Address(s , sub , c , state , country , pincode , id);
		
		try 
		{
			int s1 = UserDAO.addUser(u);
			int s2 = AddressDAO.addAddress(a);
			
			if(s1 > 0 && s2 > 0)
			{
				out.println("You have been registered!");
				response.sendRedirect("Login.jsp");
			}
		} 
		catch (SQLException | ParseException e1) 
		{
			e1.printStackTrace();
		}
		
		out.close();
		
	}

}
