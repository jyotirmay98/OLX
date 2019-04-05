package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Items;
import model.ItemsDAO;

/**
 * Servlet implementation class AddProductServlet
 */
@MultipartConfig
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("itemName");
		String cat = request.getParameter("category");
		String yOU = request.getParameter("yearsOfUsage");
		String id = request.getParameter("ID");
		byte[] photo;
		InputStream iStream = request.getPart("image").getInputStream();
		int length = iStream.available();
		photo = new byte[length];
		String uId = request.getParameter("uid");
		String p = request.getParameter("price");
		iStream.read(photo, 0, length);
		
		Items i = new Items(name , cat , yOU , id, photo , uId , p);
		
		int c = 0;
		try {
			c = ItemsDAO.addItem(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(c > 0)
		{
			int n = 0;
			try {
				n = ItemsDAO.showNoOfItems(uId);
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
			List<Items> UserItemList = new ArrayList<Items>();
			try {
			UserItemList = ItemsDAO.showItemsOfUser(uId);
			} catch (SQLException e) 
			{
			
				e.printStackTrace();
			}
			HttpSession session = request.getSession();
			session.setAttribute("number", new Integer(n));
			session.setAttribute("items", UserItemList);
			
			response.sendRedirect("Products.jsp");
		}
		
		
		
		out.close();
	}

}
