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
			<img src="images/pic02.jpg" alt="" />
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
				<h2>Welcome to Admin login<br><br></h2>		
			
				<form method="get" name="login" action="/myWebsite/Login">
					<h3>username: <input name="username" type="text"></input></h3><br>
					<h3>password: <input name="password" type="password"></input><br><br>
					<input value="login" type="submit"></input></h3>

				</form>
					<% if(request.getParameter("login")=="invalid")
					{System.out.println("Invalid Login");}%>
			</div>
		</div>
		<div id="copyright">
			<span>All right reserved</span>
			<span>Rabiul Alam Munna</span>
		</div>
	</div>
</div>
</body>
</html>
