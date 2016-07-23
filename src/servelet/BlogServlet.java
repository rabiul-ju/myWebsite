package servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DatabaseQuery;
import model.CreateBlog;

/**
 * Servlet implementation class BlogServlet
 
@WebServlet("/BlogServlet")*/
public class BlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlogServlet() {
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
		PrintWriter out=response.getWriter();
		
		CreateBlog blog=new CreateBlog();
		blog.setBlogTitle(request.getParameter("blogTitle"));
		blog.setBlogSummary(request.getParameter("blogSummary"));
		blog.setBlog(request.getParameter("blog"));
		blog.setDate(request.getParameter("date"));
		
		DatabaseQuery dbQuery=new DatabaseQuery();
		String message=dbQuery.createBlog(blog);
		
		out.print("<html>");
		out.print(message);
		out.print("</html>");
	}

}
