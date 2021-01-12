<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>
<body bgcolor="#FFFACD" >
<form name="loginForm" method="POST" action="/student/dashboard" onsubmit="check(this.form)">
<table width="30%" align="center">

<tr>
<td colspan=2><center><font size=4><b>Welcome to Student Login</b></font></center><br></td> <br>
</tr>

<tr>
<td>Email Id:</td>
<td><input type="text" size=25 name="username"></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="Password" size=25 name="password"></td>
</tr>
<br>

<tr>
<td ></td>
<br><td><input type="Reset">  <input type="submit"  value="Login"></td>
</tr>

</table>
</form>
<script language="javascript">
function check(form)
{

if(form.username.value == "" || form.password.value == "")
{

	alert("Please Input Both Username and Password");
	return false;

}}
</script> 

</body>
</html>