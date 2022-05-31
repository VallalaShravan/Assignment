<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-up Page</title>
<style type="text/css">
form{
text-align: center;
line-height: 25px;
}
</style>
</head>
<body bgcolor="lightyellow">
<form action="responsesignup.jsp" method="post">
<table><tr>
<td><label>Full Name : </label></td>
<td><input name="name" type="text"/></td></tr>
<tr>
<td><label>Contact  : </label></td>
<td><input name="contact" type="text"/></td></tr>
<tr>
<td><label>Email : </label></td>
<td><input name="email" type="email"/></td></tr>
<tr>
<td><label>Password : </label></td>
<td><input name="password" type="text"/></td></tr>
<tr>
<td><label>Re -Enter Password : </label></td>
<td><input name="repassword" type="text"/></td></tr>

<tr>
<td><label>Location : </label></td>
<td><input name="location" type="text"/></td></tr>

<tr>

<td><input value="Signup" type="submit"/></td></tr>
</table>
</form>

</body>
</html>