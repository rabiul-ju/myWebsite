package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DatabaseQuery;

/**
 * Servlet implementation class Login
 *
@WebServlet("/Login")*/
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		ResultSet rs = null;
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		DatabaseQuery q=new DatabaseQuery();
		rs=q.login(username, password);
		
		
		try {
			if(rs.next()){
				response.sendRedirect("adminpages/superadmin.jsp");
			}
			
			else if(rs.next()==false){
				//response.setCharacterEncoding("invalid login");
				//response.sendRedirect("login.jsp");
				//out.write("<html>");
				//out.write("the code is not working");
				response.setCharacterEncoding("Invalid");
				//response.sendRedirect("login.jsp");
				//out.write("</html>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			out.write("<html>");
			out.write("the code is not working");
			out.write("</html>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
