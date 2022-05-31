<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
    <%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<%! String name;
String location;
String email;
String password,repassword;
String contact;
int x=0;
Connection con=null;
PreparedStatement st = null;
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-up Response</title>
<style type="text/css">
body{
font-style: bold;
}
</style>
</head>
<body bgcolor="lightblue">
<%
name = request.getParameter("name");
password= request.getParameter("password");
repassword = request.getParameter("repassword");
contact = request.getParameter("contact");
email = request.getParameter("email");

if( password !=null &&  password !=""){
	if(password.equalsIgnoreCase(repassword)){
	try{
	try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception se){
			se.printStackTrace();
		}
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		st = con.prepareStatement("insert into ordersite values(?,?,?,?,?)");
		st.setString(1, name);
		st.setString(2, password);
		st.setString(3,email);
		st.setString(4,contact);
		st.setString(5,location);
		x = st.executeUpdate();
		if(x>0){
			out. println("Registration Completed Successfully");
		}else{
			out. println("Registration  Failed");
		}
	}catch(Exception e){
		out.println(e);
		e.printStackTrace();
	}
	}
}else if(name=="" || password == "" || contact == ""|| email ==""){
out.println("Please provide Correct details to Signup,columns should not be null");
	response.sendRedirect("Signup.jsp");
	
}else if(name==null || password == null || contact == null|| email ==null){
	out.println("Please provide Correct details to Signup,columns should not be null");
	response.sendRedirect("Signup.jsp");
}
%>

<h2 style="color:tomato;">User Selected Product Delivery Service-Hyderbad</h2>
<h3 style="color:blue;">Organized by State Governament of Telangana</h3>
<h4 style="color:red;">The Best We Provide</h4><hr>
<h3>
Click here to go to Sign In Page :  <a href="Signin.jsp">Sign- in</a>
</h3>
<h2 style="color:green;"> Thank You So much</h2>
</body>
</html>