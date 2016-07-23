package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CreateBlog;
import database.DatabaseQuery;

/**
 * Servlet implementation class ShowBlog

@WebServlet("/ShowBlog") */
public class ShowBlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowBlog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		DatabaseQuery dbQuery=new DatabaseQuery();
		ResultSet rs= dbQuery.showBlog();
		ArrayList<CreateBlog>blogs=new ArrayList<CreateBlog>();
		out.print("<html>");
		try {
			while(rs.next()){
				CreateBlog blog=new CreateBlog();
				blog.setBlogTitle(rs.getString(2));
				out.print("<a>"); out.print(blog.getBlogTitle());out.print("</a>");
				blog.setBlogSummary(rs.getString("blogSummary"));
				blog.setBlog(rs.getString("blog"));
				blog.setDate(rs.getString("date"));
				out.println("somthing going.....");
				blogs.add(blog);
			}
			out.print("</html>");
			
//			request.setAttribute("blogLists",blogs);
//			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
//			if(rd!=null){
//				rd.forward(request, response);
//			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println("somthing going wrong");
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
