package model;

import java.util.Date;

public class CreateBlog {

	private String blogTitle;
	private String blogSummary;
	private String blog;
	private String date;
	
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogSummary() {
		return blogSummary;
	}
	public void setBlogSummary(String blogSummary) {
		this.blogSummary = blogSummary;
	}
	public String getBlog() {
		return blog;
	}
	public void setBlog(String blog) {
		this.blog = blog;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
