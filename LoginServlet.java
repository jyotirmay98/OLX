package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Items;
import model.ItemsDAO;
import model.User;
import model.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String p = request.getParameter("pNumber");  
	    String e = request.getParameter("eMail");  
	          
	    try 
	    {
	    	User user = UserDAO.checkUser(p, e);
	    
			if(user !=null)
			{
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				List<Items> items = ItemsDAO.showItemsOfUser(user.getUserId());
				session.setAttribute("items", items);
				
				response.sendRedirect("index-afterLogin.jsp");
				
				
			}  
			else
			{  
			    out.print("The details provided do not match");  
			    RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
			    rd.include(request,response);  
			}
		}
	    catch (SQLException e1) 
	    {
			e1.printStackTrace();
		}  
	          
	    out.close();
		
		
	}

}
