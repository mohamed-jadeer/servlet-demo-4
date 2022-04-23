package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class reg
 */
@WebServlet(urlPatterns = {"/reg"})
public class reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Connection cn=dbcon.get();
			
			PreparedStatement p = (PreparedStatement) cn.prepareStatement("INSERT INTO register (name, sex, email, pwd) VALUES (?,?,?,?)");
			p.setString(1, request.getParameter("name"));
			p.setString(2, request.getParameter("sex"));
			p.setString(3, request.getParameter("email"));
			p.setString(4, request.getParameter("pass1"));
		if(	request.getParameter("pass1").equals(request.getParameter("pass2")))
		{
			p.execute();
			response.sendRedirect("../testy/HomePage.jsp");
		}	else
		{
			
		}
			
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
