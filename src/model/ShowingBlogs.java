package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.DatabaseQuery;

public class ShowingBlogs {
	
	
	public ArrayList<CreateBlog> selectBlogs(){
	DatabaseQuery dbQuery=new DatabaseQuery();
	ResultSet rs= dbQuery.showBlog();
	ArrayList<CreateBlog>blogs=new ArrayList<CreateBlog>();
	//out.print("<html>");
	try {
		while(rs.next()){
			CreateBlog blog=new CreateBlog();
			blog.setBlogTitle(rs.getString(2));
			//out.print("<a>"); out.print(blog.getBlogTitle());out.print("</a>");
			blog.setBlogSummary(rs.getString("blogSummary"));
			blog.setBlog(rs.getString("blog"));
			blog.setDate(rs.getString("date"));
		//	out.println("somthing going.....");
			blogs.add(blog);
		}
		//out.print("</html>");
		
//		request.setAttribute("blogLists",blogs);
//		RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
//		if(rd!=null){
//			rd.forward(request, response);
//		}
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//out.println("somthing going wrong");
		e.printStackTrace();
	}
	return blogs;
	}
}
