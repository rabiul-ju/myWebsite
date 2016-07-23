<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.*" %>
 <%@ page import="model.*" %>
 <%@page import="java.sql.*"%>
 <%@page import="java.sql.ResultSet"%>
 <%@ page import="javax.servlet.http.*,javax.servlet.*" %> 
 <%@ page import="java.util.ArrayList,java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="responsee.css" rel="stylesheet" type="text/css" media="all" />
<!--<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />


<!--[if IE 6]><link href="default_ie6.css" rel="stylesheet" type="text/css" /><![endif]-->

</head>
<body>
<div id="page" class="container">
	<div id="header">
		<div id="logo">
			<img src= "images/pic02.JPG" alt="" />
			<h1><a href="#">Munna</a></h1>
			<span>ju-cse20</span>
		</div>
		<div id="menu">
			<ul>
				<li class="current_page_item"><a href="#" accesskey="1" title="">Homepage</a></li>
				<li><a href="#" accesskey="2" title="">Gallary</a></li>
				<li><a href="#" accesskey="3" title="">About Us</a></li>
				<li><a href="#" accesskey="4" title="">Careers</a></li>
				<li><a href="#" accesskey="5" title="">Contact</a></li>
			</ul>
		</div>
	</div>
	<div id="main">
		<div id="banner">
			<!-- - img src="images/pic01.jpg" alt="" class="image-full" />-->
		</div>
		<div id="welcome">
			<div class="title">
				<h2>This all about Rabiul Alam</h2>
				<span class="byline">B.Sc in CSE from Jahangirnagar University</span>
			</div>
			<p>Welcome to my new blog. Here I creating my blog on my own. Some of my working ,life,or anything for inspiration you can get all about from here
			. I think this will help any types of ages people. So, go through this blog and have fun :) </p>
			<ul class="actions">
				<li><a href="#" class="button">Blog by Munna</a></li>
			</ul>
		</div>
	<!-- -here is java code -->
	
	  <%  
        ArrayList<CreateBlog> blog= new ShowingBlogs().selectBlogs();
        Iterator it=blog.iterator();
        while(it.hasNext())
        {
            CreateBlog b=(CreateBlog)it.next();
    %>
	
		
		<div id="featured">
			<div class="title">
				<h2><%=b.getBlogTitle() %></h2>
			</div>
			<ul class="style1">
				<li class="first">
					<p class="date"><a href="#">Jan<b>05</b></a></p>
					<h3><%=b.getBlogSummary() %></h3>
					<p><a href="#"><%=b.getBlog() %></a></p>
				</li>
			</ul>
		</div>
		  <%
        }
    %> 
     
		<div id="copyright">
			<span>All right reserved</span>
			<span>Rabiul Alam Munna</span>
		</div>
	</div>
</div>
</body>
</html>
