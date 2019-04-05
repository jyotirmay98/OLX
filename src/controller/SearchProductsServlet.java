package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Items;
import model.ItemsDAO;

/**
 * Servlet implementation class SearchProductsServlet
 */
@WebServlet("/SearchProductsServlet")
public class SearchProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchProductsServlet() {
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
		 
		 String keyword = request.getParameter("keyword");
		 
		 try 
		 {
			Items i = ItemsDAO.searchItem(keyword);
			
		
			
			HttpSession session = request.getSession();
			session.setAttribute("item", i);
		
			
			response.sendRedirect("index-afterLogin.jsp");
		
		 }
		 catch (SQLException e) 
		 {
			e.printStackTrace();
		 }
		 
		 
		out.close();
	}

}
