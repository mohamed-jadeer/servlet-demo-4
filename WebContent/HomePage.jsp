<html>
	<head>
		<title>Home Page</title>
		<link rel="stylesheet" href="css/bootstrap.min.css">
	</head>
	<body background="home.jpg" style="background-size:100%;">
		<br><br><br>
                <%
                 if( session.getAttribute("stat")==null)
                    {
                    %>
		<form action="log" method="post">
			<p style="color:white;"> Username :<input style="color:black;" type="text" name="uname" required></p>
			<p style="color:white;">Password : <input style="color:black;" type="password" name="pass" required></p>
			<input class="btn btn-primary" type="submit" value="Login">
		</form>
                
                <br/><br/>
		<h3 style="color:white;"> Not Registered Yet </h3>
		<form action="Registration.htm" method="get">
			<input class="btn btn-success btn-lg" type="submit" value="Sign Up">
		</form>
                <% if( session.getAttribute("error")!=null)
               {
                   out.println( session.getAttribute("error"));
                   session.removeAttribute("error");
               }
                   %>
                <%
                    }
                    else
                    {
                        out.println("hello");
                        out.println( session.getAttribute("stat"));
                        %>
                       <form name="logout" action="HomePage.jsp" method="post">
                           <input class="btn btn-success btn-lg" name="abca" type="submit" value="logout">
		</form> 
                        
                        <%    }
          if((request.getParameter("abca"))!=null)

           {     session.removeAttribute("stat");
           response.sendRedirect("HomePage.jsp");
           out.println("hffrto");
           }
                        %>
                
		

<html>